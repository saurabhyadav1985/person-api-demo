drop table if exists person;
create table person (id bigint not null, age integer not null, favourite_color varchar(255), first_name varchar(255), last_name varchar(255), primary key (id));
insert into person (age, favourite_color, first_name, last_name, id) values (35, 'Blue', 'Saurabh', 'Yadav', 1);
insert into person (age, favourite_color, first_name, last_name, id) values (31, 'Pink', 'Sarika', 'Yadav', 2);
insert into person (age, favourite_color, first_name, last_name, id) values (33, 'Green', 'Gauraw', 'Yadav', 3);
insert into person (age, favourite_color, first_name, last_name, id) values (25, 'Black', 'Dummy', 'Dummy', 4);
insert into person (age, favourite_color, first_name, last_name, id) values (20, 'White', 'Dummy2', 'Dummy2', 5);

