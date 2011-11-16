package cafpackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.ObjectChoiceField;
import net.rim.device.api.ui.container.MainScreen;

public class CafItemScreen extends MainScreen {

	/**
	 * 
	 */
	ItemList il = new ItemList();
	public CafItemScreen() {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		// TODO Auto-generated constructor stub
		
	}

	public CafItemScreen(Field cat) {
		// TODO Auto-generated constructor stub
		LabelField  intro = new LabelField("Please choose an item below:");
        add( intro );
        String label = ((ButtonField)cat).getLabel() + ": ";
        ObjectChoiceField list = new ObjectChoiceField(label, il.getItems(((ButtonField)cat).getLabel()), 0);
		add(list);
		list.setChangeListener( new FieldChangeListener() {
        		public void fieldChanged( Field cat, int arg1 ) {
        			UiApplication.getUiApplication().pushScreen(new CafDetailScreen(cat));
        		}
        	} );
	}



}
