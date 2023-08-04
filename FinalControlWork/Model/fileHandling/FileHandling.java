package FinalControlWork.Model.fileHandling;

import java.io.*;

import java.util.*;


public class FileHandling {
    /*
     * Работа с фалами
     */

    //String path = "C:/Users/SBB2-Ермилов Артём/YandexDisk-artyomermiloff/GeegBrains/Обучение/Итоговая контрольная работа/Final control work/";// Место
                                                                                                                                 // хранения
                                                                                                                                 // файла
                                                                                                                                 // на
                                                                                                                                 // компьютере
    String path = "";

    String nameFileToy = "FinalControlWork/Animals.txt"; // Название файла для хранения списка игрушек розыгрыша.


    public void saveData(ArrayList<Map<String, String>> listMap) {
        /*
         * Создание файл и запись данных данных игрушек для розыгрыша
         */

        String dataFile = path + nameFileToy; // Файл, куда записываются данные с игрушками

        ListIterator<Map<String, String>> itr = listMap.listIterator(); // Создание итератора

        try (FileWriter fw = new FileWriter(dataFile, false)) // Запись данных в файл
        {

            while (itr.hasNext()) {
                Map<String, String> list = itr.next();

                fw.append(list.get("ID") + "\n");
                fw.append(list.get("Nickname") + "\n");
                fw.append(list.get("BD") + "\n");
                fw.append(list.get("Skills") + "\n");
                fw.append(list.get("AnimalClass") + "\n");
                fw.append(list.get("AnimalType") + "\n");

            }
        }

        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public ArrayList<Map<String, String>> readData() {

        /*
         * Чтение файла где хранятся данные по игрушкам для розыгрыша
         */

        String dataFile = path + nameFileToy; // Файл, куда записываются данные с игрушками

        ArrayList<Map<String, String>> listMap = new ArrayList();

        ArrayList<String> listRedData = new ArrayList();

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(dataFile));
            String tempData;
            while ((tempData = br.readLine()) != null) {

                listRedData.add(tempData);

            }

            ListIterator<String> itr1 = listRedData.listIterator(); // Создание итератора
            Integer tempIndexNew = 0;
            while (itr1.hasNext()) {
                String c = itr1.next();
                tempIndexNew++;
            }
            ListIterator<String> itr = listRedData.listIterator();
            Integer tempIndex = 0;
            // Чтение данных из файла и запись их listMap
            while (tempIndexNew != tempIndex) {

                Map<String, String> listToy = new HashMap<String, String>();
                while (itr.hasNext()) {

                    String b = itr.next();
                    
                    if (tempIndex % 6 == 0) {
                        String a = "ID";
                        System.out.println(b);
                        listToy.put(a, b);
                    } else if (tempIndex % 6 == 1) {
                        String a = "Nickname";
                        listToy.put(a, b);
                    } else if (tempIndex % 6 == 2) {
                        String a = "BD";
                        listToy.put(a, b);
                    } else if (tempIndex % 6 == 3) {
                        String a = "Skills";
                        listToy.put(a, b);
                    } else if (tempIndex % 6 == 4) {
                        String a = "AnimalClass";
                        listToy.put(a, b);
                    } else if (tempIndex % 6 == 5) {
                        String a = "AnimalType";
                        listToy.put(a, b);
                        listMap.add(listToy);
                        tempIndex++;
                        break;
                    }
                    tempIndex++;

                }
            }

            br.close();

        } catch (

        FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return listMap;

    }

}
