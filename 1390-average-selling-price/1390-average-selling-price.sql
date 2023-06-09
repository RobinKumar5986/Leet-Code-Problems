select prices.product_id ,round(sum(price * units)/sum(units),2) as average_price
from Prices,UnitsSold
where  prices.product_id=UnitsSold.product_id 
and purchase_date between start_date and end_date
group by prices.product_id;
