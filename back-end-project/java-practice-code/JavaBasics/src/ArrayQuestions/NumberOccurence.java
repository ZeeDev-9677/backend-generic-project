package ArrayQuestions;

public class NumberOccurence {

	public static void main(String[] args) {
		int[] arr=new int[] {3,1,6,8,2,8,8,3};
		for(int i=0;i<arr.length;i++) {
			int c=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]) {
					c++;
					arr[j]=-1;
				}
			}
			if(c>1 && arr[i]!=-1) {
				System.out.println(arr[i]+": is " +c+ " times");
			}
		}
		
		
	}

}
