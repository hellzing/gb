public class Exponentiate {
    public static int pow(int value, int powValue) {
        if (powValue < 0) {
            System.out.println("Not implemented");
            System.exit(1);}

        if (powValue == 1) {
            return value;
        } else
            if (powValue == 0) {
            return 1;
        }
            else
            return value * pow(value, powValue - 1);

    }}

