-- 암시적인 형 변환
select '100' + '200' from dual; -- 문자와 문자를 더함 (정수로 변환되서 연산됨)
select concat('100','200') from dual;   -- 문자와 문자를 연결 (문자로 처리)
select 100 || '200' from dual;  -- 정수와 문자를 연결 (정수가 문자로 변환되서 처리)
select price from buyTBL where price >= '500';  -- 정수 500으로 변환