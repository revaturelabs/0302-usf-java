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






