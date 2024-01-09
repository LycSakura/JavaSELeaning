package study;

public class video_test_05 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 56};
        boolean flag = compare(arr1, arr2);
        System.out.println(flag);
    }
    private static boolean compare(int[] arr1, int[] arr2) {
        boolean flag = arr1.length == arr2.length;
        for (int i = 0; i < arr1.length; i++) {
            flag = arr1[i] == arr2[i];
        }
        return flag;
    }
}
