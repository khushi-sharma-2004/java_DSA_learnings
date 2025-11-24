class sortedArray {
    public static void main (String[] args){
        int[] arr = {1, 2, 7, 4, 5};
        int size = arr.length;
        boolean result = check(arr, 0, size);
        System.out.println(result);
    }

    public static boolean check(int[] arr, int i, int size){
        
        if(i == size - 1){
            return true;        
        }
        
        if(arr[i] <= arr[i+1]){
            return check(arr, i+1, size);   
        } 
              
        else{
            return false;
        }
    }
}
