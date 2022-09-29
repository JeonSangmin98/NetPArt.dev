-- 기존 테이블 삭제
drop table buyTBL;
-- 왜래키 제약 조건의 기준테이블을 원칙적으로 삭제 불가
drop table userTBL cascade constraints;
drop sequence idSEQ;

create table userTBL    -- 회원테이블
(   userID      char(8),       -- 사용자 아이디(PK)
    userName    nvarchar2(10), -- 이름
    birthYear   number(4),     -- 출생연도
    addr        nchar(2),      -- 지역
    mobile1     char(3),           -- 휴대폰의 국번
    mobile2     char(8),           -- 휴대폰의 나머지 전화번호
    height      number(3),         -- 키
    mDate       date               -- 회원 가입일
);

-- null 값 허용
insert into userTBL(userID,userName,mobile1) values('MGG','마징가',null);
insert into userTBL(userID,userName,mobile1) values('MKD','메칸더','');
insert into userTBL(userID,userName,mobile1) values('JJK','짱가',' ');

-- alter table 사용하여 default 지정
alter table userTBL
    modify birthYear default -1;
alter table userTBL
    modify addr default '서울';
alter table userTBL
    modify height default 170;

-- default
insert into userTBL values('LHL','이혜리',default,default,'011','12345',default,'2019.12.12');
insert into userTBL(userID,userName) values('KAY','김아영');
insert into userTBL(userID) values('Test'); -- not null 인항목은 어떤 값이든 들어가 있어야됨
insert into userTBL values('WB','원빈',1982,'대전','019','67890',176,'2020.5.5');
select * from userTBL;

-- 기본키 제약 조건
alter table userTBL
    add constraint PK_userTBL_userID 
    primary key(userID);

create table buyTBL     -- 구매테이블
(   idNum       number(8),     -- 순번(PK)
    userID      char(8),       -- 아이디(FK)
    prodName    nchar(6),      -- 물품명
    groupName   nchar(4),          -- 분류
    price       number(8),         -- 단가
    amount      number(3)      -- 수량
);
-- 외래키 제약 조건
alter table buyTBL
    add constraints FK_userTBL_buyTBL 
    foreign key(userID) 
    references userTBL(userID);
    
create sequence idSEQ;

insert into userTBL values('LSG','이승기',1987,'서울','011','11111111',182,'2008-8-8');
insert into userTBL values('KBS','김범수',1979,'경남','011','22222222',173,'2012-4-4');
insert into userTBL values('KKH','김경호',1971,'전남','019','33333333',177,'2007-7-7');

insert into buyTBL values(idSEQ.NEXTVAL,'KBS','운동화',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','노트북','전자',1000,1);
insert into buyTBL values(idSEQ.NEXTVAL,'JYP','모니터','전자',200,1);

select * from user_constraints
    where table_name = 'USERTBL';
    
insert into userTBL values('LSG','이승기',1987,'서울','011','11111111',182,'2008-8-8');
insert into userTBL values('KBS','김범수',NULL,'경남','011','22222222',173,'2012-4-4');
insert into userTBL values('KKH','김경호',1871,'전남','019','33333333',177,'2007-7-7');
insert into userTBL values('JYP','조용필',1950,'경기','011','44444444',166,'2009-4-4');

insert into buyTBL values(idSEQ.NEXTVAL,'KBS','운동화', NULL, 30, 2);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','노트북','전자',1000,1);
insert into buyTBL values(idSEQ.NEXTVAL,'JYP','모니터','전자',200,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','모니터','전자',200,5);

commit;

select * from userTBL;
select * from buyTBL;