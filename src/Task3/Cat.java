package Task3;

public class Cat extends Animal implements Run {
    @Override
    public String getName() {
        return "Кошка";
    }

    @Override
    public void run() {
        System.out.println(getName() + " бегает.");
    }
}
