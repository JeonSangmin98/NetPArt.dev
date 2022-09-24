-- 데이터 형식과 형변환 
select * from buyTBL;

-- cast()
select cast(avg(amount) as number(3)) from buyTBL;

select price, amount, price * amount as "구매액" from buyTBL;

select cast(price as char(5)) || 'X ' || cast(amount as char(4)) || '=' as "단가 X 수량", price * amount as "구매액" from buyTBL;

select cast('2020$12$12' as date) from dual;
select cast('2020/12/12' as date) from dual;
select cast('2020%12%12' as date) from dual;
select cast('2020@12@12' as date) from dual;

-- to_char()
select to_char(12345, '$999,999') from dual;
select to_char(12345, '$000,999') from dual;
select to_char(12345, 'L999,999') from dual;
select to_char(SYSDATE, 'YYYY/MM/DD HH:MM:SS') from dual;
-- 10진수 16진수로 
select to_char(10,'X'), to_char(255,'X') from dual;

-- to_number()
select to_number('A','X'), to_number('FF','XX') from dual;

select to_number('0123'), to_number('1234.456') from dual;