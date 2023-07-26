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
![Alt text](images\images_1.jpg)
```sh
Создаём файл вьючные животными и заполняем.

cat > pack_animals
horses
camels
donkeys
```
![Alt text](images\images_2.jpg)
```sh
Объединяем два файла в один дав ему новое имя

cat pets pack_animals > friends_man
```
```sh
Просматриваем файл.

cat friends_man
```
![Alt text](images\images_3.jpg)
```sh
Переименовываем friends_man в friends_man_new.

 mv friends_man friends_man_new

 ```
 ![Alt text](images\images_4.jpg)