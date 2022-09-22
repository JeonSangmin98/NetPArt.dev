-- 자동으로 증가하는 시퀀스
-- 테이블 생성 
create table  testTBL2
    (id number(4),
     userName nchar(3),
     age number(2),
     nation nchar(4) DEFAULT '대한민국');
-- 시퀀스 생성 
create SEQUENCE idSEQ2
    start with 1    -- 시작값
    INCREMENT by 1; -- 증가값 
-- 시퀀스를 입력하려면 "시퀀스이름.nextval" 사용 
insert into testTBL2 VALUES(idSeq2.NEXTVAL, '유나',25,DEFAULT);
insert into testTBL2 VALUES(idSeq2.NEXTVAL, '혜정',24,'영국');
insert into testTBL2 VALUES(11, '쯔위',24,'대만');

alter sequence idSeq2 increment by 10;
insert into testTBL2 VALUES(idSeq2.NEXTVAL, '미나',24,'일본');
alter sequence idSeq2 increment by 1;

select * from testTBL2;

-- 시퀀스의 현재 값을 확인 
select idSeq2.CURRVAL from dual; -- dual은 Oracle에 내장된 가상 테이블

select * from user_sequences;

-- 특정 범위 값이 계속 반복되어서 입력되도록
create table testTBL3 (id number(3));
create sequence cycleSEQ
    start with 100
    increment by 100
    minvalue 100    --최소값
    maxvalue 300    --최대값
    cycle
    nocache;    --캐시사용 안함
insert into testTBL3 values(cycleSEQ.nextval);
insert into testTBL3 values(cycleSEQ.nextval);
insert into testTBL3 values(cycleSEQ.nextval);
insert into testTBL3 values(cycleSEQ.nextval);

select * from testTBL3;