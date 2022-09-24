SET SERVEROUTPUT ON;

DECLARE
    myVar1 NUMBER(3);
    myVar2 NUMBER(5,2) := 3.14;
    myVar3 NVARCHAR2(20) := '이승기 키 --> ';
BEGIN
    myVar1 := 5;
    DBMS_OUTPUT.PUT_LINE(myVar1);
    DBMS_OUTPUT.PUT_LINE(myVar1 + myVar2);
    SELECT height INTO myVar1 FROM userTBL WHERE userName = '이승기';
    DBMS_OUTPUT.PUT_LINE(myVar3 || TO_CHAR(myVar1));
END;