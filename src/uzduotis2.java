public class uzduotis2 {

    public static void main(String[] args) {
         double  a = 3;
         double b = 2;
         double c = 2;

        double p = trikampioPerimetras( a,b,c);
        System.out.println("Perimetras= " + p);

        double S = plotas(p,a,b,c);
        System.out.println("Plotas = " + S);






    }

    public static double trikampioPerimetras(double a ,double b,double c )
    {return  a + b +c ;}

    public static double plotas(double p,double a,double b,double c) {
     double  plotas =Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
        return plotas;
    }



    }



