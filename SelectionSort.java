package algorithm;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {1,4,14,2,6,3,3};
		for(int i=0;i<a.length;i++){
			int temp=0;
			int index = i;
			for(int j = i+1;j<a.length;j++){
				if(a[index]>a[j]){
					index = j;
				}
			}
			temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			System.out.println(a[i]);
		}
	}

}
