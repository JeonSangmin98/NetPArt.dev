-- inner join(내부조인)
select * from buyTBL;

select * 
    from buyTBL
        inner join userTBL
            on buyTbl.userId = userTBL.userID
    where buyTBL.userID = 'JYP';

-- 필요한 열만 추출 
select userID, userName, prodName, addr, mobile1 || mobile2 as "연락처" 
    from buyTBL
        inner join userTBL
            on buyTbl.userId = userTBL.userID
    where buyTBL.userID = 'JYP';

-- userID의 경우 두 테이블 모두 들어 있어서 어느 테이블의 userID를 추출할지 정해줘야 함 
select buyTBL.userID, userName, prodName, addr, mobile1 || mobile2 as "연락처" 
    from buyTBL
        inner join userTBL
            on buyTbl.userId = userTBL.userID
    where buyTBL.userID = 'JYP';
    
-- 각 열이 어느 테이블에 속한 것인지 명확, 하지만 코드가 너무 길어져 복잡해보임 
select buyTBL.userID, userTBL.userName, buyTBL.prodName, userTBL.addr, userTBL.mobile1 || userTBL.mobile2 as "연락처" 
    from buyTBL
        inner join userTBL
            on buyTbl.userId = userTBL.userID
    where buyTBL.userID = 'JYP';

-- 테이블에 별칭을 주어 간결하게 함 
select B.userID, U.userName, B.prodName, U.addr, U.mobile1 || U.mobile2 as "연락처" 
    from buyTBL B
        inner join userTBL U
            on buyTbl.userId = userTBL.userID
    where buyTBL.userID = 'JYP';