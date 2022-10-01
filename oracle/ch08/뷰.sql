-- 뷰 생성
create or replace view v_userTBL    -- replace : 덮어 쓰기
as
    select U.userId as "USER ID", U.userName as "USER NAME", B.prodName as "PRODUCT NAME", 
            U.addr, U.mobile1 || U.mobile2 as "MOBILE PHONE" 
        from userTBL U
            inner join buyTBL B
                on U.userId = B.userId;
                
-- 뷰 이름으로 복잡함 쿼리문 조회 가능
select * from v_userTBL;    
-- 별칭으로 조회(띄어쓰기는 비추천,별칭은 간단하게)
select "USER ID", "USER NAME" from v_userTBL;

-- 뷰 조회
select * from user_views;
-- 뷰 삭제
drop view v_userTBL;

create or replace view v_userTBL
as
    select userID, userName, addr from userTBL;
select * from v_userTBL;
select * from user_views;

-- 뷰 데이터 수정
update v_userTBL set addr = '부산' where userID = 'JKW';
-- 뷰 데이터 입력
insert into v_userTBL(userID, userName, addr) values('KBM','김병만','충북');     -- 오류 , birthYear이 not null이기 때문
desc USERTBL;

-- 읽기 전용 뷰
create or replace view v_userTBL
as
    select userID, userName, addr from userTBL
    with read only;
update v_userTBL set addr = '태국' where userID = 'SSK';      -- 읽기 전용 뷰 라서 DML문(update/insert/delete) 사용 불가

-- 그룹 함수를 포함하는 뷰
create or replace view v_sum
as
    select userId, sum(price * amount) as "Total"
        from buyTBL
        group by userId;
select * from v_sum;

insert into v_sum values('BAD',1000);   -- 데이터 수정 불가, 가상 열이 뷰를 통해서 데이터 변경 할 수 없음

-- 키가 177 이상인 뷰 생성
create or replace view v_height177
as
    select * from userTBL where height >= 177;
select * from v_height177;
-- v_height177뷰 에서 177 이하 데이터 삭제
delete from v_height177 where height < 177; -- 0개행 삭제, 177 미만이 없기 때문
insert into v_height177 values('KBM','김병만',1977,'경기','010','5555555',158,'2019-01-01');
-- 뷰가 아닌 직접 userTBL을 확인해야 보인다
select * from userTBL;
create or replace view v_height177
as
    select * from userTBL where height >= 177 with check option;
insert into v_height177 values('WDT','서장훈',1977,'경기','010','5555555',155,'2019-01-01'); -- 177미만은 입력되지 않고 177이상 데이터만 입력

create or replace view v_userTBL
as
    select U.userId, U.userName, B.prodName, U.addr, U.mobile1 || U.mobile2 as mobile
        from userTBL U
            inner join buyTBL B
                on U.userId = B.userId;
select * from v_userTBL;

insert into v_userTBL values('PKL','박경림','운동화','경기','00000000000');     -- 두개 이상의 테이블이 조인된 뷰는 업데이트 할 수 없다

select * from user_views;

drop table userTBL cascade constraints; -- cascade constraints 제약조건 상관없시
select * from v_userTBL;    -- 참조 테이블이 없기 때문에 조회할 수 없음