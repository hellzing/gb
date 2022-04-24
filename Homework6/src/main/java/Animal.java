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
            System.out.println(name + " бежит " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м");
        }
    }

    public void swim(int distance) {
        if (distance <= swimDistance) {
            System.out.println(name + " плывет " + distance + "м");
        } else {
            System.out.println(name + " не может проплыть " + distance + "м");
        }
    }
}
