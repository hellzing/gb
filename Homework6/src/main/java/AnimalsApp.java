
public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", Integer.parseInt("200"), Integer.parseInt("0"));
        Cat cat2 = new Cat("Мурка", Integer.parseInt("200"), Integer.parseInt("0"));
        Dog dog1 = new Dog("Шарик", Integer.parseInt("500"), Integer.parseInt("10"));
        cat1.run(10);
        cat1.swim(20);
        cat2.run(250);
        cat2.swim(0);
        dog1.run(200);
        dog1.swim(10);
        cat1.animalCount();
        dog1.animalCount();
    }
}