class rotatedSearch {
    public static void main(String[] args){
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 9;

        boolean found = search(arr, 0, arr.length-1, target);

        if(found){
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    public static boolean search(int[] arr, int s, int e, int target){
        
        if(s > e){                  // ❗ BASE CONDITION
            return false;
        }

        int mid = s + (e - s) / 2;

        if(arr[mid] == target){     // target found
            return true;
        }

        // Check if left half is sorted
        if(arr[s] <= arr[mid]){
            // Check if target lies in left half
            if(target >= arr[s] && target < arr[mid]){
                return search(arr, s, mid - 1, target);
            } else {
                return search(arr, mid + 1, e, target);
            }
        }

        // Otherwise right half must be sorted
        else {
            // Check if target lies in right half
            if(target > arr[mid] && target <= arr[e]){
                return search(arr, mid + 1, e, target);  // ✔ fixed order
            } else {
                return search(arr, s, mid - 1, target);  // ✔ fixed order
            }
        }
    }
}
