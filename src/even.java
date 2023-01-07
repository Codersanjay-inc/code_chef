import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            float a=s.nextFloat();
            float b=s.nextFloat();
            if((a/b)%2==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

