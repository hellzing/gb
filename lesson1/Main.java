package lesson1;
import static lesson1.Utils.makeAnimalOlder;


public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1);

        Cat cat3 = new Cat("Морис", "black", 1);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6);

        Animal cat4 = new Cat("Морис", "red", 10);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }

        Animal cat6 = new Cat("Морис", "red", 10);
        cat6.voice();

        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв


        Cat catCompetitor1 = new Cat("Морис", "red", 10);
        catCompetitor1.setSwimmingSpeed(10);
        Cat catCompetitor2 = new Cat("Мурзик", "grey", 8);
        catCompetitor2.setSwimmingSpeed(8);
        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100);
        turtleCompetitor.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor);
        }

        makeAnimalOlder(cat2);

        lesson1.Team[] zveri = new lesson1.Team[]{catCompetitor1, catCompetitor2, wolfCompetitor1, turtleCompetitor};
        lesson1.Course[] course1 = {new Course(15), new Course(20), new Course(35)};
        lesson1.Course.goTeam(zveri, course1);
        lesson1.Team.showTeam(zveri);
        lesson1.Team.showResults(zveri);
    }
}
