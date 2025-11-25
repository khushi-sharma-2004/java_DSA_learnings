class rotatedSearch{
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,1,2,3};
        int s = 0;
        int e = arr.length-1;
       
        int target =9;
       boolean k = search(arr,s,e, target);
    }
    public static  boolean search(int[] arr , int s, int e, int target){
        int mid = s+(e-s)/2;
        if(target== arr[mid]){
            return true;
        }
        if(arr[s]<= arr[m]){
            if(target>=s && target<mid){
                return search(arr,s,mid-1,target);
            }
            else  {
                 return search(arr,mid+1,e,target);
            }
        } if(target >= arr[m] && target<=arr[e]){
            return search(arr,target,m+1, e);
        }

    }
}