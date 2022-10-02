public class Main {
    public static void main(String[] args) {
        //задание 1

        int oneInt = 10;
        System.out.println(oneInt);
        double oneDouble = 20.33;
        System.out.println(oneDouble);
        float oneFloat = 20.34f;
        System.out.println(oneFloat);
        char symbol = 'C';
        System.out.println(symbol);
        short oneShort = 100;
        System.out.println(oneShort);
        long oneLong = 10000l;
        System.out.println(oneLong);
        byte oneByte = 99;
        System.out.println(oneByte);
        //задание 2

        float twoFloat = 27.12f;
        long twoLong = 987_678_965_549l;
        byte twoByte = 2;
        int twoInt = 786;
        boolean twoBoolean = false;
        short twoShort = 569;
        short freeShort = -159;
        int freeInt = 27897;
        byte freeByte = 67;
        //задание 3

        int liudmilaPavlovnaChildren = 23;
        int annaSergeevnaChildren = 27;
        int ekaterinaAndreevnaChildren = 30;
        int allPaper = 480;
        int paperPerChild = allPaper/(liudmilaPavlovnaChildren+annaSergeevnaChildren+ekaterinaAndreevnaChildren);
        System.out.println("На каждого ученика рассчитано " + paperPerChild + " листов бумаги");
        //задание 4

        int bottle = 16;
        int time = 2;
        int bottlePerMinute = bottle/time;
        System.out.println(bottlePerMinute);//1 minute
        int bottlePerTwelveMinute = bottlePerMinute*20;
        System.out.println("За 20 минут машина произвела " + bottlePerTwelveMinute + " штук"); //20 minutes
        int timeInOneDay = 60*24;
        int bottlePerOneDay = bottlePerMinute*timeInOneDay;
        System.out.println("За один день машина произвела " + bottlePerOneDay + " штук");//one day
        int bottlePerFreeDays = bottlePerOneDay*3;
        System.out.println("За 3 дня машина произвела " + bottlePerFreeDays + " штук");//3 days
        int bottlePerOneMonth = bottlePerOneDay*30;
        System.out.println("За 30 дней машина произвела " + bottlePerOneMonth + " штук");//30 days



    }
}