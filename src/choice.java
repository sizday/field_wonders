import java.util.Scanner;

public class choice {

    public static int choice_symbol(char[] word, char[] secret_word, int count) {
        Scanner in = new Scanner(System.in);
        System.out.println("Назовите следующую букву");
        char[] symbol = in.nextLine().toLowerCase().toCharArray();
        if (symbol.length == 1) {
            for (int i = 0; i < word.length; i++) {
                char current_symbol = word[i];
                if (current_symbol == symbol[0]) {
                    secret_word[i] = word[i];
                    count += 1;
                }
            }
        }
        else
            System.out.println("Некорректный ввод");
        return count;
    }

    public static int choice_word(String word, int count) {
        Scanner in = new Scanner(System.in);
        System.out.println("Назовите слово целиком");
        String full_word = in.nextLine();
        if (full_word.equals(word)) {
            return word.length();
        }
        else {
            System.out.println("Это не то слово");
            return count;
        }
    }
}
