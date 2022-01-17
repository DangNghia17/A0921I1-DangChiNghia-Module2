package ss7_abstract_class_and_interface.bai_tap.Colorable;

public class Square implements Colorable {
    @Override
    public void howToColor() {
        String color = "Red " ;
        System.out.println("The color of Square is " + color);
    }
}

