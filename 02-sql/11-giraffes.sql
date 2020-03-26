create table giraffes (
	id serial primary key,
	name text,
	exists boolean default(false)
);

insert into giraffes (name) values ('greg'),('geena'),('gary'),('george');

select * from giraffes;