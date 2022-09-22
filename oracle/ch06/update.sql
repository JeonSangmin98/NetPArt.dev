select * from testTBL4 where firstName='David';

-- David의 Phone을 '없음'으로 변경
update testTBL4
    set Phone = '없음'
    where FirstName = 'David';
    

select * from buyTBL;
-- 전체 테이블의 내용 변경하고 싶을 때 where 생략 가능 
-- 구매테이블에서 현재 단가가 모두 1.5배 인상 되었다면 
update buyTBL
    set price = price * 1.5;
