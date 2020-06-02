import java.io.*;
import java.util.*;

public class codevita1
 {

    public static void main(String[] args) {
        
        Scanner ip=new Scanner(System.in);
        int n=ip.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ip.nextInt();
        }
        int m=ip.nextInt();
        for(int i=0;i<m;i++)
        {
            int target=ip.nextInt();
            long sum=0;
            long ans=-1;
            for (int j=0;j<n;j++)
            {
                sum+=arr[j];
                if(sum>=target)
                {
                    ans=j+1;
                    break;
                }
            }
            System.out.println(ans);
        }
        
    }
}