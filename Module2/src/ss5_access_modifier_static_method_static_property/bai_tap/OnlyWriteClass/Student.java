package ss5_access_modifier_static_method_static_property.bai_tap.OnlyWriteClass;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    protected void setName(String name) {       //public thành protected hoặc để default
        this.name = name;
    }

    protected void setClasses(String classes) { //public thành protected hoặc để default
        this.classes = classes;
    }

}
