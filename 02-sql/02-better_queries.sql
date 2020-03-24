--QUERIES

--basic
select * from testing;

--alias
select test_name as name from testing;

insert into testing values 
	(3,'ihfu','gege','geget', false),
	(4,'sdgsgt','dfgegttedh','dshrt',true);
	
--sorting the results

--ascending by default
select * from testing order by id;

--descending
select * from testing order by test_name desc;

--ascending
select * from testing order by test_name asc;

update testing set email = 'sjfusf' where id=3;


-----------------------------------------------------------------
--public schema starting here

--tell psql where to look for the table
select * from training.testing;

select * from "Album";

select * from "Album" where "AlbumId"<=5;
select * from "Album" where "Title" = 'Facelift';
select * from "Album" where "Title" like 'Fac%'; --the '%' is a wildcard for any number of chars
select * from "Album" where "Title" like '%ace____'; --the '_' is a wildcard for a single char


select * from "Album" where "AlbumId">5 and "Title" like 'Fac%';
select * from "Album" where "AlbumId"<5 or "Title" like 'Fac%';
select * from "Album" where "AlbumId" > 5 and "AlbumId" < 10;
select * from "Album" where "AlbumId" between 5 and 10;


--subqueries
--	or nested queries
select * from "Album" where "AlbumId" < 
	(select "AlbumId" from "Album" where "Title" = 'Facelift');









