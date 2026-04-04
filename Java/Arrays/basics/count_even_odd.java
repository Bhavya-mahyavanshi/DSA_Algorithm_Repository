package Java.Arrays.basics;

public class count_even_odd {
    public static int[] count(int[] arr) {
        int odd = 0;
        int even = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        return new int[] { odd, even };
    }
}
