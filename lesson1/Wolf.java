package lesson1;

public class Wolf extends lesson1.Animal implements lesson1.CanSwim, lesson1.CanRun  {
    private int swimmingSpeed;
    public double time;

    public Wolf(String name, String color, int age) {
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
        System.out.println("Волк воет!");
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
        System.out.println("Я волк, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
    public double run(lesson1.Course course) {
        System.out.println("Я волк, я бегу!");
        System.out.println("Затратил " + course.getLength() / swimmingSpeed);
        time = course.getLength() / swimmingSpeed;
        return course.getLength() / swimmingSpeed;

    }
    @Override
    public void doSomething() {

    }
    @Override
    public void getTime(){
        System.out.println(name + ": " + time);
    }
}
