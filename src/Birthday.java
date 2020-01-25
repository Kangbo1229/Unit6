//Elly Kang
//01/24/20
public class Birthday {
    public static int[] dates(int num) {
        int b[] = new int[num];
        for (int i = 0; i < num; i++) {
             b[i] = (int) (Math.random() * 365);

        }
        return b;
    }

    public static boolean hasDupes(int[] birthdays){
        for (int i = 0; i < birthdays.length; i++){
            for (int a = i +1; a < birthdays.length; a++){
                if(birthdays[i] == birthdays[a]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int run = 0;
        for (int i = 0; i < 1000; i++){
            int a [] = dates(23);
            if (hasDupes(a)){
                run++;
            }
        }
        double total = (double) run /10;
        System.out.println("The percent of times there were duplicate birthdays is "+total+"%.");


    }
}
