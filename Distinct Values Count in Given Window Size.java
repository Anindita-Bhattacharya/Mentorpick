import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int i;
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    int arr[]=new int[n];
		    for(i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    int q;
		    q=sc.nextInt();
		    int query[]=new int[q];
		    for( i=0;i<q;i++)
		    {
		        query[i]=sc.nextInt();
		    }
		    for(int j=0;j<q;j++)
		    {
		        int k=query[j];
		        int count=0;
		        HashMap<Integer,Integer>hp=new HashMap<>();
		        for( i=0;i<k;i++)
		        {
		            if(!hp.containsKey(arr[i]))
		            {
		                hp.put(arr[i],1);
		                count++;
		            }
		            else 
		            {
		                hp.put(arr[i],hp.get(arr[i])+1);
		            }
		            
		            
		        }
		        System.out.print(count+" ");
		        for(i=k;i<n;i++)
		        {
		           if(hp.get(arr[i-k])==1)
		           {
		               hp.remove(arr[i-k]);
		               count--;
		           }
		           else 
		           {
		               hp.put(arr[i-k],hp.get(arr[i-k])-1);
		           }
		           
		            if(!hp.containsKey(arr[i]))
		            {
		                hp.put(arr[i],1);
		                count++;
		            }
		            else 
		            {
		                hp.put(arr[i],hp.get(arr[i])+1);
		                
		            }
		            System.out.print(count+" ");
		        }
		        System.out.print("\n");
		    }
		}
	}
}
