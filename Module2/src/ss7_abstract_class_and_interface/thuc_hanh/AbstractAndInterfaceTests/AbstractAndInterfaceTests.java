package ss7_abstract_class_and_interface.thuc_hanh.AbstractAndInterfaceTests;

import ss7_abstract_class_and_interface.thuc_hanh.AbstractAndInterfaceTests.Animal;
import ss7_abstract_class_and_interface.thuc_hanh.AbstractAndInterfaceTests.Chicken;
import ss7_abstract_class_and_interface.thuc_hanh.AbstractAndInterfaceTests.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }

}
