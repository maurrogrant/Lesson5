package Task3;

// Класс для рыбы
public class Fish implements AnimalActions {
    @Override
    public void swim() {
        System.out.println("Рыба плавает.");
    }

    @Override
    public void fly() {
        System.out.println("Рыба не может летать.");
    }

    @Override
    public void run() {
        System.out.println("Рыба не может бегать.");
    }
}
