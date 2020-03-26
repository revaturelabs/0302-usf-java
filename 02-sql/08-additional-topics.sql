------------------additional topics-----------------------
--views

--when we make a query, we create a view. a view is just a virtual table representing
----our query, it does not create or alter any table in our db. We can save the view
----for later use and query that view, create views off of it, etc.


select * from customer;
create view customers as select * from customer;
select * from customers;
insert into customer values(1, 'harold');
select * from customers order by id;

select * from "Track" where "AlbumId" in (
	select "AlbumId" from "Album" where "ArtistId" in (
		select "ArtistId" from "Artist" where "Name" = 'AC/DC'
	)
);

create view acdc_songs as 
select * from "Track" where "AlbumId" in (
	select "AlbumId" from "Album" where "ArtistId" in (
		select "ArtistId" from "Artist" where "Name" = 'AC/DC'
	)
);

create view acdc_tracks as select "Name" from acdc_songs;

select * from acdc_tracks;


--search path
----the search path determines which schemas to look inside of for tables. when making
----making queries, it will search the current schema, if the relation is not found,
----it go through the search path and check the other schemas to see if it can find 
----the relation. we can change the search path to make psql search through the schemas
----we want it to look through.

--see search path
show search_path;

--change search path
set search_path to public;

--query a table in another schema, not in the search path
select * from training.customer;

--index
-- an index helps psql make queries and other operations more efficient it
----does however, create overhead for the db since it needs to update the
----index anytime something is updated.
create index album_index on "Album"("AlbumId");
select * from "Album";


----------------------table inheritance---------------------
create table papa(
	id integer primary key,
	name text
);

create table child(
	defects boolean
) inherits (papa);

--will query everything that is papa
insert into papa values (1,'paul'),(2,'that guy'), (3,'hairy');
select * from papa;

--will query everything that is a child
--	will not return any of papa table that isnt at the children table
insert into child values (90,'jerry', true),(91,'that kid', true),(92,'louis capaldi', false);
select * from child;

--will only query the papa table
select * from only papa;

--multiple inheritance
create table strange_user() inherits (papa,"Album");
select * from strange_user;



