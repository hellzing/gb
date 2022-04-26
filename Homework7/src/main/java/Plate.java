public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public Boolean decreaseFood(int n) {
        if ((food > 0) &(n <= food) ) {
            food -= n;
            return true;
        }
        else System.out.println("Not enough food on the plate");
        return false;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int more) {
        this.food += more;
    }
}