package ss11_stack_queue.bai_tap.CountTheWord;

import java.util.*;

public class CountTheWord {
    public static void main(String[] args) {
        TreeMap<String, Integer> countTheWordMap = new TreeMap<>();
        String[] arr = {"NGHIA", "XYZ", "ABCD", "NGHIA"};

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhập vào một chuỗi để đếm số lần xuất hiện : ");
//        String numInput = sc.nextLine().toUpperCase();
//        String[] numInputSplit = numInput.split("\\s");
//        for (String w : numInputSplit) {
//            System.out.println(" " + w);
//        }



        /** Duyệt treeMap **/
        for (String item :
                arr) {
            if (countTheWordMap.isEmpty()) {
                countTheWordMap.put(item, 1);
            } else if (countTheWordMap.containsKey(item)) {
                countTheWordMap.put(item, countTheWordMap.get(item) + 1);
            } else {
                countTheWordMap.put(item, 1);
            }
        }
        System.out.println(countTheWordMap.toString());
    }
}
