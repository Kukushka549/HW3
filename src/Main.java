public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        byte arms = 2;
        short ants = 1000;
        int cockroach = 200000;
        long stars = 3000000;
        float smallPi = 3.14f;
        double largePi = 3.1415926535;

        System.out.println("Значение переменной arms с типом byte равно " + arms);
        System.out.println("Значение переменной ants с типом short равно " + ants);
        System.out.println("Значение переменной cockroach с типом int равно " + cockroach);
        System.out.println("Значение переменной stars с типом long равно " + stars);
        System.out.println("Значение переменной smallPi с типом float равно " + smallPi);
        System.out.println("Значение переменной largePi с типом double равно " + largePi);

        float first = 27.12f;
        long second = 987678965549L;
        float third = 2.786f;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;

        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short paper = 480;

        int paperOnOneStudent = (short) paper/(firstClass+secondClass+thirdClass);

        System.out.println("На каждого ученика рассчитано "+ paperOnOneStudent + " листов бумаги. ");

        int efficiency = (byte) 16/2;
        byte time = 1;
        int twentyMinutes = (byte) time*20;
        int hour = (byte) time * 60;
        int day = (short) hour * 24;
        int threeDays = (int) day*3;
        int month1 = (int) day * 30;
        int month2 = (int) day * 31;
        int february1 = (int) day * 28;
        int february2 = (int) day * 29;

        System.out.println("За " + twentyMinutes + " минут машина произвела " + (efficiency*time*20) + " бутылок. ");
        System.out.println("В одном дне " + day + " минут. ");
        System.out.println("За " + day + " минут машина произвела " + (efficiency*day) + " бутылок. ");
        System.out.println("В трёх днях " + threeDays + " минут. ");
        System.out.println("За " + threeDays + " минут машина произвела " + (efficiency*threeDays) + " бутылок. ");
        System.out.println("Если в месяце 30 дней, то в нём " + month1 + " минут. ");
        System.out.println("За " + month1 + " минут машина произвела " + (efficiency*month1) + " бутылок. ");
        System.out.println("Если в месяце 31 день, то в нём " + month2 + " минут. ");
        System.out.println("За " + month2 + " минут машина произвела " + (efficiency*month2) + " бутылок. ");
        System.out.println("Если это февраль с 28-ю днями, то в нём " + february1 + " минут. ");
        System.out.println("За " + february1 + " минут машина произвела " + (efficiency*february1) + " бутылок. ");
        System.out.println("Если это февраль с 29-ю днями, то в нём " + february2 + " минут. ");
        System.out.println("За " + february2 + " минут машина произвела " + (efficiency*february2) + " бутылок. ");

        byte allPrint = 120;
        byte brownPrint = 4;
        byte whitePrint = 2;
        int print = (byte) brownPrint + whitePrint;
        int classes = (byte) allPrint / print;
        int allBrownPrint = (byte) brownPrint * classes;
        int allWhitePrint = (byte) whitePrint * classes;

        System.out.println("В школе, где " + classes + " классов, нужно " + allWhitePrint + " банок белой краски и " + allBrownPrint + " банок коричневой краски. ");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;

        int milkshake = (short) banana*5 + milk*2 + iceCream*2 + egg *4;
        float milkshakeKg = (float) milkshake/1000;

        System.out.println("Милкшейк данного спортсмена будет весить " + milkshake + " грамм, или " + milkshakeKg + " кг. ");

        short weight = 7000;
        short ration1 = 250;
        short ration2 = 500;

        int result1 = weight/ration1;
        int result2 = weight/ration2;
        int average = (byte) (result1+result2)/2;

        System.out.println("При похудении по " + ration1 + " грамм в день понадобится " + result1 + " дней. ");
        System.out.println("При похудении по " + ration2 + " грамм в день понадобится " + result2 + " дней. ");
        System.out.println("В среднем, на похудение уйдёт " + average + " дней.");

        int masha = 67760;
        int denis = 83690;
        int kris = 76230;

        int mashaYear = masha*12;
        int denisYear = denis*12;
        int krisYear = kris*12;

        int mashaNew = masha/100*110;
        int denisNew = denis/100*110;
        int krisNew = kris/100*110;

        int mashaYearNew = mashaYear/100*110;
        int densYearNew = denisYear/100*110;
        int krisYearNew = krisYear/100*110;

        System.out.println("Маша теперь получает " + mashaNew + " рублей. Разница в годовом доходе составила " + (mashaYearNew-mashaYear) + " рублей. ");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Разница в годовом доходе составила " + (densYearNew-denisYear) + " рублей. ");
        System.out.println("Кристина теперь получает " + krisNew + " рублей. Разница в годовом доходе составила " + (krisYearNew-krisYear) + " рублей. ");
    }
}