package ss16_io_textfile.bai_tap.CopyFile;

import demo_session.collection.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public void writeFile(String path, List<Student> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write("Dữ liệu trong file là: \n" + list);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(String path ,List<Student> list) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            displayDataCopied(list);
        } catch (IOException e) {
            e.printStackTrace();
        } }


    public int displayDataCopied(List<Student> list) {
        int count = list.size();
        System.out.println("Số ký tự có trong file là: " + count);
        return count;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("STU001", "Hoai An", 18));
        students.add(new Student("STU002", "Thang", 19));
        students.add(new Student("STU003", "Hieu", 20));
        students.add(new Student("STU004", "Hung", 18));
        students.add(new Student("STU005", "Nam", 20));
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.writeFile("data1.txt" , students);
        System.out.println("Write file success");
        copyFileText.readFile("data1.txt" , students);
    }
}
