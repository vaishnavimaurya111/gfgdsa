class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        HashSet<Integer> st = new HashSet<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int zeroCnt = 0;
        for (int ele : arr) {
            if (ele != 0)
                st.add(ele);
            else zeroCnt += 1;
        }
        if (zeroCnt > 1) {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(0); lst.add(0);
            ans.add(lst);
        }
        if (st.isEmpty()) { // only zero elements in array
            return ans;
        }
        // -1 0 1 2 -1 -4
        HashMap<Integer, Boolean> used = new HashMap<>();
        for (int ele : arr) {
            used.put(ele , false);
        }
        for (int i = 0 ; i < arr.length ; ++i) {
            int ele = arr[i];
            if (ele != 0 && !used.get(ele) && st.contains(-ele) && !used.get(-ele)) {
                used.put(ele , true);
                used.put(-ele , true);
                if (-ele < ele)
                    ans.add(new ArrayList<>(List.of(-ele, ele)));
                else 
                    ans.add(new ArrayList<>(List.of(ele, -ele)));
            }
        }
        
        ans.sort((row1 , row2) -> Integer.compare(row1.get(0) , row2.get(0)));
        return ans;
    }
}