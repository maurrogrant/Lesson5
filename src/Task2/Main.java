package Task2;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };

        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
