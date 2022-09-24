-- 연습문제 
create table examTable3 (cId char(2), cNm varchar2(40), region_id number);
insert into examTable3
    select country_id as cId, country_name as cNm, region_id as RId
        from hr.countries;
-- 위 구문을 한 문장으로
create table examTable3 as (select country_id as cId, country_name as cNm, region_id as RId
        from hr.countries);
        
-- sqlDB의 회원테이블(userTBL)에서 지역별로 가입일이 빠른 순으로 정렬
select * from userTBL;
select addr, row_number() over (partition by addr order by mdate) as "지역별 가입일 순위",userName, mdate from userTBL;

-- sqlDB의 회원테이블(userTBL)에서 가입일이 빠른 순으로 정렬한 후 다음 사람과의 가입 일자 차이를 알려줌
-- [힌트 : '-'연산자를 사용하면 날짜1과 날짜2의 차이(날수)를 알려준다.]
select * from userTBL;
select userName, addr, mdate as "가입일", abs(mdate - (lead(mdate,1,mdate) over (order by mdate))) as "가입일자 차이"  
    from userTBL order by mdate;
    
-- 다음 첫번째 테이블(pivotTest)이 두 번째의 피벗 테이블이 되도록 쿼리문을 작성
select * from pivotTest;
select * from pivotTest
    pivot(  sum(amount)
            for uname
            in ('김범수','윤종신') );
            
-- sqlDB의 KBS라는 아이디의 회원이 구매한 물건을 발송하기 위해 아이디, 이름, 물품, 주소, 연락처를 조인한 후 검색하는 쿼리문
select * from userTBL;
select B.userID,U.userName,B.prodName as PRODNA, U.addr as AD, U.mobile1 || U.mobile2 as PHONE
    from buyTBL B
        inner join userTBL U
            on B.userID = U.userID
    where U.userId = 'KBS';
    
-- HR스키마를 사용하여 IT부서의 직원들을 출력하는 쿼리 
select * from hr.employees;
select * from hr.departments;
select E.employee_id, E.first_name, E.phone_number, D.department_name
    from hr.departments D
        inner join hr.employees E
            on E.department_id = D.department_id
    where E.department_id = 60;
    
-- HR스키마를 사용하여 아이디가 114번인 직원의 직업과 직업이력을 조인을 해서 출력
select * from hr.jobs;
select * from hr.job_history;
select * from hr.employees;
select E.employee_id, concat(E.first_name,E.last_name) as name,E.phone_number,salary as "Career Period",J.job_title
    from hr.jobs J
        inner join hr.job_history H
            on J.job_id = H.job_id
        inner join hr.employees E
            on H.employee_id = E.employee_id
    where E.employee_id = 114;