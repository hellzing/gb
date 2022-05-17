package lesson1;

public class Turtle extends lesson1.Animal implements lesson1.CanRun, lesson1.CanSwim {
    private int swimmingSpeed;
    public double time;

    public Turtle(String name, String color, int age, int swimmingSpeed) {
        super(name, color, age);
        this.swimmingSpeed = swimmingSpeed;
    }

    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук!");
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public double swim(lesson1.Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }

    @Override
    public void doSomething() {

    }

    public double run(lesson1.Course course) {
        System.out.println("Я черепаха, я бегу!");
        System.out.println("Затратил " + course.getLength() / swimmingSpeed);
        time = course.getLength() / swimmingSpeed;
        return course.getLength() / swimmingSpeed;
    }
    @Override
    public void getTime(){
        System.out.println(name + ": " + time);
    }
}
