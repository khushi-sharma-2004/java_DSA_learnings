class recurssion{
    public static void main(String[] args){
      print(1);//function call
    }
    static void print(int n ){
        if(n>=6){ // base condition
            return ;
        }
        else{
            System.out.println(n);
            print(n+1);//fuction calling it  again and again
        }
    }
}