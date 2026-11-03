class Solution {
    public int countLargestGroup(int n) {

        int[] arr = new int[37];

        for (int i = 1; i <= n; i++) {

            int num = i;
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            arr[sum]++;
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
                count = 1;
            }
            else if (arr[i] == max) {
                count++;
            }
        }

        return count;
    }
}