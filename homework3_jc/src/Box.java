import java.util.ArrayList;
import java.util.List;


public class Box <T extends Fruit> {
    private T fruit;
    private List<T> fruits;
    public Box() {
        fruits = new ArrayList<T>();
    }
public void add(T t){
        this.fruit = t;
        fruits.add(fruit);
}
    public Fruit get(int index) {
        return fruits.get(index);
    }

    public double getWeight() {
        double weight = 0;
        for (int i = 0; i < fruits.size(); i++) {
            weight += fruits.get(i).getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> box) {
    return(box.getWeight() == this.getWeight());
    }
    public static void boxSwap(Box<Fruit> box, Box<Fruit> box2) {
        Box<Fruit> boxnew = new Box<>();
        for (int i = 0; i < box.size(); i++) {
            boxnew.add(box.get(i));
        }
        box.clear();
        for (int i = 0; i < box2.size(); i++) {
            box.add(box2.get(i));
        }
        box2.clear();
        for (int i = 0; i < boxnew.size(); i++) {
            box2.add(boxnew.get(i));
        }
    }

    private void clear() {
        fruits.clear();
    }

    private int size() {
        return fruits.size();
    }

    public  void boxPrint() {
        for (T fruit : fruits) {
            System.out.print("Fruit: " + fruit + " " );
        }
        System.out.println();
    }

}
