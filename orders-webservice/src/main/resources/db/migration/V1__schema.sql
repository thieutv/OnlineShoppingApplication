create table order_item (order_item_id integer not null auto_increment, date_order_placed date not null, order_item_price double precision not null, order_item_quantity integer not null, order_item_status_code varchar(255) not null, product_id integer not null, primary key (order_item_id)) engine=MyISAM;
create table order_order_items (order_id integer not null, order_item_id integer not null) engine=MyISAM;
create table orders (order_id integer not null auto_increment, account_email_id varchar(100) not null, primary key (order_id)) engine=MyISAM;
alter table order_order_items add constraint UK_isib73cf1hyvi8v1sr35upc6w unique (order_item_id);
alter table order_order_items add constraint FK1b4p5e54460tf0gsql6man4g7 foreign key (order_item_id) references order_item (order_item_id);
alter table order_order_items add constraint FKka5k375bxx3w8kaf67lueah23 foreign key (order_id) references orders (order_id);