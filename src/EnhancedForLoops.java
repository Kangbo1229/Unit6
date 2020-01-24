public class EnhancedForLoops {
    public static String printStandardFor (String[] arr) {
        String blank = "";
        for (int i =0; i < arr.length; i++) {
            blank += arr[i] + " ";

        }
        return blank;
    }
    public static String printStandardFor(int[] arr){
        String blank = "";
        for (int i = 0; i < arr.length; i++){
            blank += arr[i] + " ";

        }
        return blank;
    }
    public static String printStandardFor(double[] arr){
        String blank = "";
        for (int i = 0; i < arr.length; i++){
            blank += arr[i] + " ";

        }
        return blank;
    }
    public static String printEnhancedFor(String[] arr){
        String blank = "";
        for (String i:  arr){
            blank += i+" ";
        }
        return blank;
    }

    public static String printEnhancedFor(int[] arr){
        String blank = "";
        for (int i:  arr){
            blank += i+" ";
        }
        return blank;
    }

    public static String printEnhancedFor(double[] arr){
        String blank = "";
        for (double i:  arr){
            blank += i+" ";
        }
        return blank;
    }

    public static String printStandardWhile(String[] arr) {
        String blank = "";
        int i = 0;
        while(i<arr.length){
            blank += arr[i] + " ";
            i++;
        }
        return blank;
    }

    public static String printStandardWhile(int[] arr) {
        String blank = "";
        int i = 0;
        while(i<arr.length){
            blank += arr[i] + " ";
            i++;
        }
        return blank;
    }

    public static String printStandardWhile(double[] arr) {
        String blank = "";
        int i = 0;
        while(i<arr.length){
            blank += arr[i] + " ";
            i++;
        }
        return blank;
    }

    public static void main(String [] args){


    }
}
