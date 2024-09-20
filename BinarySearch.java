public class BinarySearch {
    public static int findEl(int n,int arr[]){
        int l = 0,h=arr.length-1;
        while (l<=h) {
            int mid = (l+h)/2;
            if(n == arr[mid]){
                return mid;
            }else if(n>arr[mid]){
                l = mid+1;
            }else if(n<arr[mid]){
                h = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,7,14,15,16,17,22,27,44};
        int el = findEl(17, arr);
        System.out.println(el);
    }
}
