
class fibonacci{
    public static void main(String[] args){
       System.out.println(f(8));
    }
    static int f(int n ){
        if(n<2){
            return n;
        }
        else{
            
            return f(n-1)+f(n-2);
        
        }
    } 
}