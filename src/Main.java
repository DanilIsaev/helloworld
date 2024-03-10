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


    }
}