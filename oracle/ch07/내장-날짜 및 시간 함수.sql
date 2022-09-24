-- 날짜 및 시간 함수
-- add_months(날짜,개월)와 +/= : add_months()는 날짜를 기준으로 개월을 더하거나 뺀 결과, 일자를 더하려면 + 사용 
select add_months('2020-01-01', 5), add_months(sysdate,-5) from dual;
select to_date('2020-01-01') + 5, sysdate - 5 from dual;

-- current_date, sysdate, current_timstamp : current_date와 sysdate는 '연/월/일' 형식, current_timestamp는 '연/월/일 시:분:초 지역' 형식
select current_date, sysdate, current_timestamp from dual;

-- extract(형식 from date '날짜') : 날짜에서 연,월,일,시,분,초를 구함 
select extract(year from date '2020-12-25'), extract(day from sysdate) from dual;

-- last_day(날짜) : 주어진 날짜의 마지막 날짜를 구함, 주로 그 달이 몇일 까지 있는지 확인 할 때
select last_day('2020-02-01') from dual;

-- next_day(날짜,요일) : 주어진 날짜의 다음에 오는 요일의 날짜를 구함
select next_day('2020-02-01','월요일'), next_day(sysdate, '일요일') from dual;

-- months_between(날짜1,날짜2) : 두 날짜 사이의 개월 수를 계산해서 소수전 단위까지 반환, 날짜2-날짜1
select months_between(sysdate, '1988-09-17') from dual; 