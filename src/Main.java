import exteption.DivisionByZeroExption;

public class Main {
    public static void main(String[] args) {
        try {
            division( 5,0);
        }catch (DivisionByZeroExption e){
            System.out.println("На ноль делить нельзя");
        }
    }
    public static void division( int a, int b){
        if (b==0)
            throw new DivisionByZeroExption();
        System.out.println(a/b);
    }
}