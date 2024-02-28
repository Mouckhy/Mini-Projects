--liquibase formatted sql
--changeset BillyBolton:insert-authors
INSERT INTO books
    (id,
     title,
     genre,
     page_count,
     author_id,
     publisher_id)
values
    ('00000000-0000-0000-0000-000000000001',
     'L''Enfant Noir',
     'African Literature',
     '224',
     '00000000-0000-0000-0000-000000000001',
     '00000000-0000-0000-0000-000000000001');
INSERT INTO books
    (id,
     title,
     genre,
     page_count,
     author_id,
     publisher_id)
values
    ('00000000-0000-0000-0000-000000000002',
     'L''Etrange Destin de Wagrin',
     'African Literature',
     '452',
     '00000000-0000-0000-0000-000000000002',
     '00000000-0000-0000-0000-000000000002');
INSERT INTO books
    (id,
     title,
     genre,
     page_count,
     author_id,
     publisher_id)
values
    ('00000000-0000-0000-0000-000000000003',
     'Le Devoir de Violence',
     'African Literature',
     '304',
     '00000000-0000-0000-0000-000000000003',
     '00000000-0000-0000-0000-000000000003');
INSERT INTO books
    (id,
     title,
     genre,
     page_count,
     author_id,
     publisher_id)
values
    ('00000000-0000-0000-0000-000000000004',
     'Sous L''Orage',
     'African Literature',
     '253',
     '00000000-0000-0000-0000-000000000004',
     '00000000-0000-0000-0000-000000000004');