import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Приветствую тебя в поле чудес\nОтгадай мое слово\n");
        String word_string = list_word.random_word();
        char[] word = word_string.toCharArray();
        String secret_word_string = "*".repeat(word.length);
        char[] secret_word = secret_word_string.toCharArray();
        int count = 0;
        while (count != word.length) {
            System.out.println(secret_word);
            System.out.println("1 - Отгадать слово целиком\n2 - Отгадать букву");
            String enter = in.nextLine();
            if (enter.equals("1")) {
                count = choice.choice_word(word_string, count);
            } else if (enter.equals("2"))
                count = choice.choice_symbol(word, secret_word, count);
            else
                System.out.println("Ошибка ввода");
        }
        System.out.println("Поздравляю с победой");
    }
}
