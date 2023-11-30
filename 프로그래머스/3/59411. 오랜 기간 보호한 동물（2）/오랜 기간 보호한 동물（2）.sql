-- 코드를 입력하세요
SELECT i.animal_id, i.name
from animal_ins i join animal_outs o
on i.animal_id = o.animal_id
order by timestampdiff(second,o.datetime,i.datetime) limit 2;