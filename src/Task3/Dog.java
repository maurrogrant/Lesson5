package Task3;

// Класс для собаки
public class Dog implements AnimalActions {
    @Override
    public void run() {
        System.out.println("Собака бегает.");
    }

    @Override
    public void swim() {
        System.out.println("Собака плавает.");
    }

    @Override
    public void fly() {
        System.out.println("Собака не может летать.");
    }
}
