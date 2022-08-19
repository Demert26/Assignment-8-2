select * from "Employee" ;


select * from "Employee" where "LastName" = 'King';

select * from "Employee" where "FirstName" = 'Andrew' and  "ReportsTo" isnull;

select * from "Album" order by "Title" desc;


select "FirstName"  from "Customer" order by "City" asc; 

select * from "Invoice" where "BillingAddress"  like 'T%';

select * from "Invoice" where "Total" between 15 and 50;

select * from "Employee" where "HireDate" between '2003-06-01' and '2004-03-01';

insert into "Genre" ("GenreId", "Name") values (26, 'rap');
insert into "Genre" ("GenreId", "Name") values (27, 'oldies');

insert into "Employee" ( "EmployeeId", "LastName","FirstName","Title","ReportsTo","BirthDate","HireDate",
"Address","City","State","Country","PostalCode",
"Phone", "Fax","Email") values (9,	'James', 'Murphy',	'floor worker', 2,	
'1992-02-18 00:00:00.000',	'2012-08-14 00:00:00.000',	'11120 Jasper Ave NW',	'Edmonton',	'AB',	
'Canada',	'T5K 2N1',	'+1 (780) 428-9482 ',	'+1 (780) 428-3457','andrew@chinookcorp.com');

insert into "Employee" ( "EmployeeId", "LastName","FirstName","Title","ReportsTo","BirthDate","HireDate",
"Address","City","State","Country","PostalCode",
"Phone", "Fax","Email") values (10,	'Bucket', 'Wilson',	'Janitor', 10,	
'1962-02-18 00:00:00.000',	'1980-08-14 00:00:00.000',	'11120 Buckwheat Ln NW','Edmonton',	'AB',	
'Canada',	'T5K 2N1',	'+1 (800) 555-9482 ',	'+1 (780) 428-3457','buckwheatforlife@chinookcorp.com');

insert into "Customer" ( "CustomerId", "FirstName", "LastName",
"Address", "City","State","Country","PostalCode",
"Phone","Fax","Email","SupportRepId") values (60,'Alberto', 'Gonzales',
'70, Rue Jouvence',
'Mayo','Ketchup','France', '400028', 
'+33 03 80 73 66 99', '',
'agonzales@gmail.com',10);
update "Customer" set "Company" = ''  where "Company"   = '';
--delete from "Customer" where "Company" = '';
--delete from "Customer" "Fax" = ;

insert into "Customer" ( "CustomerId", "FirstName", "LastName", "Email") values (62,'Nancy', 'Kerrigan', 'nkerrigan@gmail.com');

update "Customer" set "FirstName" = 'Robert' , "LastName" = 'Walter' where "LastName" = 'Mitchell';
update "Artist"  set "Name" = 'CCR' where "ArtistId" = 76;

create database reimbursement;
drop database Reimbursement;
create database pets