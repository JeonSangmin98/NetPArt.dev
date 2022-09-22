-- DELETE : 행 단위로 삭제
select * from testTBL4 where firstName = 'Peter';
-- 'Peter' 라는 이름의 사용자 삭제 
delete from testTBL4 where firstName = 'Peter';

rollback;   -- 앞에서 지운 'Peter'를 되돌림, 커밋하기 전까지 되돌릴 수 있음 

-- 'Peter' 중에서 상위 2건 삭제 
delete from testTBL4 where FirstName = 'Peter' and rownum <= 2;

delete from testTBL4;
select count(*) from testTBL4;