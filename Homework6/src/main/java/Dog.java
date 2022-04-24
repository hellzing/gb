public class Dog extends Animal {
    int count;
    public Dog(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        count++;
    }
    public void animalCount() {
        System.out.println("Количество объектов класса Dog = " + count);
    }
}