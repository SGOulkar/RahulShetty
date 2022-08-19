package Array;

import java.util.ArrayList;

public class CollectionDemo {
	public static void main(String[] args) {
		int a[] = {4,4,4,2,7,3,1,1,1,6,8,6,1,10,5,5,1};
		ArrayList<Integer> a1 =new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			int k=0;
			if(!a1.contains(a[i])) {
				
				a1.add(a[i]);
				k++;
				{
					for(int j=i+1;j<a.length;j++) {
						if(a[i]==a[j]) {
							k++;
						}
					}
					//System.out.print(a[i]+"- ");
					//System.out.println(k);
					if (k==1) {
						System.out.println(a[i]+" is unique");}
				}
			}
		}
	}
}
