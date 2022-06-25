public class uzduotis2 {

    public static void main(String[] args) {
        double krastineA = 3;
        double krastineB = 2.6;
        double krastineC = 2.6;

        double perimetras = trikampioPerimetras( krastineA,krastineB,krastineC);
        System.out.println("perimetras = " + perimetras);
        int a = 2;
        int b = 4;
        int c = 2;


        int perimetrasABC = (int) trikampioPerimetras(a,b,c);
        System.out.println("perimetrasABC= " + perimetrasABC);


    }

    public static double trikampioPerimetras(double a ,double b,double c )
    {return a + b +c ;}
    }
