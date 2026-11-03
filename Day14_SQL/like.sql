create database companydb;
use companydb;

create table employees (
    empid int,
    empname varchar(30),
    city varchar(30),
    salary int
);
insert into employees values
(101,'Arun','London',25000),
(102,'Abi','Chennai',30000),
(103,'Ravi','Madurai',28000),
(104,'Anu','Mumbai',35000),
(105,'Bala','Coimbatore',32000),
(106,'Kiran','Delhi',40000),
(107,'Aarthi','Bangalore',27000),
(108,'Priya','Salem',29000);
select * from employees;


select * from employees
where empname like'A%';

select * from employees
where empname like '%i';

select * from employees
where empname like '%a%';

select * from employees
where empname like 'A%i';

select * from employees
where empname like '_a%';

select * from employees
where empname like '___';

select * from employees
where empname like 'A__%';

select * from employees
where city like'%on%';

select * from employees
where city like 'M%' or city like 'C%';

select * from employees
where city like 'Salem';