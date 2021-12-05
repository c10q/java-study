package ch2;

import java.io.PrintStream;

public class StringEx {
    public static void main(String[] args) {
        PrintStream so = System.out;

        /*
         * str 타입은 무조건 하나의 문자만 들어갈 수 있음
         * char ch = ''  이거 불가능
         * char ch = ' ' 공백은 가능
         * char ch = 'a' 문자 가능
         */
        char ch = 'A';

        String name = new String("String은 클래스라 이렇게 선언하는게 맞는데");
        String str = "특별히 이렇게 써도 돼";

        so.println(ch);
        so.println(name);
        so.println(str);

        int num1 = 1;
        int num2 = 2;
        // String이랑 합쳐지면 타입이 뭐든간에 무적권 String이 됨
        String str1 = num1 + ""; // "1"
        so.println(str1);
        String str2 = "" + num2; // "2"
        so.println(str2);

        // boolean 타입도 예외는 아님 ㄷㄷ
        boolean bool1 = true;
        String strBool = bool1 + ""; // "true"
        so.println(strBool);

        // num1 + num2 연산이 먼저 되고 String이랑 더하기 때문에 str12는 "3"이 됨
        String str12 = num1 + num2 + "";
        so.println(str12);

        // 이 경우는 ""로 먼저 초기화가 되고 num1이 더해진 다음 ("1") "1" + num2 가 되기 때문에 "12"가 된다
        str12 = "" + num1 + num2;
        so.println(str12);
    }
}
