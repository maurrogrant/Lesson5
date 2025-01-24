package Task3;

public class Dog extends Animal implements Run {
    @Override
    public String getName() {
        return "Собака";
    }

    @Override
    public void run() {
        System.out.println(getName() + " бегает.");
    }
}
