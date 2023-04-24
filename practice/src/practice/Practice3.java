package practice;

public class Practice3 {

	public static void main(String[] args) {
	int arr[]= {0,1,2,3,4,5,6,7,8,9};
	int median=0;
	int median1=0;
	float totmedian=0;
	
		if(arr.length%2==0)
		{
			median=arr[arr.length/2];
			median1=arr[(arr.length-1)/2];
			float sum=(median+median1);
			 totmedian=(sum)/2;
			System.out.println(totmedian);
			}
		else if(arr.length%2!=0){
			
			median=arr[arr.length/2];
			System.out.println(median);
			
		}
			
	
	
	

	}

}
	
