package FinalControlWork.Animals;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Pets implements Animals {

    // ============= Переменные ==============

    Integer id; // id животного

    String nickname; // Кличка животного

    String db; // Дата рождения животного.

    String skills; // Коканды, которые знает животное.

    String animal_class_id = "Домашние животные"; // Класс животных 1 - домашние животные, 2 - вьючные животные

    String animalType; // Тип животного (кошки, собаки, хомяки, лошадь, верблюд, ослы)

    // ============= Ввод данных ================

    /**
     * Ввод ID животного.
     * 
     * @param - ID животного.
     */
    @Override
    public void setID(Integer id) {
        this.id = id;
    }

    /**
     * Ввод клички животного.
     * 
     * @param - nickname кличка животного.
     */
    @Override
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Ввод даты рождения животного.
     * 
     * @param - db дата рождения животного.
     */
    @Override
    public void setBD(String db) {
        this.db = db;
    }

    /**
     * Ввод команд, которые знает животное.
     * 
     * @param - db команды, которые знает животное.
     */
    @Override
    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
        
    }

    

    // ========== Вывод данных =============

    /**
     * Вывод ID животного.
     * 
     * @return - ID животного.
     */
    @Override
    public Integer getID() {
        return (id);
    }

    /**
     * Вывод клички животного.
     * 
     * @param - Кличка животного.
     */
    @Override
    public String getNickname() {
        return nickname;
    }

    /**
     * Вывод дата рождения животного.
     * 
     * @param - Дата рождения.
     */
    @Override
    public String getBD() {
        return db;
    }

    /**
     * Вывод команд, которые знает животное.
     * 
     * @param - Команды.
     */
    @Override
    public String getSkills() {

        return skills;
    }

   

    /**
     * Вывод класса животных
     * Домашние животны / Вьючные животные
     * 
     * @return - класс животных
     */

    public String getAnimal_class_id() {
        return animal_class_id;
    }

    /**
     * Ввод типа животного:
     * кошки, собаки, хомяки, лошадь, верблюд, ослы.
     * 
     * @param animalType - тип животного.
     */
    public String getAnimalType() {

        return animalType;
    }

    /**
    * Вывод данных в виде Map списка.
    */
    public Map<String, String> getMapP() {
       

        Map<String, String> listDog = new LinkedHashMap<>();

        listDog.put("ID", id.toString()); // ID животного
        listDog.put("Nickname", nickname); // Кличка животного животного
        listDog.put("BD", db); // Дата рождения животного
        listDog.put("Skills", skills); // Команды, которые знает животное
        listDog.put("AnimalClass", animal_class_id); // Класс животного (вьючное, домашнее)
        listDog.put("AnimalType", animalType); // Тип животного (кошка, собака,)

        return listDog;
    }

}
