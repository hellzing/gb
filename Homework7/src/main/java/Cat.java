public class Cat {
    public static boolean fed;
    private String name;
    private int appetite;
    public Cat(String name, int appetite, Boolean fed) {
        this.name = name;
        this.appetite = appetite;
        this.fed = fed;
    }
    public void eat(Plate p) {
        fed = p.decreaseFood(appetite);
    }
    public void info() {
        System.out.println(name + " fed: " + fed);
    }
}
