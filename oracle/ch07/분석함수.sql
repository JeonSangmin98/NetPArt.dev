-- 분석 함수
-- lead(열 이름, 다음 행 위치, 다음 행이 없을경우 값)
select userName, addr, height as "키",
        height - (lead(height,1,0) over(order by height desc)) as "다음 사람과 키 차이"
    from userTBL;
    
-- 지역별 가장 키큰 사람과의 차이    
select userName, addr, height as "키",
        height - (first_value(height) over(partition by addr order by height desc)) as "지역별 최대키와 차이"
    from userTBL;
    
-- 누적 합계 
select userName, addr, height as "키",
        (cume_dist() over(partition by addr order by height desc)) * 100 as "누적인원 백분율%"
    from userTBL;
    
-- 지역별 키 중앙값
select DISTINCT addr,
    percentile_cont(0.5) within group (order by height) over (partition by addr) 
                as "지역별 키의 중앙값" 
    from userTBL;