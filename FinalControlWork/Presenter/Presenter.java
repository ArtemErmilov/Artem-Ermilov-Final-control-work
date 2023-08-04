package FinalControlWork.Presenter;

import java.util.*;

import FinalControlWork.Console.View;

import FinalControlWork.Model.fileHandling.FileHandling;

public class Presenter {

    View v = new View(); // Описание меню

    
    Map<String, String> newDataAnimals = new LinkedHashMap<>(); // Временные данные по животным

    FileHandling fh = new FileHandling(); // Работа с файлами


    PreCase2 pc2 = new PreCase2();

    PreCase3 pc3 = new PreCase3();

    PreCase4 pc4 = new PreCase4();

    public void buttonClick() {

        ArrayList<Map<String, String>> listAnimals = fh.readData(); // Список животных

        while (true) {
            switch (v.Menu()) {
                case 1:// Вывод списка животных

                    ListIterator<Map<String, String>> itr = listAnimals.listIterator(); // Создание итератора

                    while (itr.hasNext()) {
                        v.printMap(itr.next());
                    }

                    String s = v.getValueStr("Для продолжения нажмите Enter");

                    break;

                case 2:// Добавление нового животного.
                    

                    // Выбор типа животного (Домашнее, Вьючное )

                    String type = v.MTextType();

                    if (type.equals("1")) // Домашние животные
                    {
                        String klassPets = v.MTextKlassPets();

                        if (klassPets.equals("1")) // Собаки
                        {
                            newDataAnimals = pc2.PDogs(listAnimals);

                        } else if (klassPets.equals("2")) // Кошки
                        {
                            newDataAnimals = pc2.PCats(listAnimals);

                        } else if (klassPets.equals("3")) // Хомяки
                        {
                            newDataAnimals = pc2.PHamsters(listAnimals);

                        } else // Выход в мень.
                        {
                            break;
                        }

                    } else if (type.equals("2")) // Вьючные животные
                    {

                        String klassPackAnim = v.MTextKlassPackAnim();

                        if (klassPackAnim.equals("1")) // Лошадь
                        {
                            newDataAnimals = pc2.PHorses(listAnimals);

                        } else if (klassPackAnim.equals("2")) // Верблюд
                        {
                            newDataAnimals = pc2.PCamels(listAnimals);

                        } else if (klassPackAnim.equals("3")) // Осёл
                        {
                            newDataAnimals = pc2.PDonkeys(listAnimals);

                        } else // Выход в мень.
                        {
                            break;
                        }

                    } else {
                        break;
                    }


                    String saveData = v.getValueStr(
                            "\nДля сохранения данных введите y + Enter. Для выход без сохранения нажмите Enter.\n");// Подтверждение
                                                                                                                    // сохранения

                    if (saveData.equals("y")) { // Сохранение данных по животному.

                        listAnimals.add(newDataAnimals);
                    }

                    break;
                case 3:// Добавление нового животного.

                pc3.PCase3(listAnimals);

                s = v.getValueStr("Для продолжения нажмите Enter");

                break;

                case 4:// Обучение животного новым командам.

                pc4.PCase4(listAnimals);

                s = v.getValueStr("Для продолжения нажмите Enter");

                break;

                case 0: // Выход из программ

                    fh.saveData(listAnimals);
                    
                    v.println("Выход из программы.");

                    return;
            }

        }

    }

}
