package passage_9;

/*数组引发异常*/
public class comprehensive_exercise_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.print("i = " + i + "下标:" + i + " < 5 ，arr[" + i + "] = " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {// catch��
                System.out.println("" + i + "" + i + " < 5 arr[" + i + "]"
                        + e.toString().substring(10, e.toString().indexOf(':'))
                        + "\n");
            }
            if (i != 4) {
                System.out.println("ִ第" + "i个数 = " + (i + 1));
            }
        }
    }
}
