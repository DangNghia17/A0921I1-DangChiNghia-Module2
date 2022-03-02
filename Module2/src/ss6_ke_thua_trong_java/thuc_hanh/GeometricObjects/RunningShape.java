package ss6_ke_thua_trong_java.thuc_hanh.GeometricObjects;

public class RunningShape {
        public static void main(String[] args) {
            Shape shape = new Shape();
            System.out.println(shape);

            shape = new Shape("red", false);
            System.out.println(shape);
        }
}
