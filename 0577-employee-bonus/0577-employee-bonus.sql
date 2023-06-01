# Write your MySQL query statement below
# select e.name ,b.bonus from Employee e
# left join Bonus b
# on e.empId=b.empId 
# where COALESCE(b.bonus,0)<1000;
select e.name ,b.bonus from Employee e
left join Bonus b
on e.empId=b.empId 
where IFNULL(b.bonus,0)<1000