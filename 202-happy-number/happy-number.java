
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sum(slow);
            fast = sum(sum(fast));
        } while (slow != fast);

        return slow == 1;
    }

    public int sum(int n) {
        int total = 0;

        while (n > 0) {
            int digit = n % 10;
            total += digit * digit;
            n = n / 10;
        }

        return total;
    }
}
