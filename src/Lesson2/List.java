package Lesson2;

public interface List<T> {
    void add(T elem);
    T get(int index);
    Iterator<T> iterator();
}
