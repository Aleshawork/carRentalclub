INSERT INTO general (question, data_open, type) VALUES
    ('Some problems.... Oooops!', '1980-01-01', NULL);

INSERT INTO car (id,number, color, price, year, mark, type_of_car, mark_number)
    VALUES (1,'О009НМ199', 'black', 10000.500, 2002, 'audi', 'sedan', 'a4'),
            (2,'О012KK149', 'red', 50000.500, 2009, 'bmv', 'crossover', 'x5'),
            (3,'О982ФК122', 'blue', 70000.500, 2020, 'bmv', 'crossover', 'x6'),
            (4,'1234РО344', 'white', 44000.500, 2021, 'lexus', 'crossover', 'rx300'),
            (5,'1234РО322', 'black', 54000.500, 2020, 'lexus', 'crossover', 'nx'),
            (6,'1234РО777', 'white', 57777.500, 2020, 'audi', 'crossover', 'q5'),
            (7,'1234РО233', 'white', 66600.500, 2020, 'audi', 'crossover', 'a6');

INSERT INTO leaser (id,username, email, telephone, driving_rate, full_name, password)
    VALUES (1,'IvanAdmin', 'ivan1999@mail.ru', '+79035550723', 2, 'Ivan Fedorov', '$2y$08$.UO1UQjgvYxgi.m5E8/vZuZ1UgLtdUcG64Qtu6rUygEbtAcW914DK'),
     (2,'OlegUser', 'oleg@mail.ru', '+79035559865', 0, 'Oleg Erofeev', '$2y$08$MdGhppt6czPiQl/H3XpOv.pso79awOcgsDWynRiSB6C52B84dir1C'),
     (3,'AnnaUser', 'anna@mail.ru', '+79035559140', 3, 'Anna Ermakova', '$2y$08$MdGhppt6czPiQl/H3XpOv.pso79awOcgsDWynRiSB6C52B84dir1C');

INSERT INTO rent (id,user_id, car_id, data_start, data_end, number_document)
    VALUES (1, 1, 1, '2022-04-24', '2022-05-24', 1),
            (2, 2,2, '2021-03-12', '2022-01-11', 2),
            (3, 1, 1, '2018-02-09', '2019-01-15', 2);

INSERT INTO top_of_cars (id,user_id, car_id, data_of_like)
    VALUES (1,1, 1, '2022-04-24');

INSERT INTO feed_back (id,user_id, car_id, question, data_open, answer)
    VALUES (1,1, 1, 'Кому я могу задать вопросы по оформлению аренды авто ?', '2022-04-24', 'Вопросы по оформлению аренды авто вы можете задать по горячей линии 8(965)-000-01-11'),
     (2,1, 1, 'Есть ли бонусные привелегии или скидки постоянным пользователям ?', '2022-04-24', 'На данный момент мы разрабатываем бонусные программы для наших постоянных клиентов'),
     (3,1, 1, 'Есть ли мобильная версия данного сервиса?', '2022-04-24', 'На данный момент нет мобильной версии, которую мы бы были готовы предложить нашим клиентам.');

