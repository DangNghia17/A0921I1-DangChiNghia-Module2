package ss6_ke_thua_trong_java.bai_tap.PointAndMoveablePoint;

public class Running {
    public static void main(String[] args) {
        Point p1 = new Point(3,6);
        System.out.println("Tọa độ Point là : " + p1);
        MoveablePoint m1 = new MoveablePoint(3,6,1,2);
        System.out.println("Tọa độ sau khi di chuyển là : " + m1);
    }
}
