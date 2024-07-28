import java.lang.Math;
public class Circle {
        private double radius;
        public Circle(double radius) {
            if (radius < 0) {
                this.radius = 0;
            } else {
                this.radius = radius;
            }
        }
        public double getRadius(){
            return radius;
        }

        public double getArea(){
            return radius*radius*Math.PI;
        }

    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getRadius());
    }
}
