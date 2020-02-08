import java.math.BigDecimal;
public class Practice1 {
	private static long radius=1000;
	private static final String PI="3.14159265358979323";
	private static BigDecimal Carea;
	private static long Rarea;
	void CircleArea(long r) {
		BigDecimal R= new BigDecimal(r);
		BigDecimal pi= new BigDecimal(PI);
		Carea=pi.multiply(R).multiply(R);
	}
	void RectArea(long d) {
		Rarea=d*d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice1 practice=new Practice1();
		practice.CircleArea(radius);
		practice.RectArea(2*radius);
		
		//System.out.println(Rarea-(Rarea-Carea.longValue()));
		int r=1000; //调用函数进行方格的计数
		RectCount(r,0,0); } 
	public static void RectCount(int r,int dr,int dc){ 
		//因为对称，只计算一个象限就行，之后进行*4 //以第一象限为例，一定要注意是右上角，所以加1 
		int count=0;
		for(int i=dr+1;i<=r;i++){
			for(int j=dc+1;j<=r;j++){
				double distance = Math.sqrt(i*i+j*j); 
				if(distance<=r){ 
					count++;
				}
				} 
			} 
		System.out.println(count*4);
			}
	}


