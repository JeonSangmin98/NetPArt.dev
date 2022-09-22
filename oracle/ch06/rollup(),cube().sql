-- groupName별 합계 및 총합
-- idNum열이 null로 되어 있는 추가된 해잉 각 그룹의 소합계를 의미 
select idNum, groupName, sum(price * amount) as "비용"
    from buyTBL
    group by rollup(groupName, idNum);
    
-- 총 합계만 
select groupName, sum(price * amount) as "비용"
    from buyTBL
    group by rollup(groupName);
    
-- cube() : 다차원 정보의 데이터를 요약하는데 더 적당함 
-- 물품별 소합계 및 색상별 소합계 확인
create table cubeTBL(prodName nchar(3), color nchar(2), amount int);
insert into cubeTBL VALUES('컴퓨터','검정',11);
insert into cubeTBL VALUES('컴퓨터','파랑',22);
insert into cubeTBL VALUES('모니터','검정',33);
insert into cubeTBL VALUES('모니터','파랑',44);
select prodName, color, sum(amount) as "수량합계"
    from cubeTBL
    group by cube(color,prodName)
    order by prodName, color;