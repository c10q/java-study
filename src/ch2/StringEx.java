package ch2;

public class StringEx {
    public static void main(String[] args) {
        /*
         * str 타입은 무조건 하나의 문자만 들어갈 수 있음
         * char ch = ''  이거 불가능
         * char ch = ' ' 공백은 가능
         * char ch = 'a' 문자 가능
         */
        char ch = 'A';

        String name = new String("String은 클래스라 이렇게 선언하는게 맞는데");
        String str = "특별히 이렇게 써도 돼";

        System.out.println(ch);
        System.out.println(name);
        System.out.println(str);
    }
}
