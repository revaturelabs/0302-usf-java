-------------------------PLPGSQL----------------------------
--PLSQL= procedural language sql
----it is an extension to sql
--PLPGSQL = procedural language postgresql
--psql= postgresql
--psql supports multiple languages for their plsql
----PLPGSQL
----C
------multiple more extensions
----Perl
----Python
----Ruby
----R
----and many more


--functions in psql
-- create [or replace] function [name] (params types) returns [type] as '
--	begin
--		body
--	end
--'
--language plpgsql;

----language plpgsql
create or replace function mult(val1 integer, val2 integer) returns integer as '
	begin
		return val1*val2;
	end
'
language plpgsql;

select mult(2,2);
--------------------------------------------------------------------------------------

create or replace function multandcat(val1 integer, val2 integer) returns text as $multandcat$	
	begin
		return val1*val2||'have a nice day';
	end
$multandcat$ language plpgsql;

select multandcat(4,4);
		

select (5*5||'hello');
select concat(5*5,'hello');
----------------------------------------------------------------------------------------
--overload mult with 3 params
--there are 3 different kinds of params: in, out, inout
----in parameter: value is read, but not changed or returned
----out parameter: value is changed and returned, but not taken in and read
----inout paramter: a value is taken in, changed, and returned
create or replace function mult(val1 integer, val2 integer, val3 integer) returns integer as $$ 
	begin 
		return $1*$2*$3; --another way to access parameters inside the function body
	end
$$ language plpgsql;

select mult(2, 42, 42);
--holy crap this works
select (5*'5');
------------------------------------------------------------------------------------------
--how to declare a variable inside a function

create or replace function get_largest() returns text as $$
	declare
		largest integer;
		track_name text;
		result text;
	begin
		select max("TrackId") into largest from "Track";
		select "Name" into track_name from "Track" where "TrackId" = largest;
		result := track_name||largest; --assignment operator and concatenation
		return result;
	end
$$ language plpgsql;

select get_largest();
select * from "Track" order by "TrackId" desc;
-----------------------------------------------------------------------------------
--anonymous functions
----always returns void
do $$
declare
		largest integer;
		track_name text;
		result text;
	begin
		select max("TrackId") into largest from "Track";
		select "Name" into track_name from "Track" where "TrackId" = largest;
		result := track_name||largest; --assignment operator and concatenation
		insert into training.b values (largest, result);
	end
$$ language plpgsql;

select * from training.b;

-----------------------------------------------------------------------------------------
--return multiple values (return a table)
create or replace function get_numbers_from_a()
returns table(col integer) as $$
	begin
		return query select "TrackId" as col from "Track";
	end
$$ language plpgsql;

select get_numbers_from_a();
-----------------------------------------------------------------------------------------
--stored procedure, does not return a value
create or replace procedure insert_numbers(n1 integer, n2 integer)
language sql as $$
insert into training.a values (n1),(n2);
$$

call insert_numbers(22,33);
select * from training.a order by numba;
-----------------------------------------------------------------------------------------
--triggers
----a trigger will call a function when some event happens

create table colors(
	id integer primary key,
	color text
);

insert into colors values (1,'blue'),(2,'red'),(3,'green'),(4,'grey');

select * from colors order by id;
update colors set color='blue' where id=4;

--tg_op = trigger operations, holds information about what is currently happening
create function no_more_blues() returns trigger as $$
	begin
		if(tg_op = 'insert') then 
			if(upper(new.color)='BLUE') then 
				return null;
			end if;
		end if;
		if(upper(new.color)='BLUE') then
			return old;
		end if;
	return new;
	end
$$ language plpgsql;

create trigger no_blues							--create trigger [name]
	before insert or update on colors		--[before|after|instead of] [insert|update|delete]
													--on table
	for each row								--for each [row|statement]
	execute function no_more_blues();			--execute  [function name|procedure name]










