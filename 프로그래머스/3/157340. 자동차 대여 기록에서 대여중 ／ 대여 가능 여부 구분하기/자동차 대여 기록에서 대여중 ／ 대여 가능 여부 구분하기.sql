-- 코드를 입력하세요
SELECT car_id, 
max(if(start_date <= '2022-10-16' and end_date>= '2022-10-16',"대여중", "대여 가능")) as available
from car_rental_company_rental_history
group by car_id
order by car_id desc;