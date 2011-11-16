package cafpackage;

import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.MenuItem;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.container.MainScreen;
import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.component.BasicEditField;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.Dialog;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.component.Menu;
import net.rim.device.api.util.StringProvider;

public class CafMainScreen extends MainScreen {
	
    public CafMainScreen() {
        super( MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR );
        setTitle( "Pace Caf Item Locator" );

        
        LabelField  intro = new LabelField("What would you like to search by?");
        add( intro );

        ButtonField LocationButton = new ButtonField( "Choose by location", ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        add( LocationButton );
        LocationButton.setChangeListener( new FieldChangeListener() {
            public void fieldChanged( Field arg0, int arg1 ) {
            	UiApplication.getUiApplication().pushScreen( new CafLocationScreen());
            }
        } );
        
        ButtonField ItemButton = new ButtonField( "Choose by type of item", ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        add( ItemButton );
        ItemButton.setChangeListener( new FieldChangeListener() {
            public void fieldChanged( Field arg0, int arg1 ) {
            	UiApplication.getUiApplication().pushScreen( new CafCategoryScreen());
            }
        } );
    }

    protected void makeMenu( Menu menu, int instance ) {
    	super.makeMenu(menu, instance);
        MenuItem allItemsMenu = new NewMenuItem();
        menu.add( allItemsMenu );
    }

    private class NewMenuItem extends MenuItem {
        public NewMenuItem() {
            super( new StringProvider( "List all items" ), 0, 0 );
        }

        public void run() {
        	UiApplication.getUiApplication().pushScreen( new CafAllItems() );
        }
    }

}
