-- userTBL에서 height가' userTBL의 mobile1이 011인 height'와 같은 값
select userName, mobile1, height from userTBL where height
    = any(select height from userTBL where mobile1 = '011');
select * from userTBL;

-- userTBL테이블에서 addr의 중복제거 
select DISTINCT addr from userTBL;

select * from buyTBL;
-- buyTBL 테이블에서 총 구매액이 100 초과인 값 
select userId as "사용자", sum(price*amount) as "총 구매액"
    from buyTBL
    group by userId
    having sum(price*amount) > 100;
    
-- sqlDB의 회원 테이블(userTBL)에서 국번(mobile1)을 조회하는 sql을 작성하시오.
-- 단, 중복을 없애고 내림차순으로 정렬하여 출력하시오.
select DISTINCT mobile1 from userTBL order by mobile1 desc;

-- sqlDB의 회원 테이블(userTBL)에서 이름(userName)을 조회하는 sql을 작성
-- 단, 가입일이 느린 순서로 정렬후 상위 2명만 출력.
select * from (select userName from userTBL order by mDate desc) where rownum <= 2;

-- sqlDB로 접속 후 hr스키마의 employees테이블의 employee_id, first_name, last_name을 복사하여
-- sqlDB의 employees테이블로 생성하는 sql문을 한 문장으로 작성.
-- 단, sqlDB의 employees테이블의 열 이름은 id, fName, lName으로 변경.
create table employees as (select employee_id as "id", first_name as "fName", last_name as "lName" from hr.employees);
select employee_id, first_name, last_name from hr.employees;
select * from employees;

-- sqlDB의 구매테이블(buyTBL)에서 다음과 같이 출력
select * from buyTBL;
select userId as "사용자 ID", sum(amount) as "총 구매 개수" from buyTBL group by userID;

-- sqlDB의 구매테이블(byTBL)에서 다음과 같이 평균 구매 개수가 2 이상인 사용자만 출력
select userId as "사용자 ID", avg(amount) as "평균 구매 개수" from buyTBL group by userID having avg(amount)>=2;

-- sqlDB의 구매 테이블(buyTBL)에서 다음과 같이 분류별로 개수에 대한 소합계를 출력
select idNum, groupName, sum(amount) as "개수" from buyTBL group by rollup(groupName,idNum);

-- HR스키마의 employees테이블에서 직원 부서의 아이디를 출력하는 쿼리문
select department_id as "부서 번호" from hr.employees order by department_id;