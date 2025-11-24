import java .util.*;
class steps{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = noOfSteps(n,0);
        System.out.println(result + " for value " + n);
    }
    public static int noOfSteps(int n ,int steps){
        if(n<=0){
            return steps;  
        }
        if(n%2==0){
            return noOfSteps(n/2,steps+1);
        }
        else{
            return noOfSteps(n-1,steps+1);
        }
    }
}