class RecBubbleSort{
    
    public static void main(String[] args){
       int[] arr = {9, 4, 6, 3, 2};
       bubbleSort(arr,0,1);

       for(int num : arr){
           System.out.print(num + " ");
       }
    }

    public static void bubbleSort(int[] arr ,int i , int j ){
        boolean swapped;
        swapped = false;
        if(j<arr.length-i){
            if(arr[j] < arr[j - 1]){     
                swap(arr,j,j-1);
                    
            }
            bubbleSort(arr,i,j+1);
        }
        
        if(!swapped){
            return ;
        }
        bubbleSort(arr,i+1,j);
        
    }
    public static void swap(int[] arr, int j, j-1){
        int temp = arr[j];
        arr[j] = arr[j - 1];
        arr[j - 1] = temp;
        swapped = true;

    }
}

