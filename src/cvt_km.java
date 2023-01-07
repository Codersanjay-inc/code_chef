import java.util.Scanner;
public class cvt_km {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kilometer");
        double kilo = sc.nextFloat();
        double factor = 0.621;
        double miles;
        System.out.println("kilometer in miles");
        miles = kilo/factor;
        System.out.println(miles);


    }
}
