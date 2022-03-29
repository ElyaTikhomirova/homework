package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задание 1

        byte a = 5;
        short b = 322;
        int c = 33009;
        long d = 7_900_455_122L;
        float i = 3.678f;
        double f = 1.3789;
        char g = 38;
        System.out.println(g);
        boolean h = c > 18;

    // Задание 2
        float boxer1Weight = 78.2f;
        float boxer2Weight = 82.7f;
        float bothWeight = boxer1Weight + boxer2Weight;
        float differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес двух бойцов " + bothWeight);
        System.out.println("Разница между весами бойцов " + differenceWeight);

    // Задание 3
        short bananas = 5;
        short bananaWeight = 80;
        short milk = 200;
        short milk100Ml = 105;
        short icecream = 2;
        short icecreamWeight = 100;
        short eggs = 4;
        short eggsWeight = 70;
        int productsWeight = bananas * bananaWeight + milk100Ml + milk100Ml + icecream * icecreamWeight + eggs * eggsWeight;
        System.out.println("Вес спорт-завтрака в граммах " + productsWeight);
        int kg1 = 1000;
        float weightKg = productsWeight / (float) kg1;
        System.out.println("Вес продуктов в килограммах " + weightKg);

  // Задание 4
        float boxerWeight = 78.2f;
        byte lossWeight = 7;
        int lossWeightG = lossWeight * kg1;
        System.out.println("Необходимо потерть в граммах " + lossWeightG);
        short dailyLoss1 = 250;
        short dailyLoss2 = 500;
        int days1 = lossWeightG / dailyLoss1;
        int days2 = lossWeightG / dailyLoss2;
        System.out.println("Количество дней при потере 250 г в день " + days1);
        System.out.println("Количество дней при потере 500 г в день " + days2);


    // Задание 5
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKris = 76_230;
        double increase = 0.1;
        double newSalaryMasha = salaryMasha * increase + salaryMasha;
        System.out.println("Теперь Маша получает " + newSalaryMasha);
        double newSalaryDenis = salaryDenis * increase + salaryDenis;
        System.out.println("Теперь Денис получает " + newSalaryDenis);
        double newSalaryKris = salaryKris * increase + salaryKris;
        System.out.println("Теперь Кристина получает " + newSalaryKris);
        byte months = 12;
        int yearSalaryMasha = salaryMasha * months;
        double yearSalaryMasha2 = newSalaryMasha * months;
        double differenceMasha = yearSalaryMasha2 - yearSalaryMasha;
        System.out.println("Разница в годовой зарплате у Маши " + differenceMasha);
        int yearSalaryDenis = salaryDenis * months;
        double yearSalaryDenis2 = newSalaryDenis * months;
        double differenceDenis = yearSalaryDenis2 - yearSalaryDenis;
        System.out.println("Разница годовой зарплаты Дениса " + differenceDenis);
        int yearSalaryKris = salaryKris * months;
        double yearSalaryKris2 = newSalaryKris * months;
        double differenceKris = yearSalaryKris2 - yearSalaryKris;
        System.out.println("Разница годовой зарплаты Кристины " + differenceKris);

        }










    }

