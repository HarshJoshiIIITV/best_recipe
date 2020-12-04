import java.util.*;
public class recommend_or_not {
	String recommend,notrecommend;
	public recommend_or_not(String recommend,String notrecommend) {
		this.recommend=recommend;
		this.notrecommend=notrecommend;
		System.out.println();
		System.out.println("****************Recommended ingredients****************");
		recommend_me();
		System.out.println();
		System.out.println("****************Not recommended ingredients****************");
		recommend_not();
	}
	public void recommend_me() {
		String R[]=recommend.split(",");
		for(int i=0;i<R.length;i++) {
			System.out.print(R[i]);
			if(i!=R.length-1)
				System.out.print(", ");
		}
		System.out.println();
	}
	public void recommend_not() {
		String R[]=notrecommend.split(",");
		for(int i=0;i<R.length;i++){
			System.out.print(R[i]);
			if(i!=R.length-1)
				System.out.print(", ");
		}
		System.out.println();
	}
}
