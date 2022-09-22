select * from userTBL;

select * from userTBL where userName='김범수';

-- 연속적
select userID, userName from userTBL where birthYear >= 1970 and height >= 182;

select * from userTBL where birthYear >= 1970 or height >= 182;

select userName, height from userTBL where height BETWEEN 180 and 183;

-- 비연속적
select userName, addr from userTBL where addr = '경남' or addr = '전남' or addr = '경북';

select userName, addr from userTBL where addr in ('경남','전남','경북');

-- 김으로 시작하는 사람, %위치에 따라서 검색(뒤에 있으면 김으로 끝나는 사람)
select userName, height from userTBL where userName like '김%';