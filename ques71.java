import java.util.*;
class q71
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,mid;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to be searched:");
        int x=sc.nextInt();
        int f=0;
        int l=n-1;
        while(f<=l)
        {
            mid=(f+l)/2;
            if(x==arr[mid])
            {
                System.out.println("NUMBER FOUND AT POSITION "+(mid+1));  
                System.exit(0);
            } 
            else if(x>arr[mid])
                f=mid+1;
            else
                l=mid-1;
        }
        System.out.println("NUMBER NOT FOUND");
    }
}