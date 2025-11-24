import java.util.*;

class countZero {
    int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        countZero obj = new countZero();
        int res = obj.count(n);
        System.out.println(res);
    }

    public int count(int n) {
        if(n == 0) {
            return c;
        }

        if(n % 10 == 0) {
            c++;
        }

        return count(n / 10);
    }
}
