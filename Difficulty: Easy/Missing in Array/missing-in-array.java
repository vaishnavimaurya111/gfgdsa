class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length +1;
        long sum= n* (n+1)/2;
        long arraysum = 0;
        for(int ele: arr){
            arraysum +=ele;
        }
        return (int)(sum-arraysum);
    }
}