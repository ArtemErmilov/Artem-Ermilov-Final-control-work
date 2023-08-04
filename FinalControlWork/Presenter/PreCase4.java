package FinalControlWork.Presenter;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

import FinalControlWork.Console.View;

public class PreCase4 {

    View v = new View();

    /**
     * Добавление в новых команд для животного.
     * Поиск животного происходит по ID.
     * @param listAnimals
     */

    public void PCase4(ArrayList<Map<String, String>> listAnimals) {

        ListIterator<Map<String, String>> itr = listAnimals.listIterator(); // Создание итератора

        String textAnimalID ="Введите ID животного, которого хотите обучить новым командам: ";

        String idAnimalsSkills = v.getValueStr(textAnimalID); // Ввод ID

        
       
        while (itr.hasNext()) {
            Map <String,String> temMap = itr.next();
            if (temMap.get("ID").equals(idAnimalsSkills.toString())) {

                v.printMap(temMap);

                String oldSkills =  temMap.get("Skills"); // Нахождение команд
                System.out.println(oldSkills);

                String textAnimalNewSkills = "Введи команды, которым хотите обучить животное. Команды вводятся через запятую: ";
                String AnimalNewSkills = v.getValueStr(textAnimalNewSkills); //Ввод новых команд животного

                String b = oldSkills + " , "+ AnimalNewSkills;
                String a = "Skills";
                String saveData = v.getValueStr(
                        "\nДля сохранения данных введите y + Enter. Для выход без сохранения нажмите Enter.\n");// Подтверждение
                                                                                                                // сохранения
                if (saveData.equals("y")) {
                    temMap.put(a, b);
                    v.printMap(temMap);
                }

                return;
            }

        }

        v.println("Животного с ID:" + idAnimalsSkills + " не существует.");
        
    }
    
}
