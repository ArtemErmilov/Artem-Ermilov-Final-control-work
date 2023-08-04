package FinalControlWork.Model.ModelMethod;

import java.util.*;

public class MetIdDefinition {

    public Integer getID (ArrayList<Map<String, String>> listAnimals){
        /**
         * Автоматическое присваивание ID
         */

        Integer indexID = 0;

        ListIterator<Map<String, String>> itr = listAnimals.listIterator(); // Создание итератора 

        while (itr.hasNext()) {
            indexID=Integer.parseInt(itr.next().get("ID")); // Нахождение ID в ArrayList
        }
        
        indexID ++;

        return indexID;

    }
    
}
