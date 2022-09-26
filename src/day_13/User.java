package day_13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    // В этом списке должны храниться те пользователи, на которых подписан пользователь.
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    // подписываем пользователя на пользователя user
    public void subscribe(User user) {
        if (this != user){
            this.subscriptions.add(user);
        } else {
            System.out.println("Вы не можете подписаться на самого себя");
        }
    }

    // возвращает True, если пользователь подписан на пользователя user и False, если не подписан.
    public boolean isSubscribed(User user) {
        for (User element : this.subscriptions) {
            if (user.getUsername().equals(element.getUsername())) {
                return true;
            }
        }
        return false;
    }

    // возвращает True, если пользователь user является другом и False,
    // если пользователь user не является другом.
    public boolean isFriend(User user) {
        return isSubscribed(user) && user.isSubscribed(this);
    }

    // отправляет сообщение с текстом text пользователю user.
    // Здесь должен использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this, user, text);
    }

    // возвращает строковое представление пользователя (имя пользователя).
    @Override
    public String toString() {
        return username;
    }
}
