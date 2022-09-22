-- 대량의 샘플 데이터 생성
-- hr.employees의 데이터를 가져와서 입력
create table testTBL4 (empID number(6), FirstName varchar2(20), LastName varchar2(25), Phone varchar2(20));
insert into testTBL4 
    select employee_id, first_name, last_name, phone_number
        from hr.employees;
        
-- 테이블의 정의까지 생략하고 싶다면 
create table testTBL5 as
    (select employee_id, first_name, last_name, phone_number
        from hr.employees);
        
select count(*) from testTBL5;