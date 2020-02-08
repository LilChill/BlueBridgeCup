
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger a=new BigInteger("2"),b=new BigInteger("3"),c=new BigInteger("2"),d=new BigInteger("3"),t1,t2;
		for(int i=0;i<123456;i++) {		
			t1=a.multiply(c).subtract(b.multiply(d));
			t2=b.multiply(c).add(a.multiply(d));
			a=t1;
			b=t2;
		}
		//System.out.println(a+"+"+b+"i");
		try {
			FileWriter file=new FileWriter("ans.txt");
			
			file.write(a+"+"+b+"i");
	        file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
