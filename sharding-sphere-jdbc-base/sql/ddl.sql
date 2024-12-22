CREATE DATABASE test1;

\c test1;

-- 创建 t_order 表
CREATE TABLE public.t_order0
(
    order_id BIGINT NOT NULL PRIMARY KEY, -- 使用 SNOWFLAKE 生成的主键
    user_id  INT    NOT NULL
);

-- 创建 t_order_item 表
CREATE TABLE public.t_order_item0
(
    order_item_id BIGINT NOT NULL PRIMARY KEY, -- 使用 SNOWFLAKE 生成的主键
    order_id      BIGINT NOT NULL
);
-- 创建 t_config 表
CREATE TABLE t_config
(
    config_id    SERIAL PRIMARY KEY,                                             -- 自增主键
    config_key   VARCHAR(255) NOT NULL,                                          -- 配置键
    config_value TEXT         NOT NULL
);


alter table public.t_order0
    owner to postgres;
alter table public.t_order_item0
    owner to postgres;
alter table public.t_config
    owner to postgres;


CREATE DATABASE test2;

\c test2;

-- 创建 t_order 表
CREATE TABLE public.t_order1
(
    order_id BIGINT NOT NULL PRIMARY KEY, -- 使用 SNOWFLAKE 生成的主键
    user_id  INT    NOT NULL
);

-- 创建 t_order_item 表
CREATE TABLE public.t_order_item1
(
    order_item_id BIGINT NOT NULL PRIMARY KEY, -- 使用 SNOWFLAKE 生成的主键
    order_id      BIGINT NOT NULL
);
CREATE TABLE t_config
(
    config_id    SERIAL PRIMARY KEY,                                             -- 自增主键
    config_key   VARCHAR(255) NOT NULL,                                          -- 配置键
    config_value TEXT         NOT NULL
);


alter table public.t_order1
    owner to postgres;
alter table public.t_order_item1
    owner to postgres;
alter table public.t_config
    owner to postgres;


