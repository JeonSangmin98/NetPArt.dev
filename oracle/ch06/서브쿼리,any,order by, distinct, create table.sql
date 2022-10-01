select * from userTBL;

select * from userTBL where height > 177;

-- SubQuery,하위쿼리 3번 쿼리문과 결과 동일 
select * from userTBL where height > (select height from userTBL where userName = '김경호');

select userName, height from userTBL where height > (select height from userTBL where userName = '김경호');

-- 오류, 하위쿼리의 값이 173,170 두 개의 값을 반환하기 때문에 오류가 남 
select userName, height from userTBL where height >= (select height from userTBL where addr = '경남');
-- any를 사용하면 하위쿼리 값중 하나만 만족하면 되므로 모두 출력 되게 된다.
select userName, height from userTBL where height >= any(select height from userTBL where addr = '경남');
-- any 다음의 하위쿼리와 값이 같음, 즉 '= any' 는 'in'과 동일한 의미 
select userName, height from userTBL where height = any(select height from userTBL where addr = '경남');
-- 하위쿼리 두 값 모두 만족해야하므로 결국 173 이상 값들만 나옴 
select userName, height from userTBL where height >= all(select height from userTBL where addr = '경남');


-- order by : 원하는 순서대로 정렬하여 출력 
select userName, mDate from userTBL order by mDate desc; -- 기본적으로 오름차순이며, 내림차순은 desc를 열 이름 뒤에 적어주면된다

select addr from userTBL order by addr;

-- DISTINCT : 중복 제거
select DISTINCT addr from userTBL;

-- create table ... as select
-- 기본키 왜래키는 복사가 되지 않는다 
select * from buyTBL;
create table buyTBL2 as (select * from buyTBL);
select * from buyTBL2;
create table buyTBL3 as (select userId, prodName from buyTBL);
select * from buyTBL3;

select userId, amount from buyTBL order by userId;

-- userId 별 합계 
select userId, sum(amount) from buyTBL group by userId;
-- 전체 합계 
select sum(amount) from buyTBL;
-- as " " 로 별칭 지정
select userId as "사용자 아이디", sum(amount) as "총 구매 개수" from buyTBL group by userId;
-- 구매액의 총 합 
select userId as "사용자 아이디", sum(amount * price) as "총 구매액" from buyTBL group by userId;

-- avg() 평균
-- min() 최소값
-- max() 최대값
-- count() 행의 개수
-- count(distinct) 행의 개수(중복 제거)
-- stdev() 표준편차
-- variance() 분산

-- 평균 구매 개수
select avg(amount) as "평균 구매 개수" from buyTBL;

-- cast() : cast(숫자 as 변환할_형식), 소수점 조절
select cast(avg(amount) as number(5,3))as "평균 구매 개수" from buyTBL;
-- 사용자 별 평균 구매 갯수 
select userId, cast(avg(amount) as number(5,3))as "평균 구매 개수" from buyTBL group by userId;

-- 가장 큰 키와 작은키
-- 오류 
select userName, max(height), min(height) from userTBL;
-- 원하는 데이터 아님
select userName, max(height), min(height) from userTBL group by userName;
-- 서브쿼리와 조합하여 사용 
select userName, height
    from userTBL
    where height = (select max(height) from userTBL)
        or height = (select min(height) from userTBL);
        
select count(*) from userTBL;
select count(mobile1) as "휴대폰이 있는 사용자" from userTBL;