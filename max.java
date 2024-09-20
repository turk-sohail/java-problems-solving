public class max {
    public static int findMax(int arr[]){
        int currMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>currMax){
                currMax = arr[i];
            }
        }

        return currMax;
    }
    public static void main(String[] args) {
        int[] x = {2,5,13,1,12,17,6,2};
        int m = findMax(x);
        System.out.println(m);
    }
}
