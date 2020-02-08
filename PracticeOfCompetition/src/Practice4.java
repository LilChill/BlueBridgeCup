import java.util.Scanner;

public class Practice4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNextInt()) {
			int n=scanner.nextInt();
		
		int a=0,b=0,c=0;
		boolean flag=false;
		
		if(n>=1&&n<=10000) {
			for(a=1;a*a<=n;a++) {
				for(b=a;a*a+b*b<=n;b++){
					for(c=b;a*a+b*b+c*c<=n;c++) {
						if(a*a+b*b+c*c==n) {
							flag=true;
							System.out.println(a+" "+b+" "+c);
						}
					}
				}
				}
			if(flag==false) {
				System.out.println("No Solution");
			}
			}
	
		}
	}
}
