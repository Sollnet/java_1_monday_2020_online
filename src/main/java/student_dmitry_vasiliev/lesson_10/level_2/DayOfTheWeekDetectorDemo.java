package student_dmitry_vasiliev.lesson_10.level_2;
/* - Task_5
Создайте класс DayOfTheWeekDetectorDemo.

        Цель этой программы:
        - запросить у пользователя число;
        - с помощью одной из имплементаций интерфейса DayOfTheWeekDetector найти название дня недели;
        - вывести на консоль найденное название.

        В классе DayOfTheWeekDetectorDemo создайте конструктор класса, который принимает один параметр
        типа DayOfTheWeekDetector (интерфейс). Через этот конструктор в класс будет подаваться
        имплементация интерфейса, которую программа должна использовать для нахождения названия
        дня недели. Сохраните переданную инстанцию DayOfTheWeekDetector в свойство класса для того,
        чтобы использовать её в дальнейшем.

        В классе DayOfTheWeekDetectorDemo создайте метод void run() в котором реализуйте саму программу.

        Теперь при создании экземпляра класса DayOfTheWeekDetectorDemo ему в конструктор можно подать любую
        из трёх имплементаций интерфейса.

        Создайте в классе DayOfTheWeekDetectorDemo метод main() в котором продемонстрируйте создание и использование
        экземпляра класса DayOfTheWeekDetectorDemo с разными алгоритмами нахождения названия дня недели.

        Убедитесь, что в не зависимости от того, какая реализация алгоритма используется для определения
        названия дня недели, программа DayOfTheWeekDetectorDemo работает одинаково.*/

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector thisDayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector impl) {
        this.thisDayOfTheWeekDetector = impl;
    }

    void run() {

        System.out.println("Enter day number please...");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Day of the week is " + thisDayOfTheWeekDetector.detectDayName(number) + "!");
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifImplementation.run();
        DayOfTheWeekDetectorDemo switchImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchImplementation.run();
        DayOfTheWeekDetectorDemo arrayImplementation = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        arrayImplementation.run();
    }

}
