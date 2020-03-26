------------------constraints-----------------------
--constraints are the different rules that we can place on our columns 
----to restrict the input into our tables.
/*
 * different constraints
 * 		not null		column cannot contain null values
 * 		unique			column cannot have duplicate values
 * 		primary key		combination of not null and unique
 * 		check			checks for column values
 * 		default			gives a default value if inserted value is null
 * 		foreign key		
 */

/*
 * different kinds of primary keys
 * 		natural
 * 			has real life meaning outside of db
 * 		surrogate
 * 			does not have real life meaning outside of db
 * 		composite
 * 			a combination of two columns to make a unique composition
 * 
 */

/*
 * multiplicity
 * 		1-1
 * 			put a foreign key in one of the tables and make it unique
 * 		1-m
 * 			put a foreign key in the many table
 * 		m-1
 * 			put a foreign key in the many table
 * 		m-m
 * 			create a junction table with a composite key that points to both tables
 * 
 * 
 */




drop table cars;

--create table cars (
--	id integer not null unique,
--	make text
--	);

--create table cars (
--	id integer primary key, --the same as not null and unique
--	make text,
--	can_run boolean check(true),
--	model text default 'anonymous'
--	);
	
--insert into cars (make) values ('ford'); --not null constraint violation
insert into cars (id) values (1);
select * from cars order by id;

--insert into cars values (1,'chevy'); unique constraint violation
insert into cars values (2,'chevy');
select * from cars order by id;

update cars set make='ford' where id=1;
select * from cars order by id;


insert into cars (id, can_run) values (1,true);
insert into cars (id, can_run) values (2, false);
select * from cars;

------------------------------------------------------------------
drop table cars;
drop table engine;

create table engine (
	serial_number integer primary key,
	power integer,
	model text,	
	cars_id integer references cars(id)
);

select * from engine;
select * from cars;

insert into engine (serial_number, cars_id) values (1,1);
insert into cars (id) values (1);

create table cars (
	id integer primary key, --the same as not null and unique
	make text
	);

/*
 * when we have one record pointing to another, we have a parent-child relationship.
 * 	this is where the child points to the parent. if we want to delete the child,
 * 	we are fine. if we want to delete the parent though, we get an error because
 * 	of referential integrity. so if we want to get rid of the parent, we must first
 * 	get rid of the child.
 * 
 * we can alter the parent and change each child pointing to it and the children of
 * 	them with cascade. this is dangerous.
 */


