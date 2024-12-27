public class RegularPerson extends Person {
    public RegularPerson(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит медленно.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает медленно.");
    }

    @Override
    public void setRunningSpeed(int speed) {
        System.out.println(getName() + " бежит со скоростью " + speed + " км/ч.");
    }

    @Override
    public void setSwimmingStyle(String style) {
        System.out.println(getName() + " плавает стилем " + style + ".");
    }
}
