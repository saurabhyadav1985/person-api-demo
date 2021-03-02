drop table if exists person;
create table person (id bigint not null, age integer not null, favourite_color varchar(255), first_name varchar(255), last_name varchar(255), primary key (id));
insert into person (age, favourite_color, first_name, last_name, id) values (35, 'Blue', 'Saurabh', 'Yadav', 10001);
insert into person (age, favourite_color, first_name, last_name, id) values (31, 'Pink', 'Sarika', 'Yadav', 10002);
insert into person (age, favourite_color, first_name, last_name, id) values (33, 'Green', 'Gauraw', 'Yadav', 10003);
insert into person (age, favourite_color, first_name, last_name, id) values (25, 'Black', 'Dummy', 'Dummy', 10004);
insert into person (age, favourite_color, first_name, last_name, id) values (20, 'White', 'Dummy2', 'Dummy2', 10005);



