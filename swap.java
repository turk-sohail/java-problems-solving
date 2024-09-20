public class swap {
    public static void swapNum(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,6,8,9,10};
        for (int i : arr) {
            System.out.print(" "+i);
        }
        System.out.println();
        swapNum(arr, 0, 5);
        for (int i : arr) {
            System.out.print(" "+i);
        }
        
    }
}
