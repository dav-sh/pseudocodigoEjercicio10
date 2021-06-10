import java.util.*;
public class Exercise10{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum=0;
        int sum2=0;
        int count = 0;
        do{
            System.out.println("Enter the number: ");
            int n= s.nextInt();
            sum += n;
            if(n%6==0){
                count++;
            }
            if(1<=n && n<=10){
                sum2+=n;
            }
        }while(sum<=1000);
        System.out.println("Multiple numbers of 6: "+count);
        System.out.println("Result sum numbers between 1 - 10: "+sum2);
    }
}