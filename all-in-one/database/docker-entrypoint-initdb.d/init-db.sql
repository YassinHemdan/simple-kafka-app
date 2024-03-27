CREATE TABLE customers(
    customer_id int,
    name VARCHAR(30) not NULL
);

ALTER TABLE customers ADD PRIMARY KEY (customer_id);


CREATE TABLE orders(
    order_id int,
    customer_id int not null,
    category VARCHAR(30) not NULL
);

ALTER TABLE orders ADD PRIMARY KEY (order_id);
ALTER TABLE orders ADD CONSTRAINT orders_customers_fk
    FOREIGN KEY(customer_id)
        REFERENCES customers(customer_id);


INSERT INTO customers(customer_id, name) VALUES(1, 'yassin');
INSERT INTO customers(customer_id, name) VALUES(2, 'khaled');
INSERT INTO customers(customer_id, name) VALUES(3, 'sara');

--to be added in a post request :D
    --INSERT INTO orders(order_id, customer_id, category)VALUES(1, 1, 'Lenovo ideapad 3');
    --INSERT INTO orders(order_id, customer_id, category)VALUES(2, 1, 'iphone 13 pro max');
    --INSERT INTO orders(order_id, customer_id, category)VALUES(3, 2, 'television');
    --INSERT INTO orders(order_id, customer_id, category)VALUES(4, 2, 'PS5');
    --INSERT INTO orders(order_id, customer_id, category)VALUES(5, 3, 'Jacket');
