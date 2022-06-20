package lesson9.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;

public class Main {
    /*
1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных
(любознательность определяется количеством курсов).
3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов, которые посещают этот курс.

     */
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Oleg", Arrays.asList(new Course("Math"), new Course("Biology"),
                new Course("Testing"))));
        students.add(new Student("Anton", Arrays.asList(new Course("Math"), new Course("Geography"),
                new Course("Testing6"), new Course("Testing2"))));
        students.add(new Student("Oksana", Arrays.asList(new Course("Physics"), new Course("Biology"),
                new Course("Testing"), new Course("Testing1"))));
        students.add(new Student("Svetlana", Arrays.asList(new Course("Geography"), new Course("Biology"))));
        students.add(new Student("Maksim", Arrays.asList(new Course("Math"))));
        
        System.out.println(getCourseList (students));
        System.out.println(bestStudents (students));
        System.out.println(getCourseStudents (students, new Course ("Testing")));
    }
        //1
        public static Set<Course> getCourseList (List<Student> students) {
            return (students.stream()
                    .map(s -> s.getCourses())
                    .flatMap(f -> f.stream())
                    .collect(Collectors.toSet()));
        }
        //2
   public static List<Student> bestStudents(List<Student> students) {
        return (students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));
    }
        //3
    public static List<Student> getCourseStudents(List<Student> students, Course course) {

        return (students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
