import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    Random random;
    Scanner scanner;
    char[][] table;

    Homework4(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new Homework4().game();
    }

    void game(){
        System.out.println("Game is started!");
        initTable();
        printTable();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                printTable();
                System.out.println("AI WON!");
                break;
            }
        }
    }

    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == '.') return false;
            }
        }
        return true;
    }

    boolean checkWin(char symbol) {
        int z = 0;
        // проверка столбцов
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == symbol) {
                    z++;}
                else {z=0;};
            }
            if (z >= 3) {return true;}
}
        // проверка строк
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[y][x] == symbol) {
                    z++;}
                else {z=0;};
            }
            if (z >= 3) {return true;}
        }
        // проверка диагоналей
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if (x == y) {
                    if (table[x][y] == symbol) {
                    z++;} else {z=0;}
                    }
            }
            if (z >= 3) {return true;}
        }
        return false;
    }

    void turnHuman() {
        int x, y;

        do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        } while (!isCellValid(x, y));
        table[x][y] = 'x';

    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '.';
    }

    void turnAI() {
        int x, y;

        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for(int y = 0; y < 3; y++){
            for(int x = 0; x < 3; x++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}

