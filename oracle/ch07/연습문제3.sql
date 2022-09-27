select * from hr.jobs;
select * from hr.job_history;
select * from hr.employees;
select * from hr.departments;

-- HR스키마를 사용하여 아이디가 114번인 직원의 직업과 직업이력을 조인을 해서 아래 결과처럼 보이도록 쿼리문 작성 (Career Period X)
select E.employee_id, concat(E.first_name,E.last_name) as name,E.phone_number,round((J.max_salary / J.min_salary),1)as "Career Period",J.job_title
    from hr.jobs J
        inner join hr.job_history H
            on J.job_id = H.job_id
        inner join hr.employees E
            on H.employee_id = E.employee_id
    where E.employee_id = 114;
    
-- HR스키마를 사용하여 부서별 급여 순위를 구하는 쿼리문 
select J.job_id, rank() over(partition by J.job_id order by E.salary desc ) as 순위 ,E.first_name, E.salary
    from hr.employees E
        inner join hr.jobs J
            on E.job_id = J.job_id
    order by E.job_id;
    
-- HR스키마를 이용하여 직원이 없는 부서의 수를 출력
select count(*) as "직원이없는부서" from(
select manager_id from hr.departments where manager_id is null);