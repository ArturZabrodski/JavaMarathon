package day_13;

/**
 * Нам необходимо создать свою небольшую социальную сеть на Java.
 * Для этого мы должны реализовать следующие классы:
 * User - сущность “Пользователь”
 * Message - сущность “Сообщение”
 * MessageDatabase - класс, который будет заниматься хранением сообщений
 * Test - класс, где в методе main() мы будем тестировать нашу соц.сеть
 * <p>
 * В методе main()этого класса необходимо создать трех пользователей.
 * Затем необходимо:
 * - Отправить 2 сообщения от пользователя 1 пользователю 2
 * - Отправить 3 сообщения от пользователя 2 пользователю 1
 * - Отправить 3 сообщения от пользователя 3 пользователю 1
 * - Отправить 3 сообщения от пользователя 1 пользователю 3
 * - Отправить 1 сообщение от пользователя 3 пользователю 1
 * Сообщения могут быть любыми.
 * После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью
 * метода showDialog().
 */

public class Test {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Hello, I am User1.");
        user1.sendMessage(user2, "How are you?");
        System.out.println();

        user2.sendMessage(user1, "Hi, User1.");
        user2.sendMessage(user1, "I am User2. Nice to meet you.");
        user2.sendMessage(user1, "I am fine. And you?");
        System.out.println();

        user3.sendMessage(user1, "Hey, I am User3.");
        user3.sendMessage(user1, "Do you remember me?");
        user3.sendMessage(user1, "We went to the same school.");
        System.out.println();

        user1.sendMessage(user3, "Hey, User3. Of course I remember you!");
        user1.sendMessage(user3, "So nice to see  you again.");
        user1.sendMessage(user3, "Let's meet up. Are you free tomorrow?");
        System.out.println();

        user3.sendMessage(user1, "Yes, I am free tomorrow. Let's go.");
        System.out.println();

        MessageDatabase.showDialog(user1, user3);

        System.out.println();

        MessageDatabase.showDialog(user1, user2);
        System.out.println();

        user1.subscribe(user3);  // подписка user1 на user3
        user1.subscribe(user1);  // Вы не можете подписаться на самого себя

        System.out.println(user1.getSubscriptions());  // [User3]
        System.out.println(user1.isSubscribed(user2)); // false
        System.out.println(user1.isSubscribed(user3)); // true

        System.out.println();

        user3.subscribe(user1);  // подписка user3 на user1
        System.out.println(user3.getSubscriptions());  // [User1]

        System.out.println(user3.isFriend(user1)); // true, т.к. друзья
        System.out.println(user1.isFriend(user3)); // true, т.к. друзья
        System.out.println(user3.isFriend(user2)); // false
    }
}
