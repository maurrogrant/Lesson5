public class Parrot extends Animal implements Fly {
    @Override
    public String getName() {
        return "Попугай";
    }

    @Override
    public void fly() {
        System.out.println(getName() + " летает.");
    }
}
