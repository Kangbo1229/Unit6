public class TraverseArrays {
    public static int countEven(int[] nums){
        int blank = 0;
        for (int i =0; i < nums.length; i++){
            if (nums[i] % 2 == 0 ) {
                blank ++;
            }
        }
        return blank;
    }
    public static int [] buildArray(int desiredLength){
        int arr[]  = new int[desiredLength];
        for (int i = 0; i < desiredLength; i++) {
            arr[i] = i;
        }
        return arr;
    }
    public static boolean sum28(int[] numbers) {
        int sum =0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] ==2){
                sum += 2;
            }
        }
        if (sum != 8) {
            return false;
        }
        else{
            return true;
        }
    }
    public static int [] zeroMax(int[] original){
        int arr [] = new int[original.length];
        for (int i =0; i < original.length; i++){
            if (original[i] == 0){
                for (int a = i; a < original.length; a++){
                    if (original[a] > arr[i]) {
                        arr[i] = original[a];
                    }
                }
            }
            else{
                arr [i] = original [i];
            }
        }
        return arr;
    }


    public static void main(String[] args){

    }
}
