import java.util.Random;


public class list_word {

    public static String random_word() {
        String[] texts = {"павлин", "утконос", "крокодил", "попугай", "черепаха"};
        Random random = new Random();
        int pos = random.nextInt(texts.length);
        describe(pos);
        return texts[pos];
    }

    public static void describe(int pos) {
        String[] description = {"Впервые этот вид тропической птицы был открыт в 1758 году Карлом Линнеем. ",
                "Единственное ядовитое млекопитающее в мире",
                "Детеныши этого животного приобретают пол в зависимости от температуры окружающей среды",
                "Склонный к употреблению одних и тех же фраз чаще, чем хотелось бы",
                "Какое животное дало название распространенному в Древнем Риме способу боевого построения?"};
        System.out.println(description[pos]);
    }
}
