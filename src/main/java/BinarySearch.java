public class BinarySearch {

    public static Boolean binarySearch(int[] arr, int n ){

        int start = 0;
        int end = arr.length-1;
        boolean result = false;

        while( start <= end){
            int midle = (start + end)/2;
            if ( n == arr[midle]){
                result = true;
                break;
            }
            if ( arr[midle] < n ) {
                start = midle+1;
            }
            else{
                end = midle-1;
            }
        }
        return result;
    }


}







