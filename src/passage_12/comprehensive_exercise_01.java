package passage_12;

import java.util.ArrayList;

/*26个英文字母正反输出*/
public class comprehensive_exercise_01 {
    public static void main(String[] args) {
        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for (char c : letter) {
            list1.add(c);
            list2.add((char) (187 - c));
        }
        for (Object element : list1) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (Character character : list2) {
            System.out.print(character + " ");
        }
    }
}
