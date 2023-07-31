# **SQL**

7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”

    ```sql
    DROP DATABASE IF EXISTS `friends_man`;

    CREATE DATABASE IF NOT EXISTS `friends_man`;
    ```

8. Создать таблицы с иерархией из диаграммы в БД
   

```sql
USE `friends_man`;

CREATE TABLE `animals` (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY UNIQUE,
  animals_class VARCHAR(30)
);

CREATE TABLE `dogs` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);

CREATE TABLE `cats` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);

CREATE TABLE `hamsters` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);

CREATE TABLE `horses` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);

CREATE TABLE `camels` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);

CREATE TABLE `donkeys` (
   id INT UNSIGNED NOT NULL AUTO_INCREMENT UNIQUE,
  `name` VARCHAR(50) NOT NULL,
  `skills` VARCHAR(100) NOT NULL,
  `birth_date` DATE NOT NULL,
  `animal_class_id` INT UNSIGNED NOT NULL,
  FOREIGN KEY (`animal_class_id`) REFERENCES `animals` (`id`) ON DELETE CASCADE
);
```
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения

```sql
INSERT INTO `friends_man`.`animals` (`id`, `animals_class`) VALUES ('1', 'pet'),('2', 'wild');

INSERT INTO `friends_man`.`dogs` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Шарик', 'Сидеть, Стоять, Лежать', '2021-07-11', 1),
  ('Тунгуска', 'Голос, Танцевать', '2016-02-23', 1),
  ('Вепрь', 'Рядом, Апорт, Голос', '2022-04-07', 1),
  ('Дружок', 'Фу, Сидеть, Стоять, Лежать', '2015-09=5-05', 1),
  ('Боня', 'Фу, Сидеть, Стоять, Лежать, Апорт', '2016-12-08', 1);

INSERT INTO `friends_man`.`cats` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Сима', 'Ко мне, Принеси', '2014-03-16', 1),
  ('Люся', 'Сидеть, Лежать', '2015-03-21', 1),
  ('Сашка', 'Стоять, Поцелуй', '2016-04-05', 1),
  ('Гоша', 'Дай лапу, Прыжок через обруч', '2017-05-18', 1),
  ('Василиса', 'Стоять на задних лапах, Сидеть', '2022-06-19', 1);

INSERT INTO `friends_man`.`hamsters` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Рыжик', 'Бегать', '2022-01-01', 1),
  ('Умка', 'Прыгать', '2022-02-02', 1),
  ('Черныш', 'Спрятаться', '2022-03-03', 1),
  ('Зола', 'Встать на задние лапы', '2022-04-04', 1),
  ('Агат', 'Лежать', '2022-05-05', 1);

INSERT INTO `friends_man`.`horses` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Апполон', 'Вперёд, Стой', '2011-02-10', 2),
  ('Буран', 'Рысь, Хоп', '2012-03-11', 2),
  ('Виконт', 'Шагом, Тише', '2013-04-11', 2),
  ('Гамлет', 'Вперёд, Стой', '2014-05-12', 2),
  ('Дакар', 'Шагом, Тише', '2015-06-13', 2);

INSERT INTO `friends_man`.`camels` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Жетем', 'Сидеть, Стоять', '2014-03-01', 2),
  ('Лила', 'Бежать, Стоп', '2014-04-02', 2),
  ('Хлоя', 'Идти, Сидеть', '2014-05-03', 2),
  ('Арлекин', 'Сидеть, Стоять', '2014-06-04', 2),
  ('Хмырь', 'Идти, Сидеть', '2014-07-05', 2);

INSERT INTO `friends_man`.`donkeys` (`name`, `skills`, `birth_date`, `animal_class_id`) VALUES
  ('Лиза', 'Стоять', '2019-07-07', 2),
  ('Берти', 'Сидеть', '2019-08-08', 2),
  ('Дизель', 'Идти', '2019-09-09', 2),
  ('Феррари', 'Бежать', '2019-10-10', 2),
  ('Боинг', 'Ко мне', '2019-11-11', 2);
```


