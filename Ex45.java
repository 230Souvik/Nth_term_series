
package ex45;
import java.util.*;

public class Ex45 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range of table  ");
        int r=sc.nextInt();
        double a[]=new double[r];
        double b[]=new double[r];
        for(int i=0;i<r;i++)
            a[i]=Math.pow(2,i);
        for(int i=0;i<r;i++)
            b[i]=Math.pow(3,i);
        int y=r*2;
        double res[]=new double[y];
        res[0]=a[0];
        res[1]=b[0];
        for(int k=2;k<y;){
            res[k]=a[k/2];
            res[k+1]=b[k/2];
            k+=2;
        }
         System.out.println("print");
         for(int k=0;k<y;k++)
             System.out.println(res[k]);
    }
    
}
