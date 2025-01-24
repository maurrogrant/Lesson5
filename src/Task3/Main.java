package Task3;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal parrot = new Parrot();
        Animal duck = new Duck();

        System.out.println("Животные:");
        System.out.println(dog.getName());
        dog.run();

        System.out.println(cat.getName());
        cat.run();

        System.out.println(parrot.getName());
        parrot.fly();

        System.out.println(duck.getName());
        duck.fly();
        duck.swim();
        duck.run();
    }
}
