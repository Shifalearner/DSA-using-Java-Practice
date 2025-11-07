package POD;

 class Day1_06_11_25 {

     public void check(int n){
            if(n % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("Odd");
            }
        }
    public static void main(String[] args) {
       Day1_06_11_25 d = new Day1_06_11_25();
       d.check(13);
    }
}
