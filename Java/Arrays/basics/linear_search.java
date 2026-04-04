package Java.Arrays.basics;

/*
In this file, I will show the liner search on an array. If the target value is 
found it will return the index of the value else it will return -1
It has the time complexity - O(n)


*/

public class linear_search {
    public static int linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return num;
            }
        }

        return -1;
    }
}