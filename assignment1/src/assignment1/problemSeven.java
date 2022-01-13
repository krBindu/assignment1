package assignment1;
import java.util.Arrays;

public class problemSeven {

		public static void main(String[] args) {
			int[] intarr= {9,3,7,5};
			reverse(intarr);
			
			sort(intarr);
			System.out.print("sorted array is: ");
			for(int x:intarr) {
				System.out.print(x);
			}
		}

		
		public static void reverse(int[] intarr) {
			
			int n=intarr.length;
			
			System.out.print("initial array: ");
			for(int array:intarr) {
				System.out.print(" "+array);
			}
			
			System.out.println();
			
			String str=Arrays.toString(intarr);
			char ch[]=str.toCharArray();
			
			for(int i=0;i<ch.length/2;i++) {
				char next=ch[i];
				ch[i]=ch[ch.length-1-i];
				ch[ch.length-1-i]=next;
			}
			
			str=new String(ch);
			System.out.println("Reversed array is: "+str);
		
		}
		
		public static void sort(int[] intarr) {
			
			int n=intarr.length;
	     for(int j=0;j<n-1;j++) {
				
				for(int k=j+1;j<n;j++) {
					
					if(intarr[j]>intarr[k]) {}
					int temp=intarr[j];
					intarr[j]=intarr[k];
					intarr[k]=temp;
				}
			}
		}
	}






