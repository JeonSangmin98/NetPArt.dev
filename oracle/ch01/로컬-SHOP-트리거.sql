-- 추가, 수정, 삭제
select * from memberTBL;

insert into memberTBL values('Figure', '연아','경기도 군포시 당정동');
select * from memberTBL;

update memberTbl set memberAddress = '서울 강남구 역삼동' where memberName = '연아';
select * from memberTBL;

delete from memberTbl where memberName = '연아';
select * from memberTBL;

-- 백업
create table deletedMemberTBL(
    memberID char(8),
    memberName nchar(5),
    memberAddress nvarchar2(20),
    deleteDate date -- 삭제한 날짜
);

create trigger trg_deletedMemberTBL  -- 트리거 이름
    after delete    -- 삭제 후에 작동하게 지정
    on memberTBL    -- 트리거를 부착할 테이블
    for each row    -- 각 행마다 적용됨
begin
    -- :old 테이블의 내용을 백업 테이블에 삽입
    insert into deletedMemberTBL
        values(:old.memberID, :old.memberName, :old.memberAddress, sysdate());
end;

delete from memberTbl where memberName = '당탕이';
select * from memberTBL;
select * from deletedMemberTBL;