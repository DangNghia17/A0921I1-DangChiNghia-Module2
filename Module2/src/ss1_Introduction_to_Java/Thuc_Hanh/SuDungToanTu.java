package ss1_Introduction_to_Java.Thuc_Hanh;

import java.util.Scanner;

class SuDungToanTu {
    public static void main(String[] args) {
            float width;
            float height;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number of width : ");
        width = scanner1.nextFloat();

        System.out.println("Enter the number of height : ");
        height = scanner1.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}