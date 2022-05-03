INSERT INTO general (question, data_open, type) VALUES
    ('Some problems.... Oooops!', '1980-01-01', NULL);

INSERT INTO car (id,number, color, price, year, mark, type_of_car)
    VALUES (1,'О009НМ199', 'black', 10000.500, 2002, 'audi a4', 'sedan');

INSERT INTO leaser (id,username, email, telephone, driving_rate, full_name, password)
    VALUES (1,'IvanAdmin', 'ivan1999@mail.ru', '+79035550723', 2, 'Ivan Fedorov', '$2y$08$.UO1UQjgvYxgi.m5E8/vZuZ1UgLtdUcG64Qtu6rUygEbtAcW914DK'),
     (2,'OlegUser', 'oleg@mail.ru', '+79035559865', 0, 'Oleg Erofeev', '$2y$08$MdGhppt6czPiQl/H3XpOv.pso79awOcgsDWynRiSB6C52B84dir1C');

INSERT INTO rent (id,user_id, car_id, data_start, data_end, number_document)
    VALUES (1,1, 1, '2022-04-24', '2022-05-24', 1);

INSERT INTO top_of_cars (id,user_id, car_id, data_of_like)
    VALUES (1,1, 1, '2022-04-24');

INSERT INTO feed_back (id,user_id, car_id, question, data_open, answer)
    VALUES (1,1, 1, 'Hello. It`s test', '2022-04-24', 'Good job!');

