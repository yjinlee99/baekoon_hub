-- 코드를 입력하세요
SELECT month(c.start_date), c.car_id, count(*) as records
from car_rental_company_rental_history c join 
(select car_id from car_rental_company_rental_history 
where month(start_date) between 8 and 10 group by car_id
having count(*) >= 5) a
on c.car_id = a.car_id
where month(start_date) between 8 and 10
group by month(c.start_date), c.car_id
order by month(c.start_date), c.car_id desc;

