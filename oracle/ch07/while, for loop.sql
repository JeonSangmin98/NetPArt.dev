set serveroutput on;
-- while loop
DECLARE
    iNum NUMBER(3); -- 1에서 100까지 증가할 변수
    hap  NUMBER(5);  -- 더한 값을 누적할 변수
BEGIN
    iNum := 1;
    hap := 0;
    WHILE iNum <= 100 LOOP
        hap := hap + iNum;  -- hap에 iNum를 누적시킴
        iNum := iNum + 1;   -- iNum을 1 증가 시킴
    END LOOP;

    dbms_output.put_line(hap);
END;


-- for loop
DECLARE
    iNum NUMBER(3); -- 1에서 100까지 증가할 변수
    hap  NUMBER(5);  -- 더한 값을 누적할 변수
BEGIN
    hap := 0;
    for iNum in 1..100
    loop
        hap := hap + iNum;  -- hap에 iNum를 누적시킴
    END LOOP;
    dbms_output.put_line(hap);
END;