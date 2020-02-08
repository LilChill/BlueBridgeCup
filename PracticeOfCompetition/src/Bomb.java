import java.util.*;
public class Bomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a,b,c,n;
		int year,month,day;
		int i=0;
		String Str[]=new String[100];
		while(scanner.hasNextInt()) {
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		n=scanner.nextInt();
		Bomb obj=new Bomb();
		obj.date(a,b,c,n);
		}
	}
	private void date(int y,int m,int d,int n) {
		boolean Isleapyear=false;
		String str="";
		int count=0;
				while(count<n) {
					if(y%4==0||(y % 4 == 0 && y % 100 != 0)) {
						Isleapyear=true;
					}
					else {
						Isleapyear=false;
						}

					if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
						if(d>31) {					
						if(m==12) {
							y++;
							m=1;
							d=1;
							}
						else {
						m++;
						d=1;
						}	
						}
					}
					else if(m==4||m==6||m==9||m==11) {
						if(d>30) {
							m++;
							d=1;
							}
						}
					else if(m==2) {
						if(Isleapyear==true) {							
						if(d>29) {
							m++;
							d=1;
							}
						}
						else {
							if(d>28) {
								m++;
								d=1;
							}
						}
					}
					d++;
					count++;
				}
				if(count==n) {
					if(m<10||d<10) {
						if(m<10&&d>=10){
							str=str.concat(String.valueOf(y)).concat("-").concat("0").concat(String.valueOf(m))
							.concat("-").concat(String.valueOf(d));	
						
						}
						else if(d<10&&m>=10) {
							str=str.concat(String.valueOf(y)).concat("-").concat(String.valueOf(m))
							.concat("-").concat("0").concat(String.valueOf(d));			
						}
						else if(d<10&&m<10) {
							str=str.concat(String.valueOf(y)).concat("-").concat("0").concat(String.valueOf(m))
							.concat("-").concat("0").concat(String.valueOf(d));			
							
							}					
					}
						
					else {
						str=str.concat(String.valueOf(y)).concat("-").concat(String.valueOf(m))
						.concat("-").concat(String.valueOf(d));	
						}
						System.out.println(str);
				}
			
	}
}
			
					
			
				

		
	
