
public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {10, 11, 12, 13, 14, 15, 1};
        //find the common elements from two arrays
        for (int i = 0; i <= arr1.length - 1; i++) {
            int element = arr1[i];
            for (int j = 0; j <= arr2.length - 1; j++) {
                if (element == arr2[j]) {
                    System.out.println(element);
                }
            }
        }
        System.out.println("================");
        for (int a : arr1) {
            for (int b : arr2) {
                if (a == b) {
                    System.out.println(a);
                }
            }
        }

    }
}