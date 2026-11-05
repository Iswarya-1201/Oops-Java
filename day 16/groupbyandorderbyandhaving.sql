CREATE DATABASE ORG123;
SHOW DATABASES;
USE ORG123;

CREATE TABLE Worker (
 WORKER_ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 FIRST_NAME CHAR(25),
 LAST_NAME CHAR(25),
 SALARY INT(15),
 JOINING_DATE DATETIME,
 DEPARTMENT CHAR(25)
);

INSERT INTO Worker 
 (WORKER_ID, FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
  (001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
  (002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
  (003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
  (004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
  (005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
  (006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
  (007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
  (008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin');
  
  select * from Worker where SALARY > 100000;
  select * from Worker where SALARY <= 90000;
  select * from Worker where SALARY >= 300000;
  
select * FROM Worker where DEPARTMENT='HR' AND SALARY > 100000;
select * FROM Worker where DEPARTMENT='Admin' OR DEPARTMENT = 'Account';
select * FROM Worker where not DEPARTMENT='HR';
  
select * from Worker where DEPARTMENT in('HR', 'Admin', 'Account');
select * from Worker where SALARY between 80000 and 300000;
select * from  Worker where FIRST_NAME like 'V%';
select * from  Worker where LAST_NAME like'%a';


select * from Worker ORDER BY WORKER_ID DESC;
select * from  Worker ORDER BY WORKER_ID ASC;

select DEPARTMENT, SUM(SALARY) AS TOTAL_SALARY
from Worker
group by DEPARTMENT
order by TOTAL_SALARY DESC;
select DEPARTMENT, AVG(SALARY) AS AVG_SALARY
from Worker
group by DEPARTMENT
order by AVG_SALARY ASC;

SELECT DEPARTMENT, COUNT(*) as TOTAL_WORKERS
from Worker
group by DEPARTMENT
ORDER BY TOTAL_WORKERS desc;

SELECT DEPARTMENT, MIN(SALARY) as MIN_SALARY
from Worker
group by DEPARTMENT
order by MIN_SALARY asc;

select DEPARTMENT,
COUNT(*) as TOTAL_WORKERS,
MAX(SALARY) as MAX_SALARY,
MIN(SALARY) as MIN_SALARY
from Worker
group by DEPARTMENT;

select DEPARTMENT,
sum(SALARY) as TOTAL_SALARY,
avg(SALARY) as AVG_SALARY
from Worker
group by DEPARTMENT;

select department,
count(*) as total 
from Worker
group by DEPARTMENT
having count(WORKER_ID) >=2;


