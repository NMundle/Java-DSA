public class sum {

    public static int sumN(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = sumN(n-1 );
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumN(n));
    }
}