--1 to many relationship
drop table customer;
drop table orders;

select * from customer;
select * from orders;
select * from address;
select * from products;
select * from ordered_products;


create table customer(
	id integer primary key,
	name text
	);

create table orders(
	order_number integer primary key,
	customer_id integer,
	contents text,
	foreign key (customer_id) references customer(id)
	);
	

---one to one relationship

create table address(
	address_id integer primary key,
	customer_id integer unique references customer(id),
	address text 
);

--many to many relationship

-- 1 customer many products many addresses

create table products(
	product_id integer primary key,
	product_name text
	--foreign key(product_name) references orders(contents)
);


create table ordered_products(
	order_id integer references orders(order_number),
	product_id integer references products(product_id)	
);

--fill the tables
begin;
	insert into customer values (1, 'Levar');
	insert into orders values(1,1,'shoes');
	insert into address values(101,1, 'Main st');
	savepoint Firstsave;
	insert into products values(202,'adidas');
	insert into ordered_products values(1,202);
rollback;
commit;
	
insert into customer values (2,'robert'),(3,'andre'),(4,'well get there');

select * from customer;

--delete levar

delete from orders where customer_id = 1;
delete from ordered_products where order_id = 1;
delete from customer where id = 1;
delete from address where address_id = 101;
	select * from customer;

insert into address values (2,2,'elms');
delete from customer where id=2;
