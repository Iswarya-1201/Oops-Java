create database college;
use college; 

create table department (
    dept_id int primary key,
    dept_name varchar(30)
);
create table Student (
    student_id int primary key,
    student_name varchar(30),
    dept_id int,
    foreign key(dept_id)
        references department(dept_id)
);

insert into department values
(101,'computerscience'),
(102,'electronics'),
(103,'mechanical');

insert into Student values
(1,'Arun',101),
(2,'Priya',102),
(3,'Karthik',101),
(4,'Divya',103);
insert into Student values
(5,'Ravi',105);

select Student.student_name, department.dept_name
from Student
join department
on Student.dept_id = department.dept_id;

delete from department
WHERE dept_id = 101;

delete from Student
where dept_id = 101;

delete from Department
where dept_id = 101;