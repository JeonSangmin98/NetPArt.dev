create table userTBL    -- 회원 테이블
( userID char(8) not null primary key,  -- 사용자 아이디(PK)
  userName nvarchar2(10) not NULL,  -- 이름, 유니코드 기준 2byte
  birthYear NUMBER(4) not null, -- 출생년도
  addr nchar(2) not NULL,   -- 지역(경기,서울,경남 식으로 2글자만 입력)
  mobile1 CHAR(3),  -- 휴대폰의 국번(010,011,016 등등)
  mobile2 CHAR(8),  -- 휴대폰 나머지 번호
  height number(3), -- 키
  mDate date    -- 회원 가입일
);
create table buyTBL -- 회원 구매 테이블
( idNum number(8) not null PRIMARY key, -- 순번(PK)
  userID char(8) not null,  -- 아이디(FK)
  prodName nchar(6) not null,   -- 물품명
  groupName NCHAR(4),   -- 분류
  price number(8) not null, -- 단가
  amount NUMBER(8) not null,    -- 수량
  FOREIGN KEY (userID) REFERENCES userTBL(userID)
);

insert into userTBL VALUES('LSG', '이승기', 1987, '서울', '011', '11111111', 182, '2008-8-8');
insert into userTBL VALUES('KBS', '김범수', 1979, '경남', '011', '22222222', 173, '2012-4-4');
insert into userTBL VALUES('KKH', '김경호', 1971, '전남', '019', '33333333', 177, '2007-7-7');
insert into userTBL VALUES('JYP', '조용필', 1950, '경기', '011', '44444444', 166, '2009-4-4');
insert into userTBL VALUES('SSK', '성시경', 1979, '서울',  NULL,       NULL, 186, '2013-12-12');
insert into userTBL VALUES('LJB', '임재범', 1963, '서울', '016', '66666666', 182, '2009-9-9');
insert into userTBL VALUES('YJS', '윤종신', 1969, '경남',  NULL,       NULL, 170, '2005-5-5');
insert into userTBL VALUES('EJW', '은지원', 1972, '경북', '011', '88888888', 174, '2014-3-3');
insert into userTBL VALUES('JKW', '조관우', 1965, '경기', '018', '99999999', 172, '2010-10-10');
insert into userTBL VALUES('BBK', '바비킴', 1973, '서울', '010', '00000000', 176, '2013-5-5');

select * from userTBL;

CREATE SEQUENCE idSEQ;  -- 순차번호 입력을 위해서 시퀀스 생성
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'KBS', '운동화',   NULL,   30, 2);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'JYP', '모니터', '전자',  200, 1);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'BBK', '모니터', '전자',  200, 5);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'KBS', '청바지', '의류',   50, 3);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'BBK', '메모리', '전자',   80, 10);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'SSK',     '책', '서적',   15, 5);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'EJW',     '책', '서적',   15, 2);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'EJW', '청바지', '의류',   50, 1);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'BBK', '운동화',  NULL,    30, 2);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'EJW',     '책', '서적',   15, 1);
INSERT INTO buyTBL VALUES (idSEQ.NEXTVAL, 'BBK', '운동화',  NULL,    30, 2);

SELECT * FROM buyTBL;
commit;