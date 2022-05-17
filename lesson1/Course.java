package lesson1;

public class Course  {
    private double length;

    public Course(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getTimeToOvercomeCourse(lesson1.CanRun runner) {
        return runner.run(this);
    }
    public static void goTeam(lesson1.Team[] team, Course[] courses){
        for (int i = 0; i < team.length; i++) {
for (Course course : courses) {
            course.getTimeToOvercomeCourse(team[i]);
        }
    }}

}



