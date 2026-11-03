CREATE DATABASE faceprep1;

USE faceprep;

CREATE TABLE student(
    id INT,
    name VARCHAR(20)
);
set sql_safe_updates=0;

INSERT INTO student VALUES(101, "ishu");

SELECT * FROM student;

ALTER TABLE student DROP COLUMN name;
SELECT * FROM student;

alter table student rename column id to rollno;
alter table student rename to studentinfo;
alter table studentinfo add name varchar(20);
alter table studentinfo add age int;
alter table studentinfo add constraint checkage check(age>=18);
SELECT * FROM studentinfo;
INSERT INTO studentinfo VALUES(102, "ishu",18);

drop table if exists student;
truncate table studentinfo;
SELECT * FROM studentinfo;

insert into studentinfo values
(102, "ishu", 18),
(103, "Rani", 20),
(104, "Priya", 19),
(105, "Abi", 21);


update studentinfo
set name='iswarya',age=20
where rollno=102;

SELECT * FROM studentinfo;
alter table studentinfo add examdate int;
update studentinfo 
set examdate=2;
SELECT * FROM studentinfo;
delete from studentinfo 
where rollno=102;
SELECT * FROM studentinfo;

select min(rollno)
from studentinfo;
select max(rollno)
from studentinfo;
SELECT COUNT(*)
FROM studentinfo;
SELECT sum(age)
FROM studentinfo;
SELECT avg(age)
FROM studentinfo;

INSERT INTO studentinfo VALUES(106, "Ranii", 19,4);

select min(age)
from studentinfo
where rollno=104;

select max(age)
from studentinfo
where rollno=104;

select count(age)
from studentinfo
where  rollno>=103;


select count(*) as `Number of records`
from studentinfo;

select count(*) as `Number of records`,examdate
from studentinfo
group by examdate;

select sum(age)
from studentinfo
where examdate=2;

select sum(age) as total
from studentinfo;

select rollno, sum(age) as `Total Age`
from studentinfo
group by rollno;

select sum(age * 10) as total
from studentinfo;

select avg(age) as `average age`
from studentinfo;

select* from studentinfo
where age > (select avg(age) from studentinfo);

SELECT * FROM studentinfo;