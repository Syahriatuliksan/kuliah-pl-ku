package arrays;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        String rev = "rafli";
        for (char i : arr)
            rev = i + rev;
        System.out.println(rev);
    }
}
