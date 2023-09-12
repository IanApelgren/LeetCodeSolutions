class Solution {
    public void duplicateZeros(int[] arr) {
        int counter = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(arr[counter] == 0){
                stack.push(arr[counter]);
                if(i + 1 != arr.length){
                    stack.push(arr[counter]);
                    i++;
                }
            }
            else{
                stack.push(arr[counter]);
            }
            counter++;
        }
        for (int j = arr.length - 1; j >= 0; j--) {
            arr[j] = stack.pop();
        }
    }
}