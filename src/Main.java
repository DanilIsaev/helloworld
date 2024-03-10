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

        var countEmployees = totalWorkingTime/oneWorkingTime;
        System.out.println("Всего работников в компании — " + countEmployees + " человек");

        // Задача 8.2

        var modifiedCountEmployees = 94;

        modifiedCountEmployees = countEmployees + modifiedCountEmployees;
        var modifiedOneWorkingTime = totalWorkingTime / modifiedCountEmployees;
        System.out.println("Если в компании работает " + modifiedCountEmployees + " человек, то всего " + modifiedOneWorkingTime + " часов работы может быть поделено между сотрудниками");

        // Тема занятия: Переменные 2
        // Задача 1

        int     intVariable = 300000;
        byte    byteVariable = 126;
        short   shortVariable = 32000;
        long    longVariable = 9111111111L;
        float   floatVariable = 32.32f;
        double  doubleVariable = 2.23112311231123123;

        System.out.println("Значение переменной intVariable с типом int равно "         + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно "       + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно "     + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно "       + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно "     + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно "   + doubleVariable);

        // Задача 2

        float   varTask2_1 = 27.12f;
        long    varTask2_2 = 987678965549L;
        float   varTask2_3 = 2.786f;
        short   varTask2_4 = 569;
        short   varTask2_5 = -159;
        short   varTask2_6 = 27897;
        byte    varTask2_7 = 67;

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


    }
}