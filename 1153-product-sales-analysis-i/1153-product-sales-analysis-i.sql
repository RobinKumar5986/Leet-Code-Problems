# Write your MySQL query statement below
select product_name ,year,price from Sales s
left join Product p 
on s.product_id = p.product_id ;

# select product_name ,year,price from Sales s ,Product p
# where s.product_id =p.product_id ;

