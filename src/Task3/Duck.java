package Task3;

// Класс для утки
public class Duck implements AnimalActions {
    @Override
    public void fly() {
        System.out.println("Утка летит.");
    }

    @Override
    public void swim() {
        System.out.println("Утка плавает.");
    }

    @Override
    public void run() {
        System.out.println("Утка бегает.");
    }
}
