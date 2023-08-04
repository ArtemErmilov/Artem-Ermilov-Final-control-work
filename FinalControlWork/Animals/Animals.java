package FinalControlWork.Animals;

public interface Animals {
    
    public void setID (Integer id);// Ввод  ID Животного.   

    public void setNickname(String nickname); // Ввод клички животного.

    public void setBD(String db); // Ввод даты рождения.

    public void setSkills(String skills); // Ввод команд, которые знает животное.

    public Integer getID(); // Вывод ID животного.

    public String getNickname(); // Вывод клички животного.

    public String getBD(); // Вывод даты рождения.

    public String getSkills(); // Ввод команд, которые знает животное.
    
}
