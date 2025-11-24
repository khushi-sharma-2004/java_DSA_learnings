import java.util.Scanner;
class sum{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = f(n);
        System.out.println(sum);


    }
    public static int f(int n){
        if(n==0){
            return 0;
        }
        else{
            return n%10 + f(n/10);
        }
    }
}