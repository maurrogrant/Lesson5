public abstract class Person implements Run, Swim {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public abstract void run();

    @Override
    public abstract void swim();
}
