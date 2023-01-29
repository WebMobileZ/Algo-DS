package MonotonicArray;

public class MonotonicArray {


    public boolean isMonotonicArray(int[] inputArray) {

        boolean isIncreasingArray = false;
        boolean isDecreasingArray = false;

       for (int index= 1; index < inputArray.length ; index++)

           if( inputArray[index-1] < inputArray[index]){
               if(isDecreasingArray){
                   return false;
               }
               isIncreasingArray = true;
           } else {
               if(isIncreasingArray){
                   return false;
               }
               isDecreasingArray = true;
           }

        return isDecreasingArray || isIncreasingArray;
    }
}
