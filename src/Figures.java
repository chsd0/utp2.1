public class Figures {
    public static class rectangle{
        private double lenght;
        private double width;


        public rectangle(double lenght, double width) {
            if (lenght > 0 && width > 0) {
                this.lenght = lenght;
                this.width = width;
            } else {
                throw new RuntimeException("Числа должны быть натуральными");
                }
            }
        }

    public static class circle{
        private double radius;
        public circle(double radius){
            if (radius>0){
                this.radius=radius;
            }else{
                throw new RuntimeException("Число должно быть натуральным");
            }
            }
        }

    public static class triangle{
        private double a;
        private double b;
        private double c;
        public triangle(double a, double b, double c){
            if ((a>0 && b>0 && c>0) && (a+b>c) && (a+c>b) && (b+c>a)){
                this.a=a;
                this.b=b;
                this.c=c;
            }else{
                throw new RuntimeException("Такие числа не могут быть сторонами треугольника");
            }
        }
    }

}
