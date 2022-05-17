package lesson1;
public abstract class Team implements lesson1.CanRun {
    protected String name;
    private int swimmingSpeed;
    public abstract void doSomething();
public abstract void getTime();
    public static void showTeam(Team[] team) {
        for (Team value : team) {
            System.out.println(value);
        }
    }
    public double results(lesson1.Course course){
        return course.getLength() / swimmingSpeed;
    }
    public static void showResults(Team[] team) {
        for (Team value : team) {
            value.getTime();
        }
    }
}
