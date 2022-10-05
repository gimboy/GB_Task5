import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1. Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
//
public class TelephoneBook {
    static Map<String, List<String>> phoneMap;

    static {
        phoneMap = new HashMap<>();
    }

    public void addPerson(String name,List<String> list) {
        phoneMap.put(name, list);
    }

    public void findPerson(String name) {
    for (Map.Entry entry : phoneMap.entrySet())
        if (entry.getKey().equals(name)) {
            System.out.println("Person find");
            break;
        } else {
            System.out.println("Person not find");
        }
    }
    public void findPhone(String number) {
        for (Map.Entry entry : phoneMap.entrySet())
            if (entry.getValue().equals(number)) {
                System.out.println("Number find");
                break;
            }
            else {
                System.out.println("Number not find");
            }
    }

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        telephoneBook.addPerson("Vasua",List.of("3432"));
        telephoneBook.addPerson("Tanya",List.of("8912","71243"));
        telephoneBook.findPerson("Tanya");

    }
}
