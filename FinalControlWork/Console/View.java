package FinalControlWork.Console;

import java.util.*;

import FinalControlWork.Console.ConsoleInterface.InterMenu;
import FinalControlWork.Console.ConsoleInterface.InterPrint;
import FinalControlWork.Console.ConsoleInterface.InterPrintArray;
import FinalControlWork.Console.ConsoleInterface.InterPrintMapSS;
import FinalControlWork.Console.ConsoleInterface.InterPrintln;
import FinalControlWork.Console.ConsoleInterface.InterShow;
import FinalControlWork.Console.ConsoleInterface.InterValueDou;
import FinalControlWork.Console.ConsoleInterface.InterValueInt;
import FinalControlWork.Console.ConsoleInterface.InterValueStr;




public class View implements InterValueDou, InterValueInt, InterValueStr, InterPrintln,
        InterShow, InterPrint, InterPrintArray, InterMenu, InterPrintMapSS {

    // --------------------- Ввод данных в консоль--------------------------//

    /**
     * Ввод данных в формате double
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override
    public Double getValueDou(String text) {
        Scanner scannerDou = new Scanner(System.in);
        System.out.print(text);
        Double dataDou = scannerDou.nextDouble();
        scannerDou.close();
        return dataDou;
    }

    /**
     * Ввод данных в формате Integer
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override
    public Integer getValueInt(String text) {
        Scanner scannerInt = new Scanner(System.in);
        System.out.print(text);
        Integer dataInt = scannerInt.nextInt();
        return dataInt;
    }

    /**
     * Ввод данных в формате String
     * 
     * @param text - текст для вывода в консоль
     * @return
     */
    @Override

    public String getValueStr(String text) {
        Scanner scannerStr = new Scanner(System.in, "Cp866");
        System.out.print(text);
        String dataStr = scannerStr.nextLine();
        return dataStr;
    }

    // ----------------------- Вывод данных в консоль ---------------------------///

    /**
     * Вывод данных в консоль в формате data + value
     * 
     * @param value - данные в виде double
     * @param data  - данные в виде String - комментарии
     */
    @Override
    public void show(Double value, String data) {
        System.out.printf("%s %f\n", data, value);

    }

    /**
     * Вывод данных в консоль с переносом на следующую строку
     * 
     * @param text
     */
    @Override
    public void println(String text) {
        System.out.println(text);
    }

    /**
     * Вывод данных в консоль без переноса на следующую строку
     * 
     * @param text
     */
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    /**
     * Вывод данных массива в консоль
     */
    @Override
    public void printArray(Integer[] array) {
        System.out.print("[ ");
        for (int index = 0; index < array.length; index++) {
            if (index != array.length - 1)
                System.out.print(array[index].toString() + ",");
            else
                System.out.print(array[index].toString() + " ]\n");

        }
    }

    /*
     * Метод вывода в консоль структуры Map
     */

    @Override
    public void printMap(Map<String, String> listMap) {

        if (listMap.get("AnimalType").equals("Собака"))// Вывод данных в консоль по собаке
        {
        System.out.print("{ ");
        System.out.print("ID собаки: " + listMap.get("ID") + ", ");
        System.out.print("Кличка собаки: " + listMap.get("Nickname") + ", ");
        System.out.print("Дата рождения собаки: " + listMap.get("BD") + ", ");
        System.out.print("Команды, которые знает собака: " + listMap.get("Skills")  + "}\n");
        } else if (listMap.get("AnimalType").equals("Кошка"))// Вывод данных в консоль по кошке
        {
            System.out.print("{ ");
            System.out.print("ID кошки: " + listMap.get("ID") + ", ");
            System.out.print("Кличка кошки: " + listMap.get("Nickname") + ", ");
            System.out.print("Дата рождения кошки: " + listMap.get("BD") + ", ");
            System.out.print("Команды, которые знает кошка: " + listMap.get("Skills")  + "}\n");
        } else if (listMap.get("AnimalType").equals("Хомяк"))// Вывод данных в консоль по хомяку
        {
            System.out.print("{ ");
            System.out.print("ID хомяка: " + listMap.get("ID") + ", ");
            System.out.print("Кличка хомяка: " + listMap.get("Nickname") + ", ");
            System.out.print("Дата рождения хомяка: " + listMap.get("BD") + ", ");
            System.out.print("Команды, которые знает хомяк: " + listMap.get("Skills")  + "}\n");
        } else if (listMap.get("AnimalType").equals("Лошадь"))// Вывод данных в консоль по лошадь
        {
            System.out.print("{ ");
            System.out.print("ID лошади: " + listMap.get("ID") + ", ");
            System.out.print("Кличка лошади: " + listMap.get("Nickname") + ", ");
            System.out.print("Дата рождения лошади: " + listMap.get("BD") + ", ");
            System.out.print("Команды, которые знает лошадь: " + listMap.get("Skills")  + "}\n");
        } else if (listMap.get("AnimalType").equals("Верблюд"))// Вывод данных в консоль по верблюду
        {
            System.out.print("{ ");
            System.out.print("ID верблюд: " + listMap.get("ID") + ", ");
            System.out.print("Кличка верблюд: " + listMap.get("Nickname") + ", ");
            System.out.print("Дата рождения верблюда: " + listMap.get("BD") + ", ");
            System.out.print("Команды, которые знает верблюд: " + listMap.get("Skills")  + "}\n");
        } else if (listMap.get("AnimalType").equals("Осёл"))// Вывод данных в консоль по ослу
        {
            System.out.print("{ ");
            System.out.print("ID осла: " + listMap.get("ID") + ", ");
            System.out.print("Кличка осла: " + listMap.get("Nickname") + ", ");
            System.out.print("Дата рождения осла: " + listMap.get("BD") + ", ");
            System.out.print("Команды, которые знает осёл: " + listMap.get("Skills")  + "}\n");
        }


    }

    public void printQueue(Queue<String> listRaffledToys){
        System.out.print("[");
        for (String dataItr : listRaffledToys) {

            System.out.print(dataItr+",");
            
        }
        System.out.println("]");
    }

    // ---------------------- Работа с интерфейсом консоли в программе -------//
    /**
     * Вывод в консоль операций по программе животных
     * 
     * @return - выбор типа действий
     */
    @Override
    public Integer Menu() {
        StringBuilder sb = new StringBuilder()
                .append("\n ==== \n")
                .append("Меню реестра домашних животных.\n")
                .append("1 - Вывод в консоль животных.\n")
                .append("2 - Ввод данных по животным.\n")
                .append("3 - Список команд, которые выполняет животное.\n")
                .append("4 - Обучить животное новым командам.\n")
                .append("0 - Выход.\n");

        println(sb.toString());

        Integer temp = getValueInt("Введите число от 0 до 4: ");
        return temp;

    }

  
   
    public String MTextType() {
        StringBuilder sb = new StringBuilder()
                .append("\n")
                .append("Выберите тип животного:\n")
                .append("1 - Домашнее животное.\n")
                .append("2 - Вьючное животное.\n")
                .append("Для выхода нажмите любую клавиши и или Enter.\n");
        println(sb.toString());

        String temp = getValueStr("Введите значение: ");
        return temp;

    }

    public String MTextKlassPets() {
        StringBuilder sb = new StringBuilder()
                .append("\n")
                .append("Выберите, по какому домашнему  животному вы хотите ввести данные:\n")
                .append("1 - Собака.\n")
                .append("2 - Кошка.\n")
                .append("3 - Хомяк.\n")
                .append("Для выхода нажмите любую клавиши и или Enter.\n");
        println(sb.toString());

        String temp = getValueStr("Введите значение: ");
        return temp;

    }

    public String MTextKlassPackAnim() {
        StringBuilder sb = new StringBuilder()
                .append("\n")
                .append("Выберите, по какому вьючному животному вы хотите ввести данные:\n")
                .append("1 - Лошадь.\n")
                .append("2 - Верблюд.\n")
                .append("3 - Осёл.\n")
                .append("Для выхода нажмите любую клавиши и или Enter.\n");
        println(sb.toString());

        String temp = getValueStr("Введите значение: ");
        return temp;

    }

}
