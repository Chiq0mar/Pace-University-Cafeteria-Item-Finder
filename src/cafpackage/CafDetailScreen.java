package cafpackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.component.ObjectChoiceField;
import net.rim.device.api.ui.container.MainScreen;

public class CafDetailScreen extends MainScreen {
	

	/**
	 * @param cat 
	 * 
	 */
	public CafDetailScreen(Field cat) {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		// TODO Auto-generated constructor stub
		 String name = (String)((ObjectChoiceField)cat).getChoice(((ObjectChoiceField)cat).getSelectedIndex());
		Item displayedItem = new Item(name);
		 
	}

}
