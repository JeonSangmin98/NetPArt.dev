-- 피벗의 구현 
-- 피벗 : 한 열에 포함된 여러 값을 출력, 여러 열로 변환하여 반환식을 회전하고 필요하면 집계까지 수행 
create table pivotTest
    ( uName nchar(3),
      season nchar(2),
      amount number(3));
insert into pivotTest values('김범수', '겨울', 10);
insert into pivotTest values('윤종신', '여름', 15);
insert into pivotTest values('김범수', '가을', 25);
insert into pivotTest values('김범수', '봄',    3);
insert into pivotTest values('김범수', '봄',   37);
insert into pivotTest values('윤종신', '겨울', 40);
insert into pivotTest values('김범수', '여름', 14);
insert into pivotTest values('김범수', '겨울', 22);
insert into pivotTest values('윤종신', '여름', 64);
select * from pivotTest;

select * from pivotTest
    pivot(  sum(amount)
            for season
            in('봄','여름','가을','겨울') );