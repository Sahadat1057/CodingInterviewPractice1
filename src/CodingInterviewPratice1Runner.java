public class CodingInterviewPratice1Runner {
    public static void main(String[] args) {
        System.out.println(seriesUp(3));
        System.out.println(seriesUp(4));
        System.out.println(seriesUp(2));

        System.out.println(createSequence(0, 2, 10));
        System.out.println(createSequence(5, 3, 5));
    }

    public static String seriesUp(int n) {
        String result = "";
        // write your method logic here
        int number = n;
        for(int i = 1; i<=number; i++) {
            result+= i;
        }
        return result;
    }

    public static String createSequence(int a, int b, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += a * (b + Math.pow(2, i));
    }
        return result;
    }

}
