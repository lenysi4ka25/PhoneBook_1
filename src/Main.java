import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Телефонный справочник");

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Абсатаров Игорь", "+7-911-564-89-56");
        phoneBook.put("Баландаев Алексей", "+7-931-698-05-79");
        phoneBook.put("Воробьев Денис", "+7-900-023-02-13");
        phoneBook.put("Герман Анна", "+7-950-007-07-07");
        phoneBook.put("Дресвянкин Андрей", "+7-921-389-89-89");
        phoneBook.put("Ежова Варвара", "+7-911-221-23-41");
        phoneBook.put("Жорова Мария", "+7-999-564-64-46");
        phoneBook.put("Зимина Маргарита", "+7-901-987-64-31");
        phoneBook.put("Кулагина Юлия", "+7-911-989-98-98");
        phoneBook.put("Миронова Елена", "+7-962-159-20-58");
        System.out.println(phoneBook.get("Воробьев Денис"));
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());

        for (Map.Entry<String, String> stringStringEntry : phoneBook.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " " + stringStringEntry.getValue());
        }


    }
}