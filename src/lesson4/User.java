package lesson4;

import java.util.Objects;

public class User {
    private int age;
    private int height;
    private int id;
    private String name;

    public User(int age, int height) {
        this.age = age;
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && height == user.height && id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, id, name);
    }
}
