public class Main {
    public static void main(String[] args) {
        double x1= 1, x2 =0.3, x, sum = x1 + x2;

        for (int i = 3; i<= 20; i++){
            x = (i+1)* x1;
            sum = sum + x;
            x1 = x2;
            x2 = x;
        }
        System.out.println(sum);

    }
}