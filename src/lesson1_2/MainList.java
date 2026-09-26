package lesson1_2;

public class MainList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Богдан");
        strings.add("Тимур");
        strings.add("Артур");
        strings.add("Миша");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
