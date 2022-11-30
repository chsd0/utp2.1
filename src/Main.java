import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] ar = rectPS();
        for(int i=0;i<2;i++){
            System.out.println(ar[i]);
        }

        ar = cirPS();
        for(int i=0;i<2;i++){
            System.out.println(ar[i]);
        }

        ar = triPS();
        for (int i=0;i<2;i++){
            System.out.println(ar[i]);
        }
    }
    public static double[] rectPS(){
        System.out.println("Введите длины сторон прямоугольника");
        double[] a = new double[2];
        Scanner in = new Scanner(System.in);
        double c = in.nextDouble();
        double d = in.nextDouble();
        Figures.rectangle rectn = new Figures.rectangle(c,d);
        a[0]=2*(c+d);
        a[1]=c*d;
        System.out.println("Периметр и площадь прямоугольника:");
        return a;
    }
    public static double[] cirPS(){
        System.out.println("Введите длину радиуса окружности");
        double[] arr = new double[2];
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        Figures.circle cir = new Figures.circle(r);
        arr[0]=2*Math.PI*r;
        arr[1]=Math.PI*r*r;
        System.out.println("Длина и площадь окружности:");
        return arr;
    }
    public static double[] triPS(){
        System.out.println("Введите длины сторон треугольника");
        double[] array = new double[2];
        Scanner in = new Scanner(System.in);
        double a1 = in.nextDouble();
        double a2 = in.nextDouble();
        double a3 = in.nextDouble();
        double pp = (a1+a2+a3)/2;
        Figures.triangle tri = new Figures.triangle(a1,a2,a3);
        array[0]=a1+a2+a3;
        array[1]=Math.sqrt(pp*(pp-a1)*(pp-a2)*(pp-a3));
        System.out.println("Периметр и площадь треугольника:");
        return array;
    }
}