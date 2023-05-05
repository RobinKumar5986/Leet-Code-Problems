# Write your MySQL query statement below
select distinct(p.email) from Person p, person pp
where p.email=pp.email and p.id!=pp.id;