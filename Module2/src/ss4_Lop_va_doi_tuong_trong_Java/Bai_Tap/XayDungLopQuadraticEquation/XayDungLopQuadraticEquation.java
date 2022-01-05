package ss4_Lop_va_doi_tuong_trong_Java.Bai_Tap.XayDungLopQuadraticEquation;

public class XayDungLopQuadraticEquation {
    double a;
    double b;
    double c;

    public XayDungLopQuadraticEquation(){
    }

    public XayDungLopQuadraticEquation(double a, double b, double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
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

    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot(){    //delta ==0
        return -b / (2*a);
    }
    public double getRoot1(){
        return (-b + Math.pow(getDiscriminant(),0.5)) / (2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(getDiscriminant(),0.5)) / (2*a);
    }

    public String display(){
        return "Pt bậc 2 là: " + a + "x2 + " + b + "x + " + c + " = 0";
    }

    public String getResult(){
        String result;
        if(getDiscriminant() < 0){
            result = "Pt vô nghiệm";
        }else if (getDiscriminant() == 0){
            result = "PT có 1 nghiệm kép x = " + getRoot();
        }else{
            result = "PT có 2 nghiệm phân biệt x1 = " + getRoot1() + ", x2 = " + getRoot2();
        }
        return result;
    }
}
