-- outer join(외부 조인)
select U.userID, U.userName, B.prodName, U.addr, U.mobile1 || U.mobile2 as "연락처"
    from userTBL U
        left outer join buyTBL B
            on U.userID = B.userID
    order by U.userID;

select U.userID, U.userName, B.prodName, U.addr, U.mobile1 || U.mobile2 as "연락처"
    from buyTBL B
        right outer join userTBL U
            on U.userID = B.userID
    order by U.userID;

-- 구매 기록이 없는 회원 명단
select U.userID, U.userName, B.prodName, U.addr, U.mobile1 || U.mobile2 as "연락처"
    from userTBL U
        left outer join buyTBL B
            on U.userID = B.userID
    where B.prodName is null
    order by U.userID;
    
select S.stdName, S.addr, C.clubName, C.roomNo
    from stdTBL S
        left outer join stdclubTBL SC
            on S.stdName = SC.stdName
        left outer join clubTBL C
            on SC.clubName = C.clubName
    order by S.stdName;
    
select C.clubName, C.roomNo, S.stdName, S.addr
    from stdTBL S
        left outer join stdclubTBL SC
            on S.stdName = SC.stdName
        right outer join clubTBL C
            on SC.clubName = C.clubName
    order by C.clubName;
    
select S.stdName, S.addr, C.clubName, C.roomNo
    from stdTBL S
        left outer join stdclubTBL SC
            on S.stdName = SC.stdName
        left outer join clubTBL C
            on SC.clubName = C.clubName
union
select S.stdName, S.addr, C.clubName, C.roomNo
    from stdTBL S
        left outer join stdclubTBL SC
            on SC.stdName = S.stdName
        right outer join clubTBL C
            on SC.clubName = C.clubName;
    