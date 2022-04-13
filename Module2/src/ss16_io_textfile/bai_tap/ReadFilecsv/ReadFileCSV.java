package ss16_io_textfile.bai_tap.ReadFilecsv;

import demo_session.collection.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {


    public void readFileCSV(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line = null;
            line = reader.readLine(); // skip header file CSV
            while ((line = reader.readLine()) != null) {
                printCountry(parseCsvLine(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> parseCsvLine(String csvline) {
        List<String> list = new ArrayList<>();
        if (csvline != null) {
            String[] splitData = csvline.split(";");
            for (int i = 0; i < splitData.length; i++) {
                list.add(splitData[i]);
            }
        }
        return list;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }

    public static void main(String[] args) {
        ReadFileCSV FileCSV = new ReadFileCSV();
        FileCSV.readFileCSV("E:\\Git_Codegym\\Module2\\src\\ss16_io_textfile\\bai_tap\\ReadFilecsv\\excel.csv");
    }
}
