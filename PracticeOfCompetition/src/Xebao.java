import java.util.Scanner;

public class Xebao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int K,N;			
		Scanner scanner=new Scanner(System.in);
		K=scanner.nextInt();//��������
		int[] arr = new int[K];//ÿ������������
		int i = 0; 
		int A[];//ÿ��ӯ�����
		int MAX[]=new int[K];
		int Sum[]=new int[K];
		boolean Daysflag=false;
		boolean Moneyflag=false;
		int count=0;
		while(scanner.hasNextInt()) {
			if(Daysflag==false) {
				if(i<K) {
					arr[i]=scanner.nextInt();//��i+1������������
					Daysflag=true;
					Moneyflag=false;
				}
				}
			else {
				A=new int[arr[i]];
				count=0;
				Sum[i]=MAX[i]=0;
				for(int j=0;j<arr[i];j++){
				A[j]=scanner.nextInt();
				count++;
				Sum[i]+=A[j];
				if(Sum[i]>MAX[i])
				MAX[i]=Sum[i];
				else if(Sum[i]<0)
				Sum[i]=0;
				}
				
				 if(i<K&&count==arr[i]) {
				 i++;
				 Daysflag=false;
				 Moneyflag=true;
				 }
if( i==K&&Moneyflag==true) {	
		 for(int t=0;t<K;t++) {
				System.out.println(MAX[t]);	 
				Moneyflag=false;
}	
}
			}			
		}
	}
}


