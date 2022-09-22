-- rownum은 select문을 조회하면 자동으로 그 앞에 순차번호로 붙는 임시 열
-- rownum으로 원하는 갯수만큼 출력, 서브쿼리형식으로 작성
select * from
    (select employee_id, hire_date from employees order by hire_date) 
    where rownum <= 5;

-- sample(퍼센트) : 임의의 데이터를 추출, 퍼센트는 0초과 100미만 
select employee_id, hire_date from employees sample(5);