import java.util.*;
public class Diabetic {
	String name="Diabetes";
	String recommend ="spinach,kale,avocadoes,chia,green beans,apple cider vinegar,flax seeds,garlic,carrots,peppers,tomatoes,wheat,oats,barley,walnuts,nuts,yogurt,broccoli,olive oil,bitter-gourd"; 
	String notrecommend="packaged food,fast food,sugar,bakery products,sweets,chips,bread,pastas,meat";
	public String name() {
		return name;
	}
	public String todo() {
		return recommend;
	}
	public String notodo() {
		return notrecommend;
	}
}
