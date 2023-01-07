import java.util.Scanner;
public class cal_CGPA {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of student");
        System.out.println("enter the marks of sub1");
        float a = sc.nextFloat();
        System.out.println("enter the marks of sub2");
        float b = sc.nextFloat();
        System.out.println("enter the marks of sub3");
        float c = sc.nextFloat();
        System.out.println("avg of total sub");
        float cgpa = (a+b+c)/30;
        System.out.println("total CGPA of student");
        System.out.println(cgpa);
    }
}
