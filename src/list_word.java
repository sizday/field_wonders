import java.util.Random;


class list_word {

    private static String random_word(int pos) {
        String[] texts = {"павлин", "утконос", "крокодил", "попугай", "черепаха"};
        return texts[pos];
    }

    static String describe() {
        String[] description = {"Впервые этот вид тропической птицы был открыт в 1758 году Карлом Линнеем. ",
                "Единственное ядовитое млекопитающее в мире",
                "Детеныши этого животного приобретают пол в зависимости от температуры окружающей среды",
                "Склонный к употреблению одних и тех же фраз чаще, чем хотелось бы",
                "Какое животное дало название распространенному в Древнем Риме способу боевого построения?"};
        Random random = new Random();
        int pos = random.nextInt(description.length);
        System.out.println(description[pos]);
        return random_word(pos);
    }
}
