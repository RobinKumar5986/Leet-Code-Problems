# Write your MySQL query statement below
with coomonTable as
(select query_name ,rating / position as q ,
case 
    when rating<3 then 1
    else 0
end as qb
from Queries)

select query_name,round (avg(q),2) as quality, round ( (sum(qb)/count(*))*100 ,2) as poor_query_percentage 
from coomonTable group by query_name ;

