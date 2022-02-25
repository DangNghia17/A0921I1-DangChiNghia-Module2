package ss4_lop_va_doi_tuong_trong_java.bai_tap.QuadraticEquation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //method
    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot() {    //delta ==0
        return -b / (2 * a);
    }

    public double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }
    public String getResult(){
        String result;
        if(getDiscriminant() < 0){
            result = "No root";
        }else if (getDiscriminant() == 0){
            result = "Delta = 0 , x = " + getRoot();
        }else{
            result = "Delta >0 , x1 = " + getRoot1() + ", x2 = " + getRoot2();
        }
        return result;
    }

    public String display() {
        return "Your input is : " + a + "x^2 + " + b + "x" + " +" + c + " = 0 "  ;
    }
}
