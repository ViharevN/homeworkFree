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
        //задание 5

        int repairSchoolDye = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int countClass = repairSchoolDye/(whitePerClass+brownPerClass);
        int whiteDye = countClass*whitePerClass;
        int brownDye = countClass*brownPerClass;
        System.out.println("В школе, где " + countClass + " классов, нужно " + whiteDye + " банок белой краски и " + brownDye +" коричневой краски");
        //задание 6

        int bananas = 5;
        int oneBananasWeight = 80;
        int oneHungredMilk = 2;
        int hundredGramsMilkWeight = 105;
        int iceCream = 2;
        int oneIceCreamWeight = 100;
        int eggs = 4;
        int oneEggWeight = 70;

        int allWeightBananas = bananas*oneBananasWeight;
        int allWeightMilk = oneHungredMilk*hundredGramsMilkWeight;
        int allWeightIceCream = iceCream*oneIceCreamWeight;
        int allWeightEggs = eggs*oneEggWeight;
        int allWeight = allWeightBananas+allWeightMilk+allWeightIceCream+allWeightEggs;
        System.out.println(allWeight + " грамм");
        double allWeightInKg = (allWeight/1000);
        System.out.println(allWeightInKg + " килограмм");
        //задание 7

        int weight = 7;
        int weightInGrams = 7*1000;
        int weightPerDayLow = 250;
        int weightPerDayHigh = 500;
        int daysForSlim = weightInGrams/weightPerDayLow;
        System.out.println(daysForSlim + " дней потребуется, если спортсмен будет худеть на " + weightPerDayLow + " грамм.");
        int daysForSlimHigh = weightInGrams/weightPerDayHigh;
        System.out.println(daysForSlimHigh + " дней потребуется, если спортсмен будет худеть на " + weightPerDayHigh + " грамм.");
        //задание 8

        double mashaCash = 67760;
        double denisCash = 83690;
        double kristinaCash = 76230;

        double plusCashMasha = mashaCash+(mashaCash*0.1);
        System.out.println("Маша теперь получает " +(int) (plusCashMasha)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusCashMasha*12))-(int)((mashaCash*12))) + " рублей");

        double plusDenisCash = denisCash+(denisCash*0.1);
        System.out.println("Денис теперь получает " +(int) (plusDenisCash)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusDenisCash*12))-(int)((denisCash*12))) + " рублей");

        double plusKristinaCash = kristinaCash+(kristinaCash*0.1);
        System.out.println("Кристина теперь получает " +(int) (plusKristinaCash)+ " рублей. " + "Годовой доход вырос на " + (((int)(plusKristinaCash*12))-(int)((kristinaCash*12))) + " рублей");


    }
}