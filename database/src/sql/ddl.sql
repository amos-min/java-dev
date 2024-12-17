
CREATE DATABASE test;

\c test;

create table public.student
(
    id   serial
        primary key,
    name text,
    age  integer
);

alter table public.student
    owner to postgres;

INSERT INTO public.student (name,age)
VALUES ('John',12),
       ('Jane',1),
       ('Doe',3);
