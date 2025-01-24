package Task3;

public class Duck extends Animal implements Fly, Swim, Run {
    @Override
    public String getName() {
        return "Утка";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " летает.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает.");
    }

    @Override
    public void run() {
        System.out.println(getName() + " бегает.");
    }
}
