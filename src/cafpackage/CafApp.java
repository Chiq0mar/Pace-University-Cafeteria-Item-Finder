package cafpackage;

import net.rim.device.api.database.Database;
import net.rim.device.api.database.DatabaseFactory;
import net.rim.device.api.database.Statement;
import net.rim.device.api.io.URI;
import net.rim.device.api.ui.UiApplication;

/**
 * This class extends the UiApplication class, providing a graphical user interface.
 */
public class CafApp extends UiApplication {
    /**
     * Entry point for application
     * 
     * @param args
     *            Command line arguments (not used)
     */
    public static void main( String[] args ) {
    	try
		{
			URI itemURI = URI.create("file:///SDCard/CafApp.db"); 
			DatabaseFactory.create(itemURI);
			Database d = DatabaseFactory.open(itemURI);
			Statement st = d.createStatement( 
					"CREATE TEMP TABLE 'Item List' ( " +
					"'Item' TEXT, " +
					"'Price' NUMERIC " +
					"'Category' TEXT " +
					"'Subcategory' TEXT " +
					"'Main Caf' " +
					"'Spotlight Cafe' " +
					"'Coffee Kiosk' " +
					"'Image' TEXT " +
					")" );
			d.createStatement("INSERT INTO Item List (Item,Price,Category,Subcategory,Location) " +
					"VALUES ('Coca-Cola, 20 oz.', 2.00, 'Drinks' , 'Soda', 1, 1, 1, 'src/Coke.jpg')" +
		            "VALUES ('Coca-Cola, 20 oz.', 2.00, 'Drinks' , 'Soda', 1, 1, 1, 'src/Coke.jpg')" +
		            "VALUES ('Coca-Cola, 20 oz.', 2.00, 'Drinks' , 'Soda', 1, 1, 1, 'src/Coke.jpg')" +
		            "VALUES ('Coca-Cola, 20 oz.', 2.00, 'Drinks' , 'Soda', 1, 1, 1, 'src/Coke.jpg')"
					);
			st.prepare();
			st.execute();
			st.close();
		}
		catch ( Exception e ) 
		{         
			System.out.println( e.getMessage() );
		}
        // Create a new instance of the application and make the currently
        // running thread the application's event dispatch thread.
        CafApp theApp = new CafApp();
        theApp.enterEventDispatcher();
    }

    /**
     * Creates a new CafApp object
     */
    public CafApp() {
        // Push a screen onto the UI stack for rendering.
        pushScreen( new CafMainScreen() );
    }
}
