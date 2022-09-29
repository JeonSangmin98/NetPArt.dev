select userName, concat(mobile1,mobile2) as 전화번호 
from userTBL
where userName not in (select userName from userTBL where mobile1 is null);

select userName, concat(mobile1,mobile2) as 전화번호
from userTBL
where userName in (select userName from userTBL where mobile1 is null);