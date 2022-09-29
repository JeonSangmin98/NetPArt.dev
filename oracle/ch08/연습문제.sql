select round(avg(salary),2) from hr.employees;
select salary from hr.employees
    where employee_id = 100;
음
set serveroutput on;
-- 못 풀었
DECLARE
    aNum number(8);
BEGIN
    select round(avg(salary),2) into aNum
        from hr.employees;
    IF 24000 >= aNum then
        dbms_output.put_line('당신의 월급은 평균 월급인 ' || avg || '보다 높네요.');
    ELSE
        dbms_output.put_line('당신의 월급은 평균 월급인 ' || avg || '보다 낮네요.');
    END IF;
END;

select hire_date from hr.employees where employee_id = 200;