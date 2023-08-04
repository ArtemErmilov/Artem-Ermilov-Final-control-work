package FinalControlWork.Presenter;

import java.util.ArrayList;
import java.util.Map;

import FinalControlWork.Animals.Camels;
import FinalControlWork.Animals.Cats;
import FinalControlWork.Animals.Dogs;
import FinalControlWork.Animals.Donkeys;
import FinalControlWork.Animals.Hamsters;
import FinalControlWork.Animals.Horses;
import FinalControlWork.Console.View;
import FinalControlWork.Model.ModelMethod.MetIdDefinition;

public class PreCase2 {

    
    
    
    
    
    

   
    

    MetIdDefinition idDef = new MetIdDefinition(); // Определение ID животного

    public Map<String, String> PDogs(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по собаки
        
        Dogs dog = new Dogs();

        View v = new View(); // Меню

        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        dog.setID(idAnimals); // Запись ID в MAP

        dog.setNickname(v.getValueStr("Введите кличку собаки: ")); // Ввод клички животного

        dog.setBD(v.getValueStr("Введите дату рождения собаки: "));// Ввод даты рождения животного

        dog.setSkills(v.getValueStr("Введите команды, которые знает собака: "));// Ввод команд, которые знает животное

        v.printMap(dog.getMapP()); // Вывод полученных данных на экран.

        return dog.getMapP();
    }

    public Map<String, String> PCats(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по кошки
  
        Cats cat = new Cats();

        View v = new View(); // Меню

        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        cat.setID(idAnimals); // Запись ID в MAP

        cat.setNickname(v.getValueStr("Введите кличку кошки: ")); // Ввод клички животного

        cat.setBD(v.getValueStr("Введите дату рождения кошки: "));// Ввод даты рождения животного

        cat.setSkills(v.getValueStr("Введите команды, которые знает кошка: "));// Ввод команд, которые знает животное

        v.printMap(cat.getMapP()); // Вывод полученных данных на экран.

        return cat.getMapP();
    }

    public Map<String, String> PHamsters(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по хомяку

        Hamsters ham = new Hamsters();

        View v = new View(); // Меню
        
        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        ham.setID(idAnimals); // Запись ID в MAP

        ham.setNickname(v.getValueStr("Введите кличку хомяка: ")); // Ввод клички животного

        ham.setBD(v.getValueStr("Введите дату рождения хомяка: "));// Ввод даты рождения животного

        ham.setSkills(v.getValueStr("Введите команды, которые знает хомяк: "));// Ввод команд, которые знает животное

        v.printMap(ham.getMapP()); // Вывод полученных данных на экран.

        return ham.getMapP();
    }

    public Map<String, String> PHorses(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по лошадям

        Horses hor = new Horses();

        View v = new View(); // Меню

        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        hor.setID(idAnimals); // Запись ID в MAP

        hor.setNickname(v.getValueStr("Введите кличку лошади: ")); // Ввод клички животного

        hor.setBD(v.getValueStr("Введите дату рождения лошади: "));// Ввод даты рождения животного

        hor.setSkills(v.getValueStr("Введите команды, которые знает лошадь: "));// Ввод команд, которые знает животное

        v.printMap(hor.getMapPA()); // Вывод полученных данных на экран.

        return hor.getMapPA();
    }

    public Map<String, String> PCamels(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по верблюдам

        Camels cam = new Camels();

        View v = new View(); // Меню

        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        cam.setID(idAnimals); // Запись ID в MAP

        cam.setNickname(v.getValueStr("Введите кличку верблюда: ")); // Ввод клички животного

        cam.setBD(v.getValueStr("Введите дату рождения верблюда: "));// Ввод даты рождения животного

        cam.setSkills(v.getValueStr("Введите команды, которые знает верблюд: "));// Ввод команд, которые знает животное

        v.printMap(cam.getMapPA()); // Вывод полученных данных на экран.

        return cam.getMapPA();
    }

    public Map<String, String> PDonkeys(ArrayList<Map<String, String>> listAnimals ) { // Ввод данных по ослам

        Donkeys don = new Donkeys();

        View v = new View(); // Меню

        Integer idAnimals = idDef.getID(listAnimals); // Определение ID игрушки

        System.out.println("ID животного: " + idAnimals);

        don.setID(idAnimals); // Запись ID в MAP

        don.setNickname(v.getValueStr("Введите кличку осёл: ")); // Ввод клички животного

        don.setBD(v.getValueStr("Введите дату рождения осёл: "));// Ввод даты рождения животного

        don.setSkills(v.getValueStr("Введите команды, которые знает осёл: "));// Ввод команд, которые знает животное

        v.printMap(don.getMapPA()); // Вывод полученных данных на экран.

        return don.getMapPA();
    }
}
