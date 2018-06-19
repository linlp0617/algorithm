package algorithm;

public class BubbleSort {

	public static void main(String[] args) {
		//8 个数
		int[] a ={1,23,15,66,123,43,5,1};
		for(int i=0;i<a.length-1;i++){
			for(int j=1;j<a.length-i;j++){
				if(a[j]<a[j-1]){
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
