package Task3;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Dog dog = new Dog();
        Fish fish = new Fish();

        // Утка может летать, плавать и бегать
        duck.fly();
        duck.swim();
        duck.run();

        // Собака может бегать и плавать
        dog.run();
        dog.swim();
        dog.fly(); // Показать, что собака не может летать

        // Рыба может только плавать
        fish.swim();
        fish.fly(); // Показать, что рыба не может летать
        fish.run(); // Показать, что рыба не может бегать
    }
}
