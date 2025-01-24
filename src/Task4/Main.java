package Task4;

public class Main {
    public static void main(String[] args) {
        Person athlete = new Athlete("Иван");
        Person regularPerson = new RegularPerson("Петр");

        System.out.println("Спортсмен:");
        athlete.run();
        athlete.setRunningSpeed(20);
        athlete.swim();
        athlete.setSwimmingStyle("Кроль");

        System.out.println("\nОбычный человек:");
        regularPerson.run();
        regularPerson.setRunningSpeed(5);
        regularPerson.swim();
        regularPerson.setSwimmingStyle("Брасс");
    }
}
