--question 1
create table if not exists table1 (id integer, value integer); 

insert into table1 values(1,-56);
insert into table1 values(2,76);
insert into table1 values(3,-84);
insert into table1 values(4,96);
insert into table1 values(5,-47);

update table1 set value = (value*-1);

--question 2
drop table if exists table2; 
create table if not exists table2 ("Division id" integer, Year integer, Revenue integer);

insert into table2 values(1,2018,60);
insert into table2 values(1,2021,40);
insert into table2 values(1,2020,70);
insert into table2 values(2,2021,-10);
insert into table2 values(3,2018,20);
insert into table2 values(3,2016,40);
insert into table2 values(4,2021,50);

select "Division id" from table2 where revenue > 0 and year = 2021;

--question 3
drop table if exists table3;
create table if not exists table3(id integer, year integer);

insert into table3 values(1,1776);
insert into table3 values(2,2001);
insert into table3 values(3,1643);
insert into table3 values(4,1865);
insert into table3 values(5,1969);

--select * from table3 where values = year/100;
select year, year/100 + 1 as "Century" from table3;

--question 4
drop table if exists table4;
create table if not exists table4(id integer, Value integer);

insert into table4 values (1,4);
insert into table4 values (2,11);
insert into table4 values (3,57);
insert into table4 values (4,24);
insert into table4 values (5,47);

--select value, case when value % 2 = 0 then ‘even’ when value % 2 = 1 then ‘odd’ end as  even_odd from table4; 
select case when value % 2 = 0 then 'even' when value % 2 = 1 then 'odd'
end as even_odd from table4;

--select * from table4 where mod(value,2) = 0;
--(select cast(mod(value,2) from table4 as varchar(10)) as even; 
----mod(value,2) from table4)
--intersect
--(select cast ()
--

--intersect
--(update table4 set value = even where value = 0);
 
--Question 5

drop table if exists table5;
create table if not exists table5(id integer, name varchar(50), age integer);

insert into table5 values (1,'Bob',21);
insert into table5 values (2,'Sam',19);
insert into table5 values (3,'Jill',18);
insert into table5 values (4,'Jim',21);
insert into table5 values (5,'Sally',19);
insert into table5 values (6,'Jess',20);
insert into table5 values (7,'Will',21);

--select occupation, avg(salary) 
--from person group by occupation having avg(salary) > 500;
--select occupation, count(salary) from person group by occupation;
select age, count(age=age) from table5 group by age order by age;

--question 6

drop table if exists table6;
create table if not exists table6(id integer, name varchar(50));

insert into table6 values(1,'Bob');
insert into table6 values(2,'Sam');
insert into table6 values(3,'Jill');
insert into table6 values(4,'Jim');
insert into table6 values(5,'Sally');
insert into table6 values(6, 'Jess');
insert into table6 values(7, 'Will');

select id, name, concat ('Hi, ', name , '! How are you today?') as Greeting from table6;

--select case when id between 1 and 7 then select'hi insert name! How are you today' 
--end as Greeting from table6;

--select name from table6 where id >= 1 then as Greeting;
--Question 7

drop table if exists table7;
create table if not exists table7(id integer, name varchar(50), "amount sold" integer);

insert into table7 values(1, 'cup', 11);
insert into table7 values(2, 'saucer', 22);
insert into table7 values(3, 'plate',46);
insert into table7 values(4, 'fork', 34);
insert into table7 values(5, 'spoon', 45);
insert into table7 values(6, 'knife', 78);
insert into table7 values(7, 'mug',23);
insert into table7 values(8, 'glass', 64);
insert into table7 values(9, 'tumbler', 24);

select * from table7 order by "amount sold" desc limit 5;

--Question 8
drop table if exists table8;
create table if not exists table8(id integer, name varchar(50), country varchar(50));

insert into table8 values(1, 'Bob Smith', 'United States');
insert into table8 values(2, 'Jim Jones', 'China');
insert into table8 values(3, 'Sam White', 'Japan');
insert into table8 values(4, 'Jess Black', 'Canada');
insert into table8 values(5, 'Will Wilson', 'Germany');
insert into table8 values(6, 'Wilson Scott', 'England');
insert into table8 values(7, 'Scott Daniels', 'France');
insert into table8 values(8, 'Daniel Jackson', 'Canada');
insert into table8 values(9, 'Jack Johnson', 'United State');

select * from table8 where not country = 'United States' and not country = 'Canada';

--Question 9
drop table if exists table9;
create table if not exists table9(id integer, Name varchar(50), Age integer);

insert into table9 values(1, 'Bob', 21);
insert into table9 values(2, 'Sam', 19);
insert into table9 values(3, 'Jill', 18);
insert into table9 values(4, 'Jim', 21);
insert into table9 values(5, 'Sally', 19);
insert into table9 values(6, 'Jess', 20);
insert into table9 values(7, 'Will', 21);


select distinct age from table9 order by age;

--Question 10

drop table if exists table10;
create table if not exists table10(id integer, Name varchar(50), Age integer);

insert into table10 values(1, 'Bob', 21);
insert into table10 values(2, 'Sam', 19);
insert into table10 values(3, 'Jill', 18);
insert into table10 values(4, 'Jim', 21);
insert into table10 values(5, 'Sally', 19);
insert into table10 values(6, 'Jess', 20);
insert into table10 values(7, 'Will', 21);

select sum(age) from table10;







