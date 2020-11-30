import java.util.ArrayList;
import java.util.Arrays;
import java.util.ArrayList;
public class NonDupChar {
    public static char[]  removeDuplicates(char[] arr){
        ArrayList<Character> list = new ArrayList<>(); //[1, 2, 3,4 ]
        for(char each : arr) {
            if (!list.contains(each)) {
                list.add(each);
            }
        }

        char[] nonDup = new char[list.size()]; // [1,2,3,4]

        for(int i = 0; i <= nonDup.length-1; i++) {
            nonDup[i] = list.get(i);
        }

        return nonDup;
    }
    public static void main(String[] args) {
        char[] arr = {'A', 'A', 'C', 'B', 'B'};
        char[] nonDup = removeDuplicates(arr);

        System.out.println(Arrays.toString(nonDup));
    }
}
