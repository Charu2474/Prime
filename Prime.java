import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int num=r.nextInt();
        int sum=0;
        for(int i=2;i<=num;i++)
            {
                if(num%i==0)
                {
                    sum+=1;
                }
            }
            if(sum==1)
            {
                System.out.println("It is Prime");
            }
            else
            {
                System.out.println("It is Not Prime");
            }
    }
}
