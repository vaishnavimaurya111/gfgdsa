class Solution {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Find largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                first = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}