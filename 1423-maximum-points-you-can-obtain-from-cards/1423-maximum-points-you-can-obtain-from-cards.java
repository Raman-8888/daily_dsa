class Solution {
    public int maxScore(int[] arr, int k) {
        int n = arr.length;
        int total = 0;
        for (int i : arr) total += i;

        // The window we LEAVE BEHIND has size n - k
        int winSize = n - k;
        
        int win = 0;
        for (int i = 0; i < winSize; i++) {
            win += arr[i];
        }
        
        // We want the MINIMUM middle sum
        int minWin = win;

        for (int i = winSize; i < n; i++) {
            win += arr[i];
            win -= arr[i - winSize]; // Corrected subtraction index

            minWin = Math.min(win, minWin); // Use Math.min
        }
        
        // Total - Smallest Middle = Largest Ends
        return total - minWin;
    }
}
