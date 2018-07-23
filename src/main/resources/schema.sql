CREATE TABLE IF NOT EXISTS category (
id serial primary key,
name character varying(128),
description text
);

ALTER TABLE only category DROP CONSTRAINT IF EXISTS unique_cat_name;
alter table only category add constraint unique_cat_name unique (name);

CREATE TABLE IF NOT EXISTS subscription (
id serial primary key,
endpoint text not null,
expiration_time timestamp,
p256dh text,
auth text,
source_url text
);


CREATE TABLE IF NOT EXISTS subscription_category_ref (
subscription_id bigint not null,
category_id bigint not null
);