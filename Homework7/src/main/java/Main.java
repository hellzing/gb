public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[10];
        catArray[0] = new Cat("Barsik", 5, false);
        catArray[1] = new Cat("Ryzhik", 10, false);
        catArray[2] = new Cat("Simka", 20, false);
        catArray[3] = new Cat("Murka", 12, false);
        catArray[4] = new Cat("Zayka", 15, false);
        catArray[5] = new Cat("Murzik", 11, false);
        catArray[6] = new Cat("Matroskin", 16, false);
        catArray[7] = new Cat("Pushok", 7, false);
        catArray[8] = new Cat("Snezhok", 12, false);
        catArray[9] = new Cat("Laska", 8, false);
        Plate plate = new Plate(100);
        plate.info();
        for (int i = 0; i < 10; i++) {
            catArray[i].eat(plate);
            plate.info();
            catArray[i].info();
            plate.addFood(1);
        }
    }
}