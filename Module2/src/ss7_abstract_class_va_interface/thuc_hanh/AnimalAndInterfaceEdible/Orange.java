package ss7_abstract_class_va_interface.thuc_hanh.AnimalAndInterfaceEdible;

public class Orange extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
