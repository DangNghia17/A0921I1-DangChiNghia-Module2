package ss6_ke_thua.bai_tap.PointAndMoveablePoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = new float[2];
        return  array;

    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x = " + getX() +
                ", y = " + getY() +
                ",speed = " +
                " xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed +
                '}';
    }
    public void move() {
        setX(getX()+getxSpeed());
        setY(getY()+getySpeed());
    }
}
