use bms;
create table details_tbl(
cid int primary key,
firstname varchar(20),
lastname varchar(20),
street varchar(20),
city varchar(20),
state varchar(20),
zipcode int,
product_name varchar(20),
created_on date,
created_by varchar(20),
updated_on date,
updated_by varchar(20));
commit;
select * from details_tbl;

insert into details_tbl values(1,"bharath","sanga","Lakkaram","Utnur","Telangana",504311,"Laptop",21/10/2021,"mahesh",21/10/2021,"nikhil");