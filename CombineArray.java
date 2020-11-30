
import java.util.ArrayList;
public class CombineArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr3 = {90, 80, 70, 60};
        int[] arr4 = {40, 35, 45, 65, 7, 5};
        int[] arr5 = {35, 54, 67, 89, 98, 89, 76};

        int[][] arr2D = { arr1, arr2, arr3 , arr4, arr5};

        ArrayList<Integer> list1 = new ArrayList<>();

        for(int[] each1D : arr2D ){
            for(int eachElement : each1D ){
                list1.add(eachElement);
            }
        }
        System.out.println(list1);
    }
}
