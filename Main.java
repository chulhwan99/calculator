/********************
 * v1.0
 * 2023-08-28
 *********************/



import java.util.Scanner;

public class Main {

    public static double add(double x, double y){
        return x + y;
    }
    public static double sub(double x, double y){
        return x - y;
    }
    public static double multi(double x, double y){
        return x * y;
    }
    public static double div(double x, double y){
        return x/y;
    }
    public static void main(String[] args) {
        System.out.println("수식을 입력해주세요(얘>1 + 2) : ");

        Scanner scan = new Scanner(System.in);
        double num1,num2,ans=0;
        char operator;
        num1 = scan.nextDouble();
        operator = scan.next().charAt(0);
        num2 = scan.nextDouble();

        switch(operator){
            case '+':
                ans = add(num1,num2);
                break;
            case '-':
                ans = sub(num1,num2);
                break;
            case '*':
                ans = multi(num1,num2);
                break;
            case '/':
                ans = div(num1,num2);
                break;    
        }
//1
        System.out.println("정답은 : " + ans);
        //2
    }
}