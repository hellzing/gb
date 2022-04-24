public class Cat extends Animal {
    static int count = 0;
    public Cat(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }
    public void animalCount() {
        System.out.println("Количество объектов класса Cat = " + count);
    }
}
