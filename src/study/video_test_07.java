package study;

/*反转数组元素*/

public class video_test_07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if(j+i == arr.length-1){
                    arr2[j] = arr[i];
                }
            }
        }
        arr = arr2;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
