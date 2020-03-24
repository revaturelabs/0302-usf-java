--welcome to databases

--sql structured query language
--we are using postgresql also known as psql
--postgres is an open source sql language for communicating with databases

/*
 * What is data?
 * 	information
 * what is a database?
 * 	something that stores information
 * what is a db table?
 * 	columns and rows of information (a collection of information)
 * columns attributes (fields)
 * rows are individual rows (records, objects)
 * 
 * what is a dbms?
 * 	database management system
 * what is a rdbms?
 * 	relational database management system
 * what is the difference?
 * 	rdbms will hold a relationship to the tables
 * 
 */



/*
 *what are the sublanguages of sql?
 *	sublanguages:
 *		 DML, DCL, TCL, DDL, DQL
 *		DML=DATA MANIPULATION LANGUAGE
 *			DML IS THE SUBLANGUAGE FOR YOUR CRUD OPERATIONS
 *				CREATE READ UPDATE DELETE
 *				THIS WILL MANIPULATE THE DATA INSIDE THE DB
 *				BUT IT DOES NOT ALTER THE STRUCTURE OF THE TABLES
 *			KEYWORDS: INSERT, SELECT, UPDATE, DELETE
 * 		DDL=DATA DEFINITION LANGUAGE
 * 			KEYWORDS: CREATE, ALTER, DROP, TRUNCATE
 * 		DQL=DATA QUERY LANGUAGE
 * 			KEYWORD: SELECT
 * 		TCL=TRANSACTION CONTROL LANGUAGE
 * 			KEYWORDS: COMMIT, ROLLBACK, SAVEPOINT, BEGIN, RELEASE
 * 			DML IS THE ONLY SUBLANGUAGE YOU CAN USE TRANSACTIONS WITH
 * 
*/

--this is dml

--this is how we perform a query
select * from "Album";
--select [column] from [table]
SELECT "Title" from "Album";

--the where clause will allow us to provide a criteria for our query
select "Title" from "Album" where "AlbumId" = 348;

--insert into [table] ([columns]) values ([values])
insert into "Album" ("AlbumId", "Title", "ArtistId") values 
	(348, 'this is a string in psql', 1);

--if inserting into all columns, you can omit specifying the columns
insert into "Album" values (349, 'this is a string in psql', 1);

---update
--update [table] set [column] = [new value] where [criteria]
update "Album" set "Title" = 'this is a new value' where "AlbumId" = 348;
select "Title" from "Album" where "AlbumId" = 348;

--delete
--delete from [table] where [criteria]
delete from "Album" where "AlbumId" = 348;

select "Title" from "Album" where "AlbumId" = 349;
select "Title" from "Album" where "AlbumId" < 348; -- =, <, >, <=, >=
select "Title" from "Album" where "AlbumId" != 348;
select "Title" from "Album" where "AlbumId" <> 348;

--------------------------------------------------------------------

--DDL
create schema training;

create table testing (
	/*
	 * Numeric
	 * 		integer
	 * 		floating point
	 * 		serial
	 * Characters
	 * 		char
	 * 		varchar
	 * 		text
	 * Boolean
	 * date/time
	 */

	--col_name col_type
	id integer,
	test_name char(25),	--with char and varchar you have to specify the amount of characters
							--it can hold
	email varchar(25),
	password text,		--with text, it will vary and depend on the input given
	test boolean
);

select * from testing;

insert into testing values (1, 'hey remote', 'can you hear me?', 'maybe', true);

select test_name from testing;

--alias
select test_name as funky_name from testing;

--alter
--alter table [table] [alteration]
alter table testing add column new_col float;
alter table testing drop column new_col;

--truncate will empty the table
truncate table testing;
select * from testing;

--drop will get rid of the entire table
drop table testing;
select * from testing;

------------------------------------------------------------------

--tcl

begin;
	insert into testing values (1,'fghuer','sjfh','sugghj',false);
rollback;
commit;

delete from testing where id=1;

begin;
	insert into testing values (3,'odfng','sgreg','ger',true);
	savepoint first_save;
	delete from testing where id=1;
	release savepoint first_save;
	rollback to savepoint first_save;
commit;

select * from testing;





