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
		

select (5*5+'hello');
----------------------------------------------------------------------------------------











