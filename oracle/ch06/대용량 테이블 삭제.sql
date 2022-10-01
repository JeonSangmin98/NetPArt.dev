select * from bigTBL1;
create table bigTBL1 as 
    select level as bigID,
        round(dbms_random.value(1, 500000), 0) as numData
    from dual
    CONNECT by level <= 500000;
    
create table bigTBL2 as 
    select level as bigID,
        round(dbms_random.value(1, 500000), 0) as numData
    from dual
    CONNECT by level <= 500000;
    
create table bigTBL3 as 
    select level as bigID,림
        round(dbms_random.value(1, 500000), 0) as numData
    from dual
    CONNECT by level <= 500000;
    
DELETE FROM bigTBL1;    -- 오래 걸림, 트랜잭션 로그를 기록하는 작업때문에 오래 걸림 
COMMIT;

DROP TABLE bigTBL2; -- 테이블 자체 삭제 

-- 구조를 남기고 싶을 때 
TRUNCATE table bigTBL3; -- 트랜잭션 로그를 기록하지 않아서 빠름 