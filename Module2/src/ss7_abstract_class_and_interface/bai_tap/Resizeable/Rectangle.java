package ss7_abstract_class_and_interface.bai_tap.Resizeable;

public class Rectangle implements Resizeable {
    @Override
    public void resize(double size) {
            size = 9;
        System.out.println("Resized to Rectangle = " + size);
    }
}
