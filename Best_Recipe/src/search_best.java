import java.util.*;
public class search_best {
	Recipes R=new Recipes();
	String recommend[];
	String not_recommend[];
	String ingre[][]=R.get_ingre();
	public search_best(String recommend[],String notrecommend[]) {
		this.recommend=recommend;
		this.not_recommend=notrecommend;
		Arrays.sort(recommend);
		Arrays.sort(not_recommend);
		algo();
	}
	public void algo() {
		float max=Integer.MIN_VALUE;
		int index=0;
		ArrayList<String>caution=new ArrayList<>();
		ArrayList<String>list=new ArrayList<>();
		for(int i=0;i<ingre.length;i++) {
			String arr[]=ingre[i];
			float reco=0.0f,not_reco=0.0f;
			int total=arr.length;
			list=new ArrayList<>();
			for(int j=0;j<total;j++) {
				int x=Arrays.binarySearch(recommend,arr[j]);
				int y=Arrays.binarySearch(not_recommend,arr[j]);
				if(x>=0) {
					reco++;
				}
				if(y>=0){
					list.add(arr[j]);
					not_reco++;
				}
			}
			if((reco-not_reco)/total>max) {
				max=(reco-not_reco)/total;
				index=i;
				caution=new ArrayList<>();
				caution=(ArrayList)list.clone(); 
			}
		}
		for(int i=0;i<caution.size();i++) {
			if(i==0) {
				System.out.println("Caution: following ingredients are not recommended so please use them less");
			}
			System.out.print(caution.get(i)+" ");
		}
		System.out.println();
		System.out.println("****Best Recipe is "+R.recipe_name[index]+"****");
		System.out.println("Techinque is: "+R.recipe_technique[index]);
		String ans[]=ingre[index];
		System.out.print("Ingredients of Recipe are: ");
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]);
			if(i!=ans.length-1) {
				System.out.print(", ");
			}
		}
		
		
	}
}
