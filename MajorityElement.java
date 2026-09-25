class Solution {
    int majorityElement(int arr[]) {
        // code here
        int  n = arr.length;
        int candidate = -1;
        int count = 0;
        
        for(int i = 0; i < n; i++){
            if(count == 0){
                candidate = arr[i];
                count = 1;
            }else if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        int actualCount = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == candidate){
                actualCount++;
            }
        }
        if(actualCount > n / 2){
            return candidate;
        }
        return -1;
    }
}