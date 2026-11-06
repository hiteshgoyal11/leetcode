class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        int nsl[] = new int[heights.length];
        int nsr[] = new int[heights.length];
        

        // Next smaller right
        Stack<Integer> s = new Stack<>();

        for(int i=heights.length-1; i>=0; i--) {
            // while
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            
            // if-else
            if(s.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = s.peek();
            }

            // push element
            s.push(i);

        }

        // Next smaller left
        s = new Stack<>();

        for(int i=0; i<heights.length; i++) {
            // while
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }

            // if-else
            if(s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }

            // push element
            s.push(i);

        }

        // current area
        for(int i=0; i<heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = width * height;
            maxArea = Math.max(currArea, maxArea);
        }

        return maxArea;
    }
}