public class Employee {
    public String fullName;
    public String position;
    public String email;
    public String phone;
    public String salary;
    public int age;

public Employee(String fullName, String position, String email, String phone, String salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void info() {
        System.out.println("id: " + fullName + "; Имя пользователя: " + salary + "; " +
                "Должность: " + position + "; Возраст: " + age);

    }
}
