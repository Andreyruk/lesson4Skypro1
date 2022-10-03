public class Main {
    public static void main(String[] args) {
    //Домашнее задание 4
        {
            //Задача 1
            System.out.println("//Задача 1");
            byte a = -128;
            System.out.println("Значение переменной a с типом byte равно " + a);
            short b = 32767;
            System.out.println("Значение переменной b с типом short равно " + b);
            int c = -2147483648;
            System.out.println("Значение переменной c с типом int равно " + c);
            long d = 2202030405L;
            System.out.println("Значение переменной d с типом long равно " + d);
        }
        {
            //Задача 2
            System.out.println("//Задача 2");
            float fraction = 27.12f;
            System.out.println("Значение переменной fraction с типом float равно " + fraction);
            long number1 = 987_678_965_549L;
            System.out.println("Значение переменной number1 с типом long равно " + number1);
            byte number2 = 2;
            System.out.println("Значение переменной number2 с типом byte равно " + number2);
            short number3 = 786;
            System.out.println("Значение переменной number3 с типом short равно " + number3);
            boolean isAlive = false;
            System.out.println("Значение переменной isAlive с типом boolean равно " + isAlive);
            {
                short number = 569;
                System.out.println("Значение переменной number с типом short равно " + number);
            }
            {
                short number = -159;
                System.out.println("Значение переменной number с типом short равно " + number);
            }
            {
                short number = 27897;
                System.out.println("Значение переменной number с типом short равно " + number);
            }
            {
                byte number = 67;
                System.out.println("Значение переменной number с типом byte равно " + number);
            }
        }
        {
            //Задача 3
            {
            System.out.println("//Задача 3 вариант 1");
            byte lyudmilaPavlovna = 23;
            System.out.println("У Людмилы Павловны - "+ lyudmilaPavlovna +" ученика");
            byte annaSergeevna = 27;
            System.out.println("У Анны Сергеевны - "+ annaSergeevna +" учеников");
            byte ekaterinaAndreevna = 30;
            System.out.println("У Екатерины Андреевны – "+ ekaterinaAndreevna +" учеников");
            int totalPaper;
            totalPaper = 480;
            short totalStudents = (short) (lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
            short paperEachStudent = (short) (totalPaper / totalStudents);
            System.out.println("Купили - " + totalPaper +" листов бумаги");
            System.out.println("Всего - " + totalStudents +" учеников");
            System.out.println("На каждого ученика рассчитано по " + paperEachStudent + " листов бумаги");
            }
            {
            System.out.println("//Задача 3 вариант 2");
            int lyudmilaPavlovna = 23;
            System.out.println("У Людмилы Павловны - "+ lyudmilaPavlovna +" ученика");
            int annaSergeevna = 27;
            System.out.println("У Анны Сергеевны - "+ annaSergeevna +" учеников");
            int ekaterinaAndreevna = 30;
            System.out.println("У Екатерины Андреевны – "+ ekaterinaAndreevna +" учеников");
            int totalPaper = 480;
            int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
            int paperEachStudent = totalPaper / totalStudents;
            System.out.println("Купили - " + totalPaper +" листов бумаги");
            System.out.println("Всего - " + totalStudents +" учеников");
            System.out.println("На каждого ученика рассчитано по " + paperEachStudent + " листов бумаги");
            }
        }
        {
            //Задача 4
            System.out.println("//Задача 4");
            int performanceMachineBottleIn2minutes = 16;
            System.out.println("Производительность машины для изготовления бутылок за 2 минуту - " + performanceMachineBottleIn2minutes + " бутылок");
            int performanceMachineBottleIn1minutes = performanceMachineBottleIn2minutes / 2;
            System.out.println("Производительность машины для изготовления бутылок за 1 минуту - " + performanceMachineBottleIn1minutes + " бутылок");
            int timeWorkMachineInMinutes = 20;
            int performanceMachineBottleIn20minutes = performanceMachineBottleIn1minutes * timeWorkMachineInMinutes;
            System.out.println("За " + timeWorkMachineInMinutes + " мнут машина произвела бутылок - " + performanceMachineBottleIn20minutes + " штук");
            int minutesInDays = 60 * 24;
            int numberDays1 = 1;
            int timeWorkMachineInMinutesPerDays1 = numberDays1 * minutesInDays;
            int performanceMachineBottleIn1Day = performanceMachineBottleIn1minutes * timeWorkMachineInMinutesPerDays1;
            System.out.println("За " + numberDays1 + " сутки машина произвела бутылок - " + performanceMachineBottleIn1Day + " штук");
            int numberDays3 = 3;
            int timeWorkMachineInMinutesPerDays3 = numberDays3 * minutesInDays;
            int performanceMachineBottleIn3Day = performanceMachineBottleIn1minutes * timeWorkMachineInMinutesPerDays3;
            System.out.println("За " + numberDays3 + " суток машина произвела бутылок - " + performanceMachineBottleIn3Day + " штук");
            int minutesInMonth = 60 * 24 * 30;
            int numberMonth1 = 1;
            int timeWorkMachineInMinutesPerMonth1 = numberMonth1 * minutesInMonth;
            int performanceMachineBottleIn1Month = performanceMachineBottleIn1minutes * timeWorkMachineInMinutesPerMonth1;
            System.out.println("За " + numberMonth1 + " месяц машина произвела бутылок - " + performanceMachineBottleIn1Month + " штук");
        }
        {
            //Задача 5
            System.out.println("//Задача 5");
            int allPots = 120;
            int potsWhitePaintPerClass = 2;
            int potsBrownPaintPerClass = 4;
            int allPotsPerClass = potsWhitePaintPerClass + potsBrownPaintPerClass;
            int totalClasses = allPots / allPotsPerClass;
            int allPotsWhitePaint = totalClasses * potsWhitePaintPerClass;
            int allPotsBrownPaint = totalClasses * potsBrownPaintPerClass;
            System.out.println("В школе, где " + totalClasses + " классов, нужно " + allPotsWhitePaint + " банок белой краски и " + allPotsBrownPaint + " банок коричневой краски");
        }
        {
            //Задача 6
            System.out.println("//Задача 6");
            int bananas = 5;
            int weightBananasInGrams = 80;
            int weightAllBananasInGrams = bananas * weightBananasInGrams;
            int milkInMilliliters = 200;
            int weightMilkInGrams = 105;
            int weightAllMilkInGrams = milkInMilliliters * weightMilkInGrams;
            int iceCream = 2;
            int weightIceCreamInGrams = 100;
            int weightAllIceCreamInGrams = iceCream * weightIceCreamInGrams;
            int eggs = 4;
            int weightEggsInGrams = 70;
            int weightAllEggsInGrams = eggs * weightEggsInGrams;
            float totalWeightInGrams = weightAllBananasInGrams + weightAllMilkInGrams + weightAllIceCreamInGrams + weightAllEggsInGrams;
            float gramsInKilogram = 1000;
            float totalWeightInKilograms = totalWeightInGrams / gramsInKilogram;
            System.out.println("Общий вес спорт-завтрака " + totalWeightInGrams + " грамм");
            System.out.println("Общий вес спорт-завтрака " + totalWeightInKilograms + " килограмм");
        }
        {
            //Задача 7
            System.out.println("//Задача 7");
            int weightInKilograms = 7;
            int gramsInKilogram = 1000;
            int weightInGrams = weightInKilograms * gramsInKilogram;
            int minLossWeightInGrams = 250;
            int maxLossWeightInGrams = 500;
            float averageLossWeightInGrams =(float) ((minLossWeightInGrams + maxLossWeightInGrams) / 2);
            int maxDaysWeightLoss = weightInGrams / minLossWeightInGrams;
            int minDaysWeightLoss = weightInGrams / maxLossWeightInGrams;
            float averageDaysWeightLoss = weightInGrams / averageLossWeightInGrams;
            System.out.println(maxDaysWeightLoss +" дней уйдёт на похудение, если спортсмен будет худеть на 250 грамм в день");
            System.out.println(minDaysWeightLoss +" дней уйдёт на похудение, если спортсмен будет худеть на 500 грамм в день");
            System.out.println(averageDaysWeightLoss +" дней уйдёт на похудение, если спортсмен будет худеть на " + averageLossWeightInGrams +" грамм в день");
        }
        {
            //Задача 8
            System.out.println("//Задача 8");
            int salaryMasha = 67760;
            int salaryDenis = 83690;
            int salaryKristina = 76230;
            float increasePerYear = 1.1f;
            float increaseSalaryMasha = salaryMasha * increasePerYear;
            float differenceSalaryMasha = increaseSalaryMasha - salaryMasha;
            System.out.println("Маша теперь получает "+ increaseSalaryMasha +" рублей. Годовой доход вырос на "+ differenceSalaryMasha +" рублей");
            float increaseSalaryDenis = salaryDenis * increasePerYear;
            float differenceSalaryDenis = increaseSalaryDenis - salaryDenis;
            System.out.println("Денис теперь получает "+ increaseSalaryDenis +" рублей. Годовой доход вырос на "+ differenceSalaryDenis +" рублей");
            float increaseSalaryKristina = salaryKristina * increasePerYear;
            float differenceSalaryKristina = increaseSalaryKristina - salaryKristina;
            System.out.println("Кристина теперь получает "+ increaseSalaryKristina +" рублей. Годовой доход вырос на "+ differenceSalaryKristina +" рублей");
        }
    }
}