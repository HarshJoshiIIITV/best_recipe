import java.util.*;
public class start_me {
	public static void diabetic() {
		Diabetic d=new Diabetic();
		System.out.println("\n******You are in Diabetes section******");
		recommend_or_not r=new recommend_or_not(d.todo(),d.notodo());
		search_best sb=new search_best(d.todo().split(","),d.notodo().split(","));
	}
	public static void hypertension() {
		Hypertension h=new Hypertension();
		System.out.println("\n******You are in Hypertension section******");
		recommend_or_not r=new recommend_or_not(h.todo(),h.notodo());
		search_best sb=new search_best(h.todo().split(","),h.notodo().split(","));
	}
	public static void covid19() {
		Covid19 c=new Covid19();
		System.out.println("\n******You are in Covid19 section******");
		recommend_or_not r=new recommend_or_not(c.todo(),c.notodo());
		search_best sb=new search_best(c.todo().split(","),c.notodo().split(","));
	}
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Welcome to the Best_recipe\n\nSelect your health conditon out of:\n");
		System.out.print("Type 1 for Diabetic \nType 2 for Hypertension \nType 3 for COVID-19 \n");
		int choice=in.nextInt();
		if(choice==1) 
			diabetic();
		else if(choice==2)
			hypertension();
		else
			covid19();
		
	}
}
