package practice;

public class Practice {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,4,6};
		int j=0;
		int k=0;
		int count=0;
		int count1=0;
		
		for(int i=0;i<10;i++)
		{
		    if(a[i]%2==0)
		    {
		       
		       count++;
		    }
		    else
		    count1++;
		}
		


	int even[]=new int[count];
	int odd[]=new int[count1];

		for(int i=0;i<10;i++)
		{
		    if(a[i]%2==0)
		    {
		        even[j]=a[i];
		        j++;
		    }
		    else{
		    odd[k]=a[i];
		    k++;
		}
		}
		for(int i=0;i<count;i++)
		{
		   
		    System.out.print(even[i]);
		    
		}
		System.out.println();
		for(int i=0;i<count1;i++)
		{
		   
		    System.out.print(odd[i]);
		    
		}
		System.out.println();
		int count3=count+count1;
		int newarr[]=new int[count3];
		for(int i=0;i<count;i++)
		{
			newarr[i]=even[i];
			System.out.print( newarr[i]);
		}
	/*System.out.println(count);
	System.out.println(count1);
	System.out.println(count3);
		}*/
		int m=0;
	 for(int i=count;i<count3;i++) {
		 newarr[count]=odd[m];
		 m++;
		 System.out.print(newarr[count]);
		 }
		 
	}


	}



