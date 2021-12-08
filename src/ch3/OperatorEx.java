package ch3;

import java.io.PrintStream;

public class OperatorEx {
    public static void main(String[] args) {
        PrintStream so = System.out;
        int i = 5;
        i++;
        so.println("i++, i는 " + i);

        i = 5;
        ++i;
        so.println("++i, i는 " + i);

        i = 5;
        int j;
        j = i++;
        so.println("i++, j는 " + j + " i는 " + i); // j에 i를 먼저 넣고 i에 1을 더했음

        i = 5;
        j = ++i;
        so.println("++i, j는 " + j + " i는 " + i); // i에 1을 더하고 j에 넣었음
    }
}
