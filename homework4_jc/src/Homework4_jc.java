import java.util.*;

class Homework4_jc {

    public static void main(String[] args) {
        words();
        phonebook();
    }

    private static void words() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {"Mud", "Green", "Valve", "Gear", "Freedom", "Java",
                "Hug", "Beer", "Java", "Gear", "Cigar", "Java", "Team", "Green", "Java",
                "Gear", "Java", "Cigar", "Mood"};

        for (String word : words) {
            if (hm.containsKey(word))
                hm.put(word, hm.get(word) + 1);
            else
                hm.put(word, 1);
        }
        System.out.println(hm);
    }

    private static void phonebook() {
        Directory directory = new Directory();

        directory.add("Dean", "+7909123331");
        directory.add("Gandolfini", "391215555262");
        directory.add("Malmsteen", "89078912345");
        directory.add("Hayes", "+7958226855");
        directory.add("Kuvaev", "89875632514");
        directory.add("Hayes", "30512658625");
        directory.add("Dean", "175698789622");
        directory.add("Bodrov", "89654123654");
        directory.add("Dean", "33258896225");

        System.out.println(directory.get("Bodrov"));
        System.out.println(directory.get("Dean"));
        System.out.println(directory.get("Hayes"));
        System.out.println(directory.get("Hughes"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phonebook_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phonebook_list = directory_hm.get(surname);
            phonebook_list.add(phone_number);
            directory_hm.put(surname, phonebook_list);
        } else {
            phonebook_list = new ArrayList<>();
            phonebook_list.add(phone_number);
            directory_hm.put(surname, phonebook_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
