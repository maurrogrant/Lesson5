package Task4;

public class Athlete extends Person {
    public Athlete(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " бежит быстро.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " плавает быстро.");
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
