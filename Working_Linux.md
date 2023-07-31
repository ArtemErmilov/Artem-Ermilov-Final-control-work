# **LINUX**

1. Используя команду cat в терминале операционной системы Linux, создать
два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).
```sh
Создаём файл домашние животные и заполняем.
cat > pets
dogs
cats
hamsters
parrot
```

![Alt text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_1.jpg)


```sh
Создаём файл вьючные животными и заполняем.

cat > pack_animals
horses
camels
donkeys
```
![Alt text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_2.jpg)

```sh
Объединяем два файла в один дав ему новое имя

cat pets pack_animals > friends_man
```
```sh
Просматриваем файл.

cat friends_man
```

![Alt text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_3.jpg)

```sh
Переименовываем friends_man в friends_man_new.
mv friends_man friends_man_new

```
 ![Alt text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_4.jpg)

2. Создать директорию, переместить файл туда.
   
```sh   
mkdir new_animals
```
```sh   
 mv friends_man_new new_animals
```

![Text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_5.jpg)

3. Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

```sh
sudo apt update
```
![Text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_6.jpg)

```sh
sudo apt update
```

![Text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_7.jpg)

4.  Установить и удалить deb-пакет с помощью dpkg.
   
```sh
wget https://dev.mysql.com/get/mysql-apt-config_0.8.25-1_all.deb
```
![Text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_8.jpg)

```sh
dpkg -i mysql-apt-config_0.8.16-1_all.deb
```
![Text](https://github.com/ArtemErmilov/Artem-Ermilov-Final-control-work/blob/main/images/images_9.jpg)


