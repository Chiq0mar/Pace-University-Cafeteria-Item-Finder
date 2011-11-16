package cafpackage;

import net.rim.device.api.system.EncodedImage;

public class Item {

	private String[][] items = {{"Coca-Cola, 20 oz.", "$2.00" , "Drinks" , "Soda" , "Main Caf", "Spotlight Cafe", "Coffee Kiosk"},
								{"Iced Tea, 16 oz.", "$2.00" , "Drinks" , "Soda" , "Main Caf", null, "Coffee Kiosk"},
								{"Coffee, 16 oz.", "$1.50" , "Drinks" , "Hot Drinks" , null, null, "Coffee Kiosk"},
								{"Pizza, by slice", "$3.00" , "Food" , "Entree" , null, "Spotlight Cafe", null},
								{"Sushi, by platter", "$12.00" , "Food" , "Specialty" , "Main Caf", null, null},
								{"Tacos, two", "$4.00" , "Food" , "Bar" , "Main Caf", null, null}};
	public EncodedImage[] itemPictures = new EncodedImage[6];
								

	private String[] currentItem;
	private EncodedImage currentImage;
	public Item(String name) {
		// TODO Auto-generated constructor stub
		itemPictures[0]= EncodedImage.getEncodedImageResource( "img/Coke.jpg" );
		itemPictures[1]= EncodedImage.getEncodedImageResource( "img/iced_tea.jpg" );
		itemPictures[2]= EncodedImage.getEncodedImageResource( "img/coffee.jpg" );
		itemPictures[3]= EncodedImage.getEncodedImageResource( "img/pizza.jpg" );
		itemPictures[4]= EncodedImage.getEncodedImageResource( "img/sushi.jpg" );
		itemPictures[5]= EncodedImage.getEncodedImageResource( "img/tacos.jpg" );
		
		if (name.equals("Coca-Cola")) {
			currentItem = items[0];
			currentImage = itemPictures[0];
		}
		if (name.equals("Iced Tea")) {
			currentItem = items[1];
			currentImage = itemPictures[1];
		}
		if (name.equals("Coffee")) {
			currentItem = items[2];
			currentImage = itemPictures[2];
		}
		if (name.equals("Pizza")) {
			currentItem = items[3];
			currentImage = itemPictures[3];
		}
		if (name.equals("Sushi")) {
			currentItem = items[4];
			currentImage = itemPictures[4];
		}
		if (name.equals("Tacos")) {
			currentItem = items[5];
			currentImage = itemPictures[5];
		}
	}

}

