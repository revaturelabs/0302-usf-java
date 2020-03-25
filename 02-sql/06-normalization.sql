-----------------normalization----------------------
--there are many normal forms
--there are 7 at this time, but we mainly deal with the first three.

--first normal form (1NF)
----each row of data must have a unique identifier (primary key)
----each row must have atomic values (break up into smaller pieces)

--second normal form (2NF)
----must be in 1NF
----any non key field should be dependent on the primary key (no partial dependencies)
----if the table has no composite key, then its already in 2NF

--third normal form (3NF)
----must be in 2NF
----no transitive dependencies

--- the first three normal forms are known as the Boyde-Codd normal forms
--- the key, the whole key, nothing but the key, so help me Codd





insert into address values (3, 4, 'main st 1123 77565 califorina sanjose,');
--atomic values
create table new_address (
	id integer primary key,
	house_number integer,
	street_name text,
	unit_number integer,
	city text,
	state text,
	zipcode integer,
	country text
);

insert into new_address values (1, 123, 'bruce b downs blvd', 300, 'Tampa','FL',33617, 'US');
select * from new_address;

select count(*) from new_address where state = 'FL';

--no partial dependencies
create table cus_add (
	cus_id integer primary key,
	add_id integer primary key,
	name text,
	street text
)


--no transitive dependencies
create table room (
	room_number integer primary key,
	square_foot integer,
	room_capacity integer
);




