import java.util.*;

class reverse{
    static int sum = 0;   // make sum global so recursion can build it
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = rev(n);
        System.out.println(result);
    }
    
    public static int rev(int n){
        if(n == 0){
            return sum;
        }
        
        int r = n % 10;
        sum = sum * 10 + r;
        
        return rev(n / 10);
    }
}
