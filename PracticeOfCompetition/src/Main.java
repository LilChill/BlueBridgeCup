
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scanner=new Scanner(System.in);
		Set<Integer> set;
		int n=0,p=0,l=0,count=0;
		while(count!=10) {			
			n++;
			set=new HashSet<Integer>();
			p=n*n;
			l=n*n*n;
			while(p>0) {
				set.add(p%10);
				p/=10;
				//System.out.println("----");
			}
			while(l>0) {
				//System.out.println("****");
				set.add(l%10);
				l/=10;
				
			}
			count=set.size();
		}

		System.out.println("这个数字是: "+n);
	}
}
			
					
			
				

		
	
