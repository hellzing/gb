package homework4;

public class Function {
    public static double triangleArea (double a, double b, double c)
    {
        if ((a<0)||(b<0)||(c<0)) {throw new RuntimeException("Недопустимое значение");}
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

