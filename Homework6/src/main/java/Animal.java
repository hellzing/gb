public class Animal {
    int count;
    String name;
    public int runDistance;
    public int swimDistance;

    public Animal() {
    }

    ;

    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(name + " ����� " + distance + "�");
        } else {
            System.out.println(name + " �� ����� ��������� " + distance + "�");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println(name + " ������ " + distance + "�");
        } else {
            System.out.println(name + " �� ����� �������� " + distance + "�");
        }
    }
}
