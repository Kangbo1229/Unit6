public class ArrayAlgorithms {
    public static String printArray(int[] nums) {
        String blank = "";
        for (int a : nums) {
            blank += a + " ";
        }
        return blank;
    }

    public static boolean checkForAllNegatives(int[] list) {
        int blank = 0;
        for (int a : list) {
            if (a < 0) {
                blank++;
            }
        }
        if (blank != list.length) {
                return false;

        }
            return true;

    }
    public static boolean hasDupes(int[] list){
        for (int i =0; i < list.length;i++){
            for (int a = i+1; a < list.length; a++ ){
                if (list[i] == list [a]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countEvens(int [] arr){
        int blank = 0;
        for (int a : arr) {
            if (a % 2 == 0){
                blank ++;
            }
        }
        return blank;
    }
    public static int[] leftShift(int[] nums, int shift){
        int [] blank  = new int[shift+nums.length];
        for (int i = 0; i <nums.length; i++){
            blank [i] = nums [i];
        }
        return blank;
    }
    public static String reverseArray(int[] list) {
        int temp = 0;
        String blank = "";
        for (int i = 0; i < list.length/2; i++) {
            temp = list[i];
            list[i] = list[list.length-1-i];
            temp = list[list.length-1-i];
        }
        for (int a = 0; a < list.length; a++){
            blank += list[a] + " ";
        }
        return blank;

    }
    public static void main(String[] args){
        //int[] list = {-2, -9, -6, -8, -9, -3, -1};
        //System.out.println(printArray(list));
        //int[] list1 = {-2, -9, -6, -8, -9, -3, 0};
        //System.out.println(checkForAllNegatives(list1));
        //int[] list2 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        //System.out.println(hasDupes(list2));
        //int[] list3 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        //System.out.println(countEvens(list3));
        //int[] list4 = {1, 0, 1, 1, 0, 1, 0, 1};
        //System.out.println(leftShift(list4,6));
        int[] list5 = {5, 7, 4, 9, 8, 1, 4, 3, 0, 5, 2};
        System.out.println(reverseArray(list5));




    }
}
