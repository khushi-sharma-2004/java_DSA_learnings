class main{
    public static void main(String[] args){
      print(1);
    }
    static void print(int n ){
        if(n>=6){
            return ;
        }
        else{
            System.out.println(n);
            print(n+1);
        }
    }
}