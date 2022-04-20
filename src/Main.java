public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); // Задание 1
        byte cat = 1;
        short dog = 2;
        int bird = 3;
        long tiger = 4L;
        float bear = 5f;
        double mouse = 5;
        char bar = 35;
        boolean dogIsAdult = dog > 7;
        //Задание 2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double boxer = firstBoxer + secondBoxer;
        System.out.println("Вес двух боксеров вместе " + boxer + " кг ");
        boxer = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров " + boxer + " кг ");
        // Задание 3
        int bananas = 5;
        int fiveBananas = bananas * 80;
        int milk = 105;
        int twoMilk = milk * 2;
        int iceCream = 100;
        int twoIceCream = iceCream * 2;
        int eggs = 4;
        int twoEggs = eggs * 70;
        int weight = fiveBananas + twoMilk + twoIceCream + twoEggs;
        System.out.println("Общий вес завтрака " + weight + " в граммах ");
        float i= weight / 1000f;
        System.out.println("Общий вес" + i + "в килограммах");
        // Задание 4
        int oneDay = 250;
        int twoDay = 500;
        int q  = 7 * 1000;
        int z = q / oneDay;
        System.out.println(z + "Дней ");
        int t = q / twoDay;
        System.out.println(t + "Дней");
        int y = oneDay + twoDay;
        float x = y / 2f;
        System.out.print(x + "Нужно в среднем дней ");

        // Задание 5
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double firstZarplata = Masha * 10 / 100;
        double secondZarplata = Denis * 10 / 100;
        double thirdZarplata = Kristina * 10 / 100;
        double premia = Masha + firstZarplata;
        double premia2 = Denis + secondZarplata;
        double premia3 = Kristina + thirdZarplata;
        double dengi1 = (premia * 12) - (Masha * 12);
        double dengi2 = (premia * 12) - (Denis * 12);
        double dengi3 = (premia * 12) - (Kristina * 12);
        System.out.print("Маша теперь получает " + premia + "рублей.Годовой доход вырос на " + dengi1 + "рублей ");
        System.out.print("Денис теперь получает " + premia2 +"рублей.Годовой доход вырос на " + dengi2 + " рублей ");
        System.out.print("Кристина теперь получает "+ premia3 +"рублей.Годовой доход вырос на "+ dengi3 + " рублей ");

    }
}