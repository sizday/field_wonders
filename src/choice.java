import java.util.Scanner;

class choice {

    static int choiceSymbol(char[] word, char[] secret_word, int count) {
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
        } else
            System.out.println("Некорректный ввод");
        return count;
    }

    static int choiceWord(String word, int count) {
        Scanner in = new Scanner(System.in);
        System.out.println("Назовите слово целиком");
        String fullWord = in.nextLine();
        if (fullWord.equals(word)) {
            return word.length();
        } else {
            System.out.println("Это не то слово");
            return count;
        }
    }
}
