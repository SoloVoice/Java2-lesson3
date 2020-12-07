import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<String> phoneBook = new ArrayList<>();

    public void putContact(String name, String phNumber) {
        phoneBook.add(name);
        phoneBook.add(phNumber);
    }

    public void getContact(String name) {
        String[] arr = new String[phoneBook.size()];
        phoneBook.toArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == name) {
                System.out.println(arr[i] + ": " + arr[i + 1]);
            }
        }
    }
}
