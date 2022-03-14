package ss10_list.bai_tap.MyLinkedList;

import ss10_list.bai_tap.MyArrayList.MyList;

public class MyLinkedListTest {

    static class Student {
        private int id;
        private String name;


        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Student> studentMyLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Nghia");
        Student student2 = new Student(2, "Hoa");
        Student student3 = new Student(3, "Linh");
        Student student4 = new Student(4, "Nhung");
        Student student5 = new Student(5, "Dung");
        Student student6 = new Student(6, "Hau");


        studentMyLinkedList.addFirst(student1);
        studentMyLinkedList.addFirst(student2);
        studentMyLinkedList.addFirst(student3);


        studentMyLinkedList.add(1, student4);


        studentMyLinkedList.addLast(student5);


        System.out.println("Linked List ban đầu");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {

            Student studentElement = studentMyLinkedList.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(", id: " + studentElement.getId());
        }

//        studentMyLinkedList.remove(2);
//        studentMyLinkedList.remove(student4);

        System.out.println();
        System.out.println("Linked List lúc sau");
        for (int i = 0; i < studentMyLinkedList.size(); i++) {

            Student studentElement = studentMyLinkedList.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(", id: " + studentElement.getId());
        }

        MyLinkedList<Student> myLinkedListCopy = studentMyLinkedList.clone();
        System.out.println();
        System.out.println("Linked List lúc sau khi copy");
        for (int i = 0; i < myLinkedListCopy.size(); i++) {

            Student studentElement = myLinkedListCopy.get(i);
            System.out.print("name: " + studentElement.getName());
            System.out.println(", id: " + studentElement.getId());
        }


        System.out.println("student2 có trong liên kết hay không: " + studentMyLinkedList.contains(student2));


        System.out.println("student 2 ở vị trí thứ : " + studentMyLinkedList.indexOf(student2));
    }
}
