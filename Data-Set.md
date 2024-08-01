### Data set

To validate the requirement 1.c, it’s necessary to create a data set. That requirement involves updating sales campaigns, therefore we have to understand the structure of the relational database:

|    products      |   products_stock  | sale_campaigns |
|------------------|-------------------|----------------|
| PK product_id    | PK  product_id    | PK campaign_id |
|    product_type  |     current_stock | FK product_id  |
|    product_name  |                   |    discount    |
|    provider      |                   |    from_date   |
|    sale_price    |                   |    to_date     |


Here is an example of the creation of the data set. To insert data into the table, it’s necessary to execute the commands below:

**Inserting products**
``` sql
INSERT INTO products (product_id, product_type, product_name, provider, sale_price) VALUES
(1, 'Electronics', 'Smartphone', 'Provider A', 699.99),
(2, 'Electronics', 'Laptop', 'Provider B', 999.99),
(3, 'Home Appliances', 'Microwave', 'Provider C', 149.99),
(4, 'Books', 'Programming in Python', 'Provider D', 39.99),
(5, 'Clothing', 'T-Shirt', 'Provider E', 19.99);
```

**Inserting product stocks**
``` sql
INSERT INTO product_stocks (product_id, current_stock) VALUES
(1, 50),
(2, 30),
(3, 0),
(4, 100),
(5, 200);
```

**Inserting sale campaigns**
``` sql
INSERT INTO sale_campaigns (campaign_id, product_id, discount, from_date, to_date) VALUES
(1, 1, 10.00, '2024-08-01', '2024-08-15'),
(2, 2, 15.00, '2024-08-01', '2024-08-31'),
(3, 3, 20.00, '2024-08-10', '2024-08-20'),
(4, 4, 5.00, '2024-08-05', '2024-08-25'),
(5, 5, 25.00, '2024-08-01', '2024-08-10');
```

From this we can create SQL queries to validate the following scenarios:
- Verify the initial creation of the sale campaigns;
-	Confirm that the updates have been applied correctly.

Below is the SQL query designed to validate the requirement:
``` sql
SELECT * FROM sale_campaigns;
```
That query allows to validate whether the initial sales campaigns were inserted properly and after the update we can check if the updates have been applied properly. 
If it’s necessary update the sales campaigns directly in the table, below we can find an example of the command to be executed:

**Update Sale Campaigns** 
``` sql
UPDATE sale_campaigns 
SET discount = 12.00, from_date = '2024-08-02', to_date = '2024-08-16' 
WHERE product_id = 1;
```
