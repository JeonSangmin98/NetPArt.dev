-- 숫자 및 수학 함수
-- abs(숫자) : 절대값 계산
select abs(-100) from dual;

-- ceil(숫자),floor(숫자),round(숫자) : 올림,내림,반올림 계산 
select ceil(4.7), floor(4.7), round(4.7) from dual;

-- mod(숫자1, 숫자2) : 숫자1을 숫자2로 나눈 나머지 값 
select mod(157,10) from dual;

-- power(숫자1,숫자2), sqrt(숫자) : 거듭제곱값 및 제곱근 
select power(2,3), sqrt(9) from dual;

-- sign(숫자) : 숫자가 양수,0,음수인지를 구함 
select sign(100), sign(0), sign(-100.123) from dual;

-- trunc(숫자,정수) : 숫자를 소수점을 기준으로 정수 위치까지 구하고 나머지는 버림 
select trunc(1235.12345,2), trunc(12345.12345, -2) from dual;