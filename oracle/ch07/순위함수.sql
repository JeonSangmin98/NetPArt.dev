-- 순위 함수
select * from userTBL;
select userNAme, addr, height from userTBL;
select row_number() over(order by height desc) as "키큰순위", userName, addr, height from userTBL;
select row_number() over(order by height desc, userName asc) as "키큰순위", userName, addr, height from userTBL;

select row_number() over(partition by addr order by height desc, userName asc) as "키큰순위", userName, addr, height from userTBL;

select dense_rank() over(order by height desc) as "키큰순위", userName, addr, height from userTBL;

select rank() over(order by height desc) as "키큰순위", userName, addr, height from userTBL;

select ntile(2) over(order by height desc) as "반번호", userName, addr, height from userTBL;
select ntile(4) over(order by height desc) as "반번호", userName, addr, height from userTBL;