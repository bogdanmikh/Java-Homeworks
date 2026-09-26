package lesson5;

import java.util.ArrayList;
import java.util.Objects;

public class BankService implements UsersService {
    ArrayList<User> users;

    public BankService() {
        users = new ArrayList<>();
    }

    private static class User {
        String email;
        String password;

        public User(String email, String password) {
            this.email = email;
            this.password = password;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(email, user.email) && Objects.equals(password, user.password);
        }

        @Override
        public int hashCode() {
            return Objects.hash(email, password);
        }
    }
    @Override
    public void signUp(String email, String password) {
        if (!email.contains("@")) {
            throw new BadEmailException("Неправильный формат почты");
        }
        if (password.length() < 7 || !password.matches(".*[1234567890].*") || !password.matches(".*[a-zA-Z].*")) {
            throw new BadPasswordException("Неправильный формат пароля");
        }
        users.add(new User(email, password));
    }

    @Override
    public void signIn(String email, String password) {
        User user = new User(email, password);
        for (User bankUser : users) {
            if (bankUser.equals(user)) {
                return;
            }
        }
        throw new UserNotFoundException("User не найден");
    }
}
