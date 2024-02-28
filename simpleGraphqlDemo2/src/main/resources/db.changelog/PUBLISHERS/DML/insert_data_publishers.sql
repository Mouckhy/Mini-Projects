--liquibase formatted sql
--changeset BillyBolton:insert-publishers
INSERT INTO publishers
    (id,
     name)
values
    ('00000000-0000-0000-0000-000000000001',
     'Random House I');

INSERT INTO publishers
(id,
 name)
values
    ('00000000-0000-0000-0000-000000000002',
     'Random House II');

INSERT INTO publishers
(id,
 name)
values
    ('00000000-0000-0000-0000-000000000003',
     'Random House III');

INSERT INTO publishers
(id,
 name)
values
    ('00000000-0000-0000-0000-000000000004',
     'Random House IV');