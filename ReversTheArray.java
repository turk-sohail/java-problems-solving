/**
 * ReversTheArray
 */
public class ReversTheArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int f = 0;

        for (int i : arr) {
            System.out.print(i + " ");
        }
        int l = arr.length - 1;

        while (f <= l) {
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;

        }
        System.out.println();

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}