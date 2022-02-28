package ss4_lop_va_doi_tuong_trong_java.bai_tap.Fan;

public class Fan {
    private String SLOW = "1"  ;
    private String MEDIUM = "2"  ;
    private String FAST = "3"  ;

    private String speed = SLOW ;
    private boolean on = false ;
    private double radius = 5 ;
    private String color = "blue";

    public Fan() {
    }

    public Fan(String speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String getSLOW() {
        return SLOW;
    }

    public void setSLOW(String SLOW) {
        this.SLOW = SLOW;
    }

    public String getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(String MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public String getFAST() {
        return FAST;
    }

    public void setFAST(String FAST) {
        this.FAST = FAST;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Fan{" +
                " speed='" + speed + '\'' +
                ", on =" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
