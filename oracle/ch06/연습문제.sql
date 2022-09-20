select * from userTBL;
-- userTBL에서 height가 178,180,182인 사람 / userName, height 출력
select userName, height from userTBL where height in (178,180,182);

-- userTBL 에서 '남'으로 끝나는 addr을 찾아 userName, height 출력
select userName, addr from userTBL where addr like '_남';

-- userTBL에서 height가 170 에서 180 사이의 userName 출력 
select userName from userTBL where height BETWEEN 170 and 180;

-- HR 스키마의 employees 테이블에서 salary가 5000~7000사이의 직원 정보를 출력하는 쿼리문을 작성.
select employee_id, first_name, salary from hr.employees where salary BETWEEN 5000 and 7000;
-- HR 스키마의 employees 테이블에서 manager_id가 121,123인 직원의 정보를 출력하는 쿼리문을 작성.
select manager_id, employee_id, first_name, salary from hr.employees where manager_id in (121,123);