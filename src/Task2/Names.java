package Task2;

import java.util.*;

public class Names {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Александр", "Олег", "Никита", "Ольга");


        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        Collections.sort(names,(o1, o2) -> o2.compareTo(o2));



        System.out.println("Список: " + names);
        System.out.println("Список с лямбдой: " + names);

    }

}
