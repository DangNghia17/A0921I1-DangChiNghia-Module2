package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getRadius() {
        return "Radius your input is : " + radius;
    }

    public String getArea() {
        return "Area is : " + (radius * radius * 3.14);
    }
//    private double getRadius() {
//        return radius;
//    }
//
//    private double getArea() {
//        return radius * radius * 3.14;
//    }
    //*Sau khi thay đổi access modifier*//


}
