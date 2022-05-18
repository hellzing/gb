package homework_jc_2;


public class Main {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1", "2", "3", "4"},{"a", "2", "3", "4"},{"1", "2", "3", "4"},{"1", "2", "3", "4"}};
arrSum(array);

    }

    public static int arrSum(String[][] arr) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        int a = 0;
        int b = 0;
        if ((arr.length != 4) || (arr[0].length != 4)|| (arr[1].length != 4)|| (arr[2].length != 4)|| (arr[3].length != 4)) {
            throw new MyArraySizeException ("Размер массива не соответсвует 4х4");
        }
        try {
            for (int i = 0; i <= arr.length; i++) {
                for (int j = 0; j <= 3; j++) {
                    a = i;
                    b = j;
                int x = Integer.parseInt(arr[i][j]);
                    sum += x;}
            }return sum;

        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Данные в ячейке массива: " + a + ", " + b +" невозможно преобразовать в Int" );}

        }
    }
