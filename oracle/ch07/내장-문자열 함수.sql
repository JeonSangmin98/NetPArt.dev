-- 내장 함수 
-- 문자열 함수
-- ascii(영문자), chr(숫자), asciistr(한글), unistr('유니코드 값')
select ascii('A'), chr(65), asciistr('한'), unistr('\D55C') from dual;

-- length(문자열), lengthb(문자열) : 문자열 길이 반환
select length('한글'), length('AB'), lengthb('한글'), lengthb('AB') from dual;

-- concat(문자열1, 문자열2) 또는 || : 문자열을 이어준다.
select concat('이것이', 'Oracle이다'), '이것이' || ' ' || 'Oracle 이다.' from dual;

-- instr(기준_문자열, 부분_문자열, 찾을_시작_위치), instrb(기준_문자열, 부분_문자열, 찾을_시작_위치)
select instr('이것이 Oracle이다. 이것도 오라클이다','이것') from dual;
select instr('이것이 Oracle이다. 이것도 오라클이다','이것',2) from dual;
select instrb('이것이 Oracle이다. 이것도 오라클이다','이것',2) from dual;

-- lower(문자열), upper(문자열), initcap(문자열)
SELECT LOWER('abcdEFGH'), UPPER('abcdEFGH'), INITCAP('this is oracle') from dual;

-- replace(문자열, 원래_문자열,바꿀_문자열) : 문자열 통채로 바꿈 
select replace ('이것이 Oracle이다','이것이','This is') from dual;

-- translate(문자열, 원해_문자열, 바꿀_문자열) : 한글자 씩 찾아서 바꿈 
select translate('이것이 Oracle이다', '이것','AB') from dual;

-- substr(문자열, 시작_위치, 길이) : 시작_위치부터 길이만큼 반환 
select substr('대한민국만세',3,2) from dual;

-- reverse(문자열) : 문자열 순서를 거꾸로 
select reverse('Oracle') from dual;

-- lpad(문자열,길이,채울_문자열),rpad(문자열,길이,채울_문자열) : 문자열을 길이만큼 늘린 후, 채울_문자열로 채움 
select lpad('이것이',10,'##'),rpad('이것이',10,'##') from dual;

-- ltrim(문자열, 제거할_문자), rtrim(문자열,제거할_문자) : 왼쪽/오른쪽 제거할_문자 제거 
select ltrim('     이것이'), rtrim('이것이$$$','$') from dual;

-- trim(제거할_방향 제거할_문자 from 문자열) : 앞뒤 공백 제거 
select trim('     이것이     '), trim(both 'ㅋ' from 'ㅋㅋㅋ재밌어요.ㅋㅋㅋ') from dual;

-- regexp_count(문자열,문자) : 문자열에서 문자의 갯수를 센다 
select regexp_count('이것이 오라클이다.','이') from dual;