public class ArrayCreation {
    public static double getAverage(double[] numbers) {
        if (numbers.length < 3){
            return 0.0;
        }
        else{
            double total = (numbers[0] + numbers[numbers.length/2])+ numbers[numbers.length-1];
            total = total/3;
            total = (total * 100 + 0.5)/100;
            return total;
        }

    }
    public static String stringArray(String[] friends) {
        String blank = "";
        if (friends.length != 5){
            return blank;
        }
        else {
            blank += friends[0].length() +" " + friends[1].length() +" " + friends[2].length() +" " + friends[3].length() +" "+ friends[4].length();
            return blank;

        }
    }
    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};
        int num = (int) (Math.random()*countries.length);
        return "The capital of " + countries[num] + " is " + capitals[num] + " and the primary language is "+languages[num];

    }




    public static void main(String[] args) {
        double[] numbers = {89, 75, 100};
        System.out.println(getAverage(numbers));
        String[] names = {"Athos", "Porthos", "Aramis"};
        System.out.println(stringArray(names));
        System.out.println(countryData());

    }
}

