public class Main {
    public static void main(String[] args) {

        System.out.println("Привет, Мир!");
        System.out.println("Hello World!!!");

        // Тема занятия: Переменные
        // Задача 1

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4

        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);

        // Задача 5

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6

        var massFighter1 = 78.1;
        var massFighter2 = 82.7;

        var massSum = massFighter1 + massFighter2;
        var massDiff = massFighter1 - massFighter2;
        System.out.println("Общая масса бойцов:" + massSum);
        System.out.println("Разность между массами бойцов:" + massDiff);

        // Задача 7

        var massRemainsDiv = massFighter2 % massFighter1;
        System.out.println(massRemainsDiv);

        // Задача 8.1

        var totalWorkingTime = 640;
        var oneWorkingTime = 8;

        var countEmployees = totalWorkingTime / oneWorkingTime;
        System.out.println("Всего работников в компании — " + countEmployees + " человек");

        // Задача 8.2

        var modifiedCountEmployees = 94;

        modifiedCountEmployees = countEmployees + modifiedCountEmployees;
        var modifiedOneWorkingTime = totalWorkingTime / modifiedCountEmployees;
        System.out.println("Если в компании работает " + modifiedCountEmployees + " человек, то всего " + modifiedOneWorkingTime + " часов работы может быть поделено между сотрудниками");

        // Тема занятия: Переменные 2
        // Задача 1

        int intVariable = 300000;
        byte byteVariable = 126;
        short shortVariable = 32000;
        long longVariable = 9111111111L;
        float floatVariable = 32.32f;
        double doubleVariable = 2.23112311231123123;

        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);

        // Задача 2

        float varTask2_1 = 27.12f;
        long varTask2_2 = 987678965549L;
        float varTask2_3 = 2.786f;
        short varTask2_4 = 569;
        short varTask2_5 = -159;
        short varTask2_6 = 27897;
        byte varTask2_7 = 67;

        System.out.println(varTask2_1);
        System.out.println(varTask2_2);
        System.out.println(varTask2_3);
        System.out.println(varTask2_4);
        System.out.println(varTask2_5);
        System.out.println(varTask2_6);
        System.out.println(varTask2_7);


        // Задача 3

        short classLudmilaPavlovna = 23;
        short classAnnaSergyvna = 27;
        short classEkaterinaAndreivna = 30;
        short numberSheets = 480;
        int resultNumberSheets = numberSheets / (classAnnaSergyvna + classLudmilaPavlovna + classEkaterinaAndreivna);

        System.out.println("На каждого ученика рассчитано " + resultNumberSheets + " листов бумаги");

        // Задача 4

        short performance2Minutes = 16;
        int performanceMinutes = performance2Minutes / 2;
        int performance20Minutes = performanceMinutes * 20;
        int performanceDay = performanceMinutes * 60 * 24; // Производительность за минуту умноженная на количество минут в часе и количество часов в сутках
        int performance3Day = performanceDay * 3;
        int performance30Day = performanceDay * 30; // в месяце 30 дней
        int performance31Day = performanceDay * 31; // в месяце 31 день
        int performance28Day = performanceDay * 28; // в месяце 28 дней
        int performance29Day = performanceDay * 29; // в месяце 29 дней

        System.out.println("За 20 минут машина произвела " + performance20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + performanceDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performance3Day + " штук бутылок");
        System.out.println("За месяц из 28 дней машина произвела " + performance28Day + " штук бутылок");
        System.out.println("За месяц из 29 дней машина произвела " + performance29Day + " штук бутылок");
        System.out.println("За месяц из 30 дней машина произвела " + performance30Day + " штук бутылок");
        System.out.println("За месяц из 31 дня машина произвела " + performance31Day + " штук бутылок");

        // Задача 5

        int numbersPaint = 120;
        int numbersWriteClass = 2;
        int numbersBrowClass = 4;

        int numbersClass = numbersPaint / (numbersWriteClass + numbersBrowClass);
        int numbersWriteCans = numbersClass * numbersWriteClass;
        int numbersBrowCans = numbersClass * numbersBrowClass;
        System.out.println("В школе, где " + numbersClass + " классов, нужно " + numbersWriteCans + " банок белой краски и " + numbersBrowCans + " банок коричневой краски");


        // Задача 6

        byte quantityBanana = 5;
        byte quantityMilk100Ml = 2;
        byte quantityIceCream = 2;
        byte quantityEgg = 4;
        byte weightBanana = 80;
        byte weightMilk100Ml = 105;
        byte weightIceCream = 100;
        byte weightEgg = 70;

        int totalWeightGrams = quantityBanana * weightBanana + quantityMilk100Ml * weightMilk100Ml + quantityIceCream * weightIceCream + quantityEgg * weightEgg;
        float totalWeightKilograms = (float) totalWeightGrams / 1000;

        System.out.println("Вес спортзавтрака в граммах = " + totalWeightGrams);
        System.out.println("Вес спортзавтрака в килограммах = " + totalWeightKilograms);

        // Задачам 7

        int overWeightKG = 7;
        int translationKg = 1000;
        int weightLoss250 = 250;
        int weightLoss500 = 500;

        float daysLose250 = (float) (overWeightKG * translationKg) / weightLoss250;
        float daysLose500 = (float) (overWeightKG * translationKg) / weightLoss500;
        float daysAverage = (daysLose250 + daysLose500) / 2;

        System.out.println("Если необходимо терять 250 грамм в день, необходимо потратить " + daysLose250 + " дней");
        System.out.println("Если необходимо терять 500 грамм в день, необходимо потратить " + daysLose500 + " дней");
        System.out.println("В среднем необходимо потратить " + daysAverage + " дней");

        // Задача 8

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float monthCoefficient = 0.1f; // повышение в 10%
        int monthsOfYear = 12;

        // ЗП после повышения на 10%
        float salaryMashaInc = (float) salaryMasha + (salaryMasha * monthCoefficient);
        float salaryDenisInc = (float) salaryDenis + (salaryDenis * monthCoefficient);
        float salaryKristinaInc = (float) salaryKristina + (salaryKristina * monthCoefficient);

        // Изменение годового дохода
        float annualIncomeChangeMasha = (salaryMashaInc - salaryMasha) * monthsOfYear;
        float annualIncomeChangeDenis = (salaryDenisInc - salaryDenis) * monthsOfYear;
        float annualIncomeChangeKristina = (salaryKristinaInc - salaryKristina) * monthsOfYear;

        System.out.println("Маша теперь получает " + salaryMashaInc + " рублей. Годовой доход вырос на " + annualIncomeChangeMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisInc + " рублей. Годовой доход вырос на " + annualIncomeChangeDenis + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaInc + " рублей. Годовой доход вырос на " + annualIncomeChangeKristina + " рублей");

        // Тема занятия: Условный оператор
        // Задача 1

        int age = 18;

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ",он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temperatureStreet = 16;

        if (temperatureStreet < 5) {
            System.out.println("На улице " + temperatureStreet + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureStreet + " градусов, можно идти без шапки");
        }

        // Задача 3
        int driverSpeed = 70;

        if (driverSpeed > 60) {
            System.out.println("Если скорость " + driverSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + driverSpeed + ", то можно ездить спокойно");
        }

        // Задача 4
        int ageHuman = 23;

        if (ageHuman > 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        // Задача 5
        int ageBaby = 13;

        if (ageBaby <= 5) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему нельзя кататься на аттракционе");
        } else if (ageBaby > 5 && ageBaby <= 14) {
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else
            System.out.println("Если возраст ребенка равен " + ageBaby + ", то ему можно кататься на аттракционе без сопровождения взрослого");


        // Задача 6
        int maxPlace = 102;
        int seatPlace = 60;
        int busyPlace = 62;

        if (busyPlace < seatPlace) {
            System.out.printf("В вагоне есть свободные сидячие места, их количество: %d \n", seatPlace - busyPlace);
        } else if (busyPlace < maxPlace) {
            System.out.printf("В вагоне есть свободные стоячие места, их количество: %d \n", maxPlace - seatPlace - (busyPlace - seatPlace));
        } else
            System.out.println("Вагон полностью забит");

        // Задача 7
        int one = 1;
        int two = 5;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Число one большее из трех чисел");
        } else if (two > three) {
            System.out.println("Число two большее из трех чисел");
        } else if (three > two) {
            System.out.println("Число three большее из трех чисел");
        } else
            System.out.println("Есть равные числа");

        // Тема занятия - условные операторы 2
        // Задача 1
        int currentOs = 1;

        switch (currentOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Данная операционная система не поддерживается разработчиком");
        }

        // Задача 2
        int clientDeviceYear = 2014;

        switch (currentOs) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else
                    System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else
                    System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Данная операционная система не поддерживается разработчиком");
        }

        // Задача 3
        int year = 1600;

        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year > 1584 && year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year >= 1584) {
            System.out.println(year + " год не является високосным");
        } else
            System.out.println(year + " год не входит в список високосных");

        // Задача 4
        int deliveryDistance = 95;
        int deliveryTime;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else
            System.out.println("Доставки нет");

        // Задача 5
        int monthNumber = 4;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц - это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц - это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц - это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц - это осень");
                break;
            default:
                System.out.println("Ошибка, введеное число не является месяцем календаря");
                break;
        }

        // Тема: циклы 1
        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача 3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача 7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        // Задача 8
        int moneySaving = 29000;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + moneySaving * i + " рублей");
        }
    }
}