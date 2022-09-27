select avg(salary) as "IT부서 평균급여"
    from hr.employees where job_id like 'IT%';

select D.department_name, CAST(avg(E.salary) AS NUMBER(8,2)) as "부서별 평균급여"
    from hr.employees E
    inner join hr.departments D
        on E.department_id = D.department_id
        group by D.department_name;
        