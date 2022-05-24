public class Fruitbox_main {
    public static void main(String[] args) {
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();


        box1.add(orange);
        box1.add(orange);
        box2.add(apple);
        box2.add(apple);
        box2.add(apple);

        box1.boxPrint();
        box2.boxPrint();

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box.boxSwap(box1, box2);

        box1.boxPrint();
        box2.boxPrint();

    }


}
