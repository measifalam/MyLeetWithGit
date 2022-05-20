# Write your MySQL query statement below




# SELECT Customers.name AS Customers 
# FROM Customers
# WHERE Customers.id NOT IN 
# (
#    SELECT customerId from Orders
# );


#select c.name as Customers from customers c where c.id not in (select o.customerid from orders o)


select name as Customers from Customers where Customers.id not in (select customerid from orders)