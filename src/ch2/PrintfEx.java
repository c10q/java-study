package ch2;

import java.io.PrintStream;

public class PrintfEx {
    // %d: decimal        10진수
    // %o: octal          8진수
    // %x: hex-decimal    16진수
    // %X: heX-decimal    16진수 (대문자)
    // %f: floating-point 부동 소수점
    // %e: exponent       지수
    // %E: Exponent       지수 (대문자)
    // %c: character      문자
    // %s: string         문자열
    public static void main(String[] args) {
        PrintStream so = System.out;

        int num1 = 15;
        so.printf("10진수: %d%n", num1);
        so.printf("8진수: %o%n", num1);
        so.printf("16진수: %x%n", num1);
        so.printf("16진수: %X%n", num1);

    }
}
