create table momstouch(
  name varchar(30) primary key,
  price int,
  calorie int,
  carbs int,
  protein int,
  fat int);

INSERT INTO menu (menu_name, price, calories, carbohydrate, protein, fat) VALUES
('싸이버거', 7500, 594, 60, 28, 27),
('갈릭버거', 7700, 586, 50, 25, 10),
('딥치즈버거', 8000, 605, 54, 42, 24),
('화이트갈릭버거', 8200, 573, 89, 38, 15),
('인크레더블버거', 8700, 749, 38, 38, 50),
('통새우버거', 6500, 449, 50, 14, 12),
('불싸이버거', 8500, 487, 76, 18, 7),
('아라비아따치즈버거', 10000, 791, 10, 41, 12),
('골든에그버거', 9000, 725, 11, 29, 20),
('텍사스바베큐치킨버거', 9500, 602, 50, 33, 30),
('언빌리버블버거', 9200, 772, 58, 45, 40);
