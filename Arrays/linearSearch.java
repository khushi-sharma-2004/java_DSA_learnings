class linearSearch{
    public static void main(String[] args){
         int[] arr={3,2,1,18,9,3};
         int size = arr.length ;
         int target =0;
         boolean k = search(arr,size,0,target);
         if(k==true){
            System.out.println("ELEMENT FOUND");
         }
         else{
            System.out.println("Element not found");
         }
    }
    public static boolean search(int[] arr, int size,int n ,int target){
        if(n==size){
            return false;
        }
        if(arr[n]!= target){
            return search(arr,size,n+1,target);
        }
        else{
            return true;
        }
    }
}