package FinalControlWork.Presenter;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;

import FinalControlWork.Console.View;

public class PreCase3 {

    View v = new View();

    public void PCase3(ArrayList<Map<String, String>> listAnimals) {

        ListIterator<Map<String, String>> itr = listAnimals.listIterator(); // Создание итератора

        String idAnimalsSkills = v.getValueStr("Введите ID животного для просмотра его команд: ");

        while (itr.hasNext()) { // Поиск совпадения по ID

            String skills = itr.next().get("ID"); // Нахождение ID в ArrayList

            if (skills.equals(idAnimalsSkills)) {
                v.println("Команды, которые знает животное: " + itr.next().get("Skills"));
                return;
            }
        }

        v.println("Животного с ID:" + idAnimalsSkills + " не существует.");

    }
}
