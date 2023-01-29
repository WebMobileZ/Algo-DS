package MonotonicArray;

public class MonotonicArray1 {


    public boolean isMonotonicArray(int[] inputArray) {

        if( inputArray.length <= 1){
            return false;
        }

        boolean isIncreasingArray = true;
        boolean isDecreasingArray = true;

       for (int index= 1; index < inputArray.length ; index++)

           if( inputArray[index-1] < inputArray[index]){
               isDecreasingArray = false;
           } else {
               isIncreasingArray = false;
           }

        return isDecreasingArray || isIncreasingArray;
    }
}
