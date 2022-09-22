create table testTBL1 (id number(4), userName nchar(3), age number(2));
-- values 다음에 나오는 값들의 순서 및 개수가 테이블이 정의된 열 순서 및 개수과 동일해야함 
insert into testTBL1 VALUES(1, '홍길동', 25);
-- 만약, id와 이름만 입력하고 나이를 입력하고 싶지 않을때
insert into testTBL1(id, userName) VALUES(2,'설현');  -- 생략한 age는 null값이 들어감
-- 열의 순서를 바꿔서 입력하고 싶을 때는 꼭 열 이름을 입력할 순서에 맞춰 나열해야 함 
insert into testTBL1(userName, age, id) VALUES('지민',26,3);
insert into testTBL1(id, userName, age) VALUES(4,'홍길순',25);

select * from testTBL1;