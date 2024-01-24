package JavaBasic2;

public class Calculator {

    public int sum(){
        int a = 10;
        int b = 50;
        return a + b;
    }

    public double multiple(){
        double a = 2.5;
        int b = 5;
        return a * b;
    }


    public static void main(String[] args) {

        Calculator Obj = new Calculator();
        System.out.println(Obj.sum());
        System.out.println(Obj.multiple());;

    }
}
