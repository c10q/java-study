package array;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr; // 배열 선언 (참조 변수 선언)
        arr = new int[3]; // 실제 배열 생성

        for (int i : arr) {
            System.out.println(i);
        }

        arr[0] = -1;
        arr[1] = 1;
        arr[2] = 3;

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
