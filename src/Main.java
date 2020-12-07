import java.util.*;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.putContact("Иванов", "+7 (495) 123-45-67");
        phoneBook.putContact("Иванов", "+7 (499) 999-88-77");
        phoneBook.putContact("Петров", "+7 (495) 123-45-67");
        phoneBook.putContact("Сидоров", "+7 (495) 123-45-67");
        phoneBook.getContact("Иванов");
        phoneBook.getContact("Петров");
        phoneBook.getContact("Сидоров");

        System.out.println();

        String[] stringArray = {
                "аист",
                "велосипед",
                "заяц",
                "сокровище",
                "щука",
                "рыбак",
                "подарок",
                "писатель",
                "сокровище",
                "аист",
                "торт",
                "математика",
                "торт",
                "торт",
                "торт",
                "торт",
                "торт",
                "торт",
                "торт",
                "рыбак"
        };
        arrayElementsCount(stringArray);
    }

    public static void arrayElementsCount(String[] arr) {
        Set<String> arraySet = new HashSet<>();
        for (String i : arr) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i.equals(arr[j])) {
                    count += 1;
                }
            }
            arraySet.add(i + " " + count);
        }
        Iterator<String> iter = arraySet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
