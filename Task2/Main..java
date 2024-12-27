public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal parrot = new Parrot();

        System.out.println("Животные:");
        System.out.println(dog.getName());
        System.out.println(cat.getName());
        System.out.println(parrot.getName());
    }
}
