public class LinearSearch {
    public static int findEl(int n,int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
