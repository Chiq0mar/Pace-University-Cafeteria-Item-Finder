package cafpackage;

import net.rim.device.api.ui.Field;
import net.rim.device.api.ui.FieldChangeListener;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.ButtonField;
import net.rim.device.api.ui.component.LabelField;
import net.rim.device.api.ui.container.MainScreen;

public class CafLocationScreen extends MainScreen {

	/**
	 * 
	 */
	public CafLocationScreen() {
		super(MainScreen.VERTICAL_SCROLL | MainScreen.VERTICAL_SCROLLBAR);
		// TODO Auto-generated constructor stub
		setTitle( "Cafeteria Locations" );

        
        LabelField  intro = new LabelField("Please choose a cafeteria location:");
        add( intro );

        ButtonField Caf101Button = new ButtonField( "Cafeteria 101", ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        add( Caf101Button );
        Caf101Button.setChangeListener( new FieldChangeListener() {
            public void fieldChanged( Field arg0, int arg1 ) {
            	UiApplication.getUiApplication().pushScreen( new Caf101Screen());
            }
        } );
        
        ButtonField KioskButton = new ButtonField( "Coffee Kiosk", ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        add( KioskButton );
        KioskButton.setChangeListener( new FieldChangeListener() {
            public void fieldChanged( Field arg0, int arg1 ) {
            	UiApplication.getUiApplication().pushScreen( new CafKioskScreen());
            }
        } );
        
        ButtonField SpotlightButton = new ButtonField( "Spotlight Cafe", ButtonField.CONSUME_CLICK | ButtonField.FIELD_RIGHT );
        add( SpotlightButton );
        SpotlightButton.setChangeListener( new FieldChangeListener() {
            public void fieldChanged( Field arg0, int arg1 ) {
            	UiApplication.getUiApplication().pushScreen( new CafSpotlightScreen());
            }
        } );
	}

}
