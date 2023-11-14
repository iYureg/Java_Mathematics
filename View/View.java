package View;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public int getValue(String s) {
        System.out.printf("%s", s);
        return in.nextInt();
    }

    public void print(int data, String s) {
        System.out.printf("%s %d\n", s, data);
    }
}