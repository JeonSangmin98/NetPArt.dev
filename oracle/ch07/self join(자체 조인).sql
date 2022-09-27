create table empTBL (emp nchar(3), manager nchar(3), empTel varchar2(8));
insert into empTBL values('나사장',NULL,'0000');
insert into empTBL values('김재무','나사장','2222');
insert into empTBL values('김부장','김재무','2222-1');
insert into empTBL values('이부장','김재무','2222-2');
insert into empTBL values('우대리','이부장','2222-2-1');
insert into empTBL values('지사원','이부장','2222-2-2');
insert into empTBL values('이영업','나사장','1111');
insert into empTBL values('한과장','이영업','1111-1');
insert into empTBL values('최정보','나사장','3333');
insert into empTBL values('윤차장','최정보','3333-1');
insert into empTBL values('이주임','윤차장','3333-1-1');

select * from empTBL;

-- self join : 자기 자신과 자기 자신이 조인 한다는 의미 
select A.emp as 부하직원, B.emp as 직속상관, B.empTel as "직속상관 연락처"
 from empTBL A
    inner join empTBL B
        on A.manager = B.emp
    where A.emp = '우대리';