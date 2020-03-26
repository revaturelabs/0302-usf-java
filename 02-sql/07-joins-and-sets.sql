--------------join together and sing about databases----------------
-----sql joins
--we have a few different kinds of joins
----inner join, outer join->left outer, right outer, full outer
----we also have self join and cross, or cartesian, join

select * from "Album";
select * from "Artist";

--right outer join
select * from "Album" right join "Artist" on "Album"."ArtistId" = "Artist"."ArtistId";

select "Title", "Name" from "Album" right join "Artist" 
	on "Album"."ArtistId" = "Artist"."ArtistId";

select "Name" from "Album" right join "Artist" on 
	"Album"."ArtistId" = "Artist"."ArtistId" where "Title" is null;
	
--left outer join
select * from "Album" left join "Artist" on "Album"."ArtistId"="Artist"."ArtistId";

--inner join
select * from "Album" inner join "Artist" on "Album"."ArtistId"="Artist"."ArtistId";
--still inner join
select * from "Album" join "Artist" on "Album"."ArtistId" = "Artist"."ArtistId";
--easier inner join
select * from "Album"a join "Artist"b on a."ArtistId"=b."ArtistId";
--unfortunately the easiest inner join, wish it was less :(
select * from "Album"a,"Artist"b where a."ArtistId"=b."ArtistId";

--self join
select * from "Album"a, "Album"b where a."AlbumId"=b."ArtistId";

select * from "Employee"a, "Employee"b where a."ReportsTo"=b."EmployeeId";

--join on join on join
select * from "Track"a join "Album"b on a."AlbumId"=b."AlbumId" join "Artist"c 
	on b."ArtistId" = c."ArtistId";

--cross join
select * from "Album"a cross join "Artist"b;
select count(*) from "Album"a cross join "Artist"b;

select * from "Album"a full outer join "Artist"b on a."ArtistId"=b."ArtistId";

--set operators
--union, union all, minus, intersect
select "AlbumId" from "Album" union select "Name" from "Artist";
----------------training schema
create table a(
	numba integer
);

create table b(
	numbee integer,
	bename text
);

insert into a values (1),(2),(3);
insert into b values (2,'hey'),(3,'is'), (4,'for'),(5,'horses');
--union all
select numba from a union all select numbee from b order by numba;
select numba as numbers from a union all select numbee from b order by numbers;

select bename from b;

--union
select numba from a union distinct select numbee from b order by numba;
--union and union distinct are the same thing


create table c(
	numc integer,
	name text
);

insert into c values (3,'horses'),(5,'hey');
insert into c values (4,'for');

select * from b union all select * from c;
select * from b union distinct select * from c;


--minus
select numba from a except select numbee from b;
select numbee from b except select numba from a;

--intersect
select numba from a intersect select numbee from b;

