import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static TreeMap<Integer, List<String>> treeMaper(String[] ipt) {
        TreeMap<Integer, List<String>> tTreeMap = new TreeMap<>();
        String[] splString;

        for (String string : ipt) {
            splString = string.split(" ");
            if (!tTreeMap.isEmpty()) {
                for (int keys : tTreeMap.keySet())
                    if (tTreeMap.get(keys).contains(splString[0])) {
                        tTreeMap.get(keys).remove(splString[0]);
                        if (tTreeMap.get(keys).size() == 0) {
                            tTreeMap.remove(keys);
                        }
                        keys++;
                        if (tTreeMap.containsKey(keys)) {
                            tTreeMap.get(keys).add(splString[0]);
                        } else {
                            tTreeMap.put(keys, new ArrayList(List.of(splString[0])));
                        }
                    } else {
                        if (tTreeMap.containsKey(1)) {
                            tTreeMap.get(1).add(splString[0]);
                            break;
                        } else {
                            tTreeMap.put(1, new ArrayList(List.of(splString[0])));
                            break;
                        }
                    }
            } else {
                tTreeMap.put(1, new ArrayList(List.of(splString[0])));
            }
        }
        return tTreeMap;
    }

    public static void main(String[] args) {
        String[] input = {"Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Ио Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"};
        System.out.println(treeMaper(input));
    }
}
