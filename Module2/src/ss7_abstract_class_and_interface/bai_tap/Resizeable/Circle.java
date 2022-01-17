package ss7_abstract_class_and_interface.bai_tap.Resizeable;

public class Circle implements Resizeable {
    @Override
    public void resize(double size) {
        String text = "resized to Circle" ;
        System.out.println(text);
    }
}
