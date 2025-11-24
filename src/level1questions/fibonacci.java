
class fibonacci{
    public static void main(String[] args){
       System.out.println(f(8));
    }
    static int f(int n ){
        if(n<2){
            return n;
        }
        else{
            
            return f(n-1)+f(n-2);//this is not tail recurssion as f(n-1),f(n-2) are not returning  as the last function call instead  ,it is returning the addition of boththe functions
        
        }
    } 
} 