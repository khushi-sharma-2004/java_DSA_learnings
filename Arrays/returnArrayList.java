import java.util.ArrayList;

class returnArrayList {
    public static void main(String[] args){
        int[] arr = {1, 2, 4, 4, 3, 6};
        int size = arr.length;
        int target = 4;

        ArrayList<Integer> list = search(arr, size, target, 0);
        System.out.println(list);
    }

    public static ArrayList<Integer> search(int[] arr, int size, int target, int n){
        
        // Base case
        if(n == size){
            return new ArrayList<>();
        }

        // Recursive call
        ArrayList<Integer> ans = search(arr, size, target, n + 1);

        // If found, add index at the FRONT
        if(arr[n] == target){
            ans.add(0, n); 
        }

        return ans;
    }
}
