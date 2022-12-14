create table userTBL
( userID char(8) not null primary key,
    userName nvarchar2(10) not null,
    birthYear number(4) not null,
    addr nchar(2) not null,
    mobile1 char(3),
    mobile2 char(8),
    height number(3),
    mDate date
    );
    
create table buyTBL
( idNum number(8) not null primary key,
    userID char(8) not null,
    prodName nchar(6) not null,
    groupName nchar(4),
    price number(8) not null,
    amount number(3) not null,
    foreign key (userID) REFERENCES userTBL(userID)
    );
    
insert into userTBL values('LSG','이승기',1987,'서울','011','11111111',182,'2008-8-8');
insert into userTBL values('KBS','김범수',1979,'경남','011','22222222',173,'2012-4-4');
insert into userTBL values('KKH','김경호',1971,'전남','019','33333333',177,'2007-7-7');
insert into userTBL values('JYP','조용필',1950,'경기','011','44444444',166,'2009-4-4');
insert into userTBL values('SSK','성시경',1979,'서울',NULL,NULL,186,'2013-12-12');
insert into userTBL values('LBJ','임재범',1963,'서울','016','66666666',182,'2009-9-9');
insert into userTBL values('YJS','윤종신',1969,'경남',NULL,NULL,170,'2005-5-5');
insert into userTBL values('EJW','은지원',1972,'경북','011','88888888',174,'2014-3-3');
insert into userTBL values('JKW','조관우',1965,'경기','018','99999999',172,'2010-10-10');
insert into userTBL values('BBK','바비킴',1973,'서울','010','00000000',176,'2013-5-5');

create sequence idSEQ;
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','운동화',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','노트북','전자',1000,1);
insert into buyTBL values(idSEQ.NEXTVAL,'JYP','모니터','전자',200,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','모니터','전자',200,5);
insert into buyTBL values(idSEQ.NEXTVAL,'KBS','청바지','의류',50,3);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','메모리','전자',80,10);
insert into buyTBL values(idSEQ.NEXTVAL,'SSK','책','서적',15,5);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','책','서적',15,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','청바지','의류',50,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','운동화',NULL,30,2);
insert into buyTBL values(idSEQ.NEXTVAL,'EJW','책','서적',15,1);
insert into buyTBL values(idSEQ.NEXTVAL,'BBK','운동화',NULL,30,2);

commit;
select * from userTBL;
select * from buyTBL;