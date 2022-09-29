DECLARE
    pnumber NUMBER(3);  -- 점수
    credit  CHAR(1); -- 학점
BEGIN
    pnumber := 77;
    IF pnumber >= 90 THEN
        credit := 'A';
    ELSIF pnumber >= 80 THEN
        credit := 'B';
    ELSIF pnumber >= 70 THEN
        credit := 'C';
    ELSIF pnumber >= 60 THEN
        credit := 'D';
    ELSE
        credit := 'F';
    END IF;

    dbms_output.put_line('취득점수==>'
                         || pnumber
                         || ', 학점==>'
                         || credit);
END;

DECLARE
    pnumber NUMBER(3);
    credit  CHAR(1);
BEGIN
    pnumber := 77;
    CASE
        WHEN pnumber >= 90 THEN
            credit := 'A';
        WHEN pnumber >= 80 THEN
            credit := 'B';
        WHEN pnumber >= 70 THEN
            credit := 'C';
        WHEN pnumber >= 60 THEN
            credit := 'D';
        ELSE
            pnumber := 'F';
    END CASE;

    dbms_output.put_line('취득점수==>'
                         || pnumber
                         || ',학점==>'
                         || credit);
END;


-- case문 활용
SELECT U.userid, U.userName, SUM(price * amount) AS "총구매액",
    case
        when(sum(price*amount) >= 1500) then '최우수고객'
        when(sum(price*amount) >= 1000) then '우수고객'
        when(sum(price*amount) >= 1) then '일반고객'
        else '유령고객'
    end as "고객등급"
    FROM buytbl B
        right outer join userTBL U
            on B.userid = U.userid
    GROUP BY U.userid, U.userName
    ORDER BY SUM(price * amount) DESC nulls last;
    
    