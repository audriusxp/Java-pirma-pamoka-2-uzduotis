public class uzduotis2 {

    public static void main(String[] args) {
         double  a = 3;
         double b = 2;
         double c = 2;
       int x = (int) 3.3;
       int y = (int) 3.8;
       int z = (int) 3.3;
      int P = (int) trikampioPerimetras(x,y,z);
        System.out.println("Perimetras2 = " + P);
        double S1 = plotas(P,x,y,z);
        System.out.println("S2 = " + S1);



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



