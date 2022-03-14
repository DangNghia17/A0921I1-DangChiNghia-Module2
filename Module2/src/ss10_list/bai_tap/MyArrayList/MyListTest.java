package ss10_list.bai_tap.MyArrayList;

public class MyListTest {
    public static class Student{
        private int id ;
        private String name ;

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
        Student s1 = new Student(1 ,"Nghia");
        Student s2 = new Student(2 ,"Linh");
        Student s3 = new Student(3 ,"Hoa");
        Student s4 = new Student(4 ,"Nhung");
        Student s5 = new Student(4 ,"Nhung");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(s1);
        studentMyList.add(s2);
        studentMyList.add(s3);
        studentMyList.add(s4);
//        studentMyList.add(s5, 2);
        studentMyList.size();


    }
}
