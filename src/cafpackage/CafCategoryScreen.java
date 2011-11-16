package cafpackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

public class CafCategoryScreen extends MainScreen {

	private final static int CATEGORIES = Category.getNumCat();
	/**
	 * 
	 */
	public CafCategoryScreen() {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		// TODO Auto-generated constructor stub
setTitle( "Cafeteria Locations" );
		ButtonField[] CatButton = new ButtonField[CATEGORIES];
		Category CatList = new Category();
		String[] labels = new String[CATEGORIES];
		
		for (int i = 0; i < CATEGORIES; i++) {
			CatButton[i] = new ButtonField();
			labels[i] = CatList.getCats()[i];
		}
		
		
		
        LabelField  intro = new LabelField("Please choose a category of item:");
        add( intro );
        
        for (int i = 0; i < CATEGORIES; i++) {
        	CatButton[i] = new ButtonField( labels[i], ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        	add( CatButton[i] );
        	CatButton[i].setChangeListener( new FieldChangeListener() {
        		public void fieldChanged( Field cat, int arg1 ) {
        			UiApplication.getUiApplication().pushScreen(new CafItemScreen(cat));
        		}
        	} );
        }

	}

}
