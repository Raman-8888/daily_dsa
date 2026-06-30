
class Solution {
    public int largestRectangleArea(int[] arr) {

        Deque<Integer> st = new ArrayDeque<>();
        List<Integer> nse = new ArrayList<>();
        List<Integer> pse = new ArrayList<>();

        // 1. FOR NSE (Next Smaller Element Index)
        for(int i = arr.length - 1; i >= 0; i--)
        {
            // FIX 1: Access array values using the index stored in the stack (st.peek())
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }

            if(!st.isEmpty())
            {
                nse.add(st.peek()); // Stores the index
            }
            else
            {
                // FIX 2: If no smaller element exists on the right, it can extend to arr.length
                nse.add(arr.length);
            }

            st.push(i); // Pushing index 'i' is correct!
        }
        
        // FIX 3: Reverse the NSE list because we iterated backwards
        Collections.reverse(nse);

        // Clear stack for the next pass
        while(!st.isEmpty())
        {
            st.pop();
        }

        // 2. FOR PSE (Previous Smaller Element Index)
        for(int i = 0; i < arr.length; i++)
        {
            // FIX 4: Change '<=' to '>=' because we want the previous SMALLER element
            // FIX 1 (again): Access array values via stack indices
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }

            if(!st.isEmpty())
            {
                pse.add(st.peek()); // Stores the index
            }
            else
            {
                pse.add(-1); // Correct: expands past the left boundary
            }

            st.push(i);
        }

        // 3. CALCULATE MAX AREA
        int ans = 0;
        for(int i = 0; i < arr.length; i++)
        {
            int area = arr[i] * (nse.get(i) - pse.get(i) - 1);
            ans = Math.max(area, ans);
        }
        return ans;
    }
}
