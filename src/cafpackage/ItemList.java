package cafpackage;

public class ItemList {
	
	private String[] drinks = {"Coca-Cola", "Iced Tea", "Coffee"};
	private String[] food = {"Pizza", "Sushi", "Tacos"};
	public String[] getItems(String category) {
		if (category.equals("Food")) return food;
		if (category.equals("Drinks")) return drinks;
		return null;
		// TODO Auto-generated method stub
	}

}
