package Algorithm;

import java.util.Arrays;

public class Binary_search {
    private int count = 0;

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        //System.out.println(Arrays.toString(arr));
        int number = 325;

        Binary_search obj = new Binary_search();
        System.out.println("Position of element : " + obj.bin_search(number, arr) + "  " + obj.count());
    }

    public String count() {
        count++;
        return "Count of operations: " + count;
    }

    public int bin_search(int num, int[] arr) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end + start) / 2;
            count();
            int guess = arr[mid];
            if (guess == num) return mid;
            if (num < guess) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}
