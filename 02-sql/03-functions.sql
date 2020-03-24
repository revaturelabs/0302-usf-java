--functions
----scalar and aggregate
--aggregate
-----works with a group of data
-----average, sum, min, max
--scalar
-----works with a single piece of data
-----toUppercase


--aggregate
select * from "Album";
select count(*) from "Album";
select "ArtistId" from "Album";
select distinct("ArtistId") from "Album" order by "ArtistId" desc;
select count(distinct("ArtistId")) from "Album";

--scalar
select floor(5.8);
select round(5.8);
select abs(-111);


--string concatenation
select 'str'||'ing';
select concat('str','ing');
select 'hello world' as hello;




