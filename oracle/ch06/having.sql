-- 사용자별 총 구매액
-- 오류, 집계함수는 where절에는 사용 불가 
select userID as "사용자", sum(price*amount) as "총 구매액"
    from buyTBL where sum(amount*price) > 1000
    group by userID;
    
-- having 절은 꼭 group by절 다음에 나와야 한다 
select userID as "사용자", sum(price*amount) as "총 구매액"
    from buyTBL
    group by userID
    having sum(amount * price) > 1000
    order by sum(amount * price) asc;