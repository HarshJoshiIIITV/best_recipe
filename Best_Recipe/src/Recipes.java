import java.util.*;
public class Recipes {
	String recipe_name[]= {"Golden Milk","Creamy Green Salad","Steamed Veggie","Wheat Juice","Salty Wheat Juice","Lemonade-masala-Karela"
			,"Fish Biryani","Giloy Kadha with cinnamon","Apple Cinnamon Muffins","Golden couscous with apricots & crispy onions"};
	String recipe_technique[]= {"Boiling","Not-Cooked","Boiling","Not-Cooked","Not-Cooked","Cooking","Cooking","Boiling","Baking","Cooking"};
	String ingre[][]= {
	{"milk", "turmeric"},
	{"green beans", "broccoli", "kale", "walnuts", "cream"},
	{"peppers", "tomatoes", "carrots", "kale", "green beans"},
	{"wheat, pepper", "sugarcane juice"},
	{"wheat", "pepper", "salt","lemon"},
	{"lemon", "bitter gourd", "salt", "spices", "onion"},
	{"fish", "rice","spices", "herbs"},
	{"ginger", "cinnamon", "basil", "cloves", "pepper", "giloy"},
	{"flour", "sugar", "baking powder", "orange zest", "apple", "yogurt","eggs", "cinnamon"},
	{"couscous", "vegetable stock cube", "turmeric", "cinnamon", "apricot", "onions", "caster sugar", "vegetable","sunflower oil", "lemon", "olive oil", "coriander", "mint"}
	};
	public String[] get_recipename() {
		return recipe_name;
	}
	public String[] get_technique() {
		return recipe_technique;
	}
	public String[][] get_ingre(){
		return ingre;
	}

}
