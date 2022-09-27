-- 세 개의 테이블의 조인
-- 다대다(Many - to - Many)
CREATE TABLE stdTBL
( stdName NCHAR(5) NOT NULL PRIMARY KEY,
    addr NCHAR(2) NOT NULL
);
CREATE TABLE clubTBL
( clubName NCHAR(5) NOT NULL PRIMARY KEY,
    roomNo NCHAR(4) NOT NULL
);
CREATE SEQUENCE stdclubSEQ;
CREATE TABLE stdclubTBL
( idNum NUMBER(5) NOT NULL PRIMARY KEY,
    stdName NCHAR(5) NOT NULL,
    clubName NCHAR(5) NOT NULL,
    FOREIGN KEY(stdName) REFERENCES stdTBL(stdName),
    FOREIGN KEY(clubName) REFERENCES clubTBL(clubName)
);

insert into stdTBL values('김범수','경남');
insert into stdTBL values('성시경','서울');
insert into stdTBL values('조용필','경기');
insert into stdTBL values('은지원','경북');
insert into stdTBL values('바비킴','서울');
insert into clubTBL values('수영','101호');
insert into clubTBL values('바둑','102호');
insert into clubTBL values('축구','103호');
insert into clubTBL values('봉사','104호');
insert into stdclubTBL values(stdclubSEQ.nextval,'김범수','바둑');
insert into stdclubTBL values(stdclubSEQ.nextval,'김범수','축구');
insert into stdclubTBL values(stdclubSEQ.nextval,'조용필','축구');
insert into stdclubTBL values(stdclubSEQ.nextval,'은지원','축구');
insert into stdclubTBL values(stdclubSEQ.nextval,'은지원','봉사');
insert into stdclubTBL values(stdclubSEQ.nextval,'바비킴','봉사');

select * from stdTBL;
select * from clubTBL;
select * from stdclubTBL;

select S.stdName, S.addr, C.clubName, C.roomNo
    from stdTBL S
        inner join stdclubTBL SC
            on S.stdName = SC.stdName
        inner join clubTBL C
            on SC.clubName = C.clubName
    order by S.stdName;
    
select C.clubName, C.roomNo, S.stdName, S.addr
    from stdTBL S
        inner join stdclubTBL SC
            on S.stdName = SC.stdName
        inner join clubTBL C
            on SC.clubName = C.clubName
    order by C.clubName;