package lesson4;

import java.util.Comparator;

public class Main {
    public static <T> void sort(T[] array, Comparator<T> comparator) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (comparator.compare(array[i], array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        User user1 = new User(21, 185);
        User user2 = new User(21, 185);
        System.out.println(user1.equals(user2));
        Point[] points = new Point[] {
                new Point(153, 25),
                new Point(6543, 55),
                new Point(52347, 12340),
                new Point(1000, 103),
        };
        PointComparator comparator = new PointComparator();
        sort(points, comparator);
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }
    }
}
