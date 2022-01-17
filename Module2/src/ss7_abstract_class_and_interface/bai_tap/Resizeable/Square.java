package ss7_abstract_class_and_interface.bai_tap.Resizeable;

public class Square implements Resizeable {
    @Override
    public void resize(double size) {
        String text = "resized to Square" ;
        System.out.println(text);
    }
}
