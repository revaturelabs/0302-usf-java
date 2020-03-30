create table giraffes (
	id serial primary key,
	name text,
	exists boolean default(false)
);

insert into giraffes (name) values ('greg'),('geena'),('gary'),('george');

select * from giraffes;

create table users (
	id serial primary  key,
	username text not null unique,
	password text not null,
	firstname text,
	lastname text
);

insert into users (username, password, firstname, lastname) values
	('rolltide','password','robert','connell');
	
select * from users;


create or replace function mult(v1 integer, v2 integer) returns integer as $$
	begin
		return v1*v2;
	end
$$ language plpgsql;

select mult(3,4);

create procedure insertGiraffe(name text, boo boolean)
language sql as $$
	insert into giraffes (name, exists) values ($1, $2);
$$;

call insertGiraffe('gregageous', false);
select * from giraffes;