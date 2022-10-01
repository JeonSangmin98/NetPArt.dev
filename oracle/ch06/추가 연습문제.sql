select * from hr.employees;
select distinct department_id as "부서 번호" 
    from hr.employees 
    order by department_id;

select avg(salary) from hr.employees;
select distinct department_id as "부서 번호", round(avg(salary)) as "평균 급여" 
    from hr.employees 
    group by department_id 
    order by department_id;

select job_id, round(avg(salary)) as "평균 급여", count(job_id) as "직업별직원수" 
    from hr.employees 
    group by job_id 
    order by job_id;

select employee_id, first_name, salary 
    from hr.employees 
    where salary > (select avg(salary) from hr.employees) 
    order by salary;

select employee_id, first_name, salary 
    from hr.employees 
    where salary = (select max(salary) from hr.employees) or 
                    salary = (select min(salary) from hr.employees);
                    
select employee_id, department_id, first_name, salary from hr.employees where department_id = 100;
create table testEmployees as select employee_id, department_id, first_name, salary from hr.employees where department_id = 100;
select * from testEmployees where salary < 8000;
update testEmployees set salary = salary * 1.2 where salary < 8000;
select * from testEmployees;
