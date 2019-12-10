import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Приветствую тебя в поле чудес\nОтгадай мое слово\n");
        String wordString = listWord.describe();
        char[] word = wordString.toCharArray();
        String secretWordString = "*".repeat(word.length);
        char[] secretWord = secretWordString.toCharArray();
        int count = 0;
        while (count != word.length) {
            System.out.println(secretWord);
            System.out.println("1 - Отгадать слово целиком\n2 - Отгадать букву");
            String enter = in.nextLine();
            if (enter.equals("1")) {
                count = choice.choiceWord(wordString, count);
            } else if (enter.equals("2"))
                count = choice.choiceSymbol(word, secretWord, count);
            else
                System.out.println("Ошибка ввода");
        }
        System.out.println("Поздравляю с победой");
    }
}
