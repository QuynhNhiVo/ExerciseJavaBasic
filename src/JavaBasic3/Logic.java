package JavaBasic3;

public class Logic {
    public static int number = 100;

    public void condition(int n){
        if(n == number){
            System.out.println(" == 100");
        }else if (n < number){
            System.out.println("< 100");
        }else {
            System.out.println("> 100");
        }
    }

    public void switchcase(int m){
        switch (m) {
            case 20:
                System.out.println("20");
            case 30:
                System.out.println("30");
            case 50:
                System.out.println("40");
            default:
                System.out.println(m);
        }

    }
    public static void main(String[] args) {

        Logic condition = new Logic();
        condition.condition(42);
        condition.switchcase(59);
    }
}
