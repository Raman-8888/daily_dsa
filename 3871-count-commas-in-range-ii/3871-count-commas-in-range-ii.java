class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        
        // Commas at the thousands place (1,000+)
        if (n >= 1000) {
            totalCommas += (n - 1000 + 1);
        }
        
        // Commas at the millions place (1,000,000+)
        if (n >= 1000000) {
            totalCommas += (n - 1000000 + 1);
        }
        
        // Commas at the billions place (1,000,000,000+)
        if (n >= 1000000000) {
            totalCommas += (n - 1000000000 + 1);
        }
        
        // Commas at the trillions place (1,000,000,000,000+)
        if (n >= 1000000000000L) {
            totalCommas += (n - 1000000000000L + 1);
        }
        
        // Commas at the quadrillions place (1,000,000,000,000,000+)
        if (n >= 1000000000000000L) {
            totalCommas += (n - 1000000000000000L + 1);
        }

        // Commas at the quintillions place (1,000,000,000,000,000,000+)
        if (n >= 1000000000000000000L) {
            totalCommas += (n - 1000000000000000000L + 1);
        }
        
        return totalCommas;
    }
}
