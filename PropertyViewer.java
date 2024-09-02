import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * This project implements a simple application. Properties from a fixed
 * file can be displayed. 
 * 
 * 
 * @author Michael Kölling and Josh Murphy and Gurvir Singh (K23010952)
 * @version 1.0
 */
public class PropertyViewer
{    
    private PropertyViewerGUI gui;     // the Graphical User Interface
    private Portfolio portfolio;
    private Property currentProperty;
    private int index;
    private int maxIndex;
    private int views;
    private int totalPrice;
    
    /**
     * Create a PropertyViewer and display its GUI on screen.
     */
    public PropertyViewer()
    {
        gui = new PropertyViewerGUI(this);
        portfolio = new Portfolio("airbnb-london.csv");
        index = 0;
        maxIndex = (portfolio.numberOfProperties() - 1);
        views = 0;
        totalPrice = 0;
        displayProperty();
    }
    
    /**
     * Displays the current property and updates the statistics.
     */
    private void displayProperty()
    {
        currentProperty = portfolio.getProperty(index);
        gui.showProperty(currentProperty);
        gui.showID(currentProperty);
        gui.showFavourite(currentProperty);
        views++;
        totalPrice += currentProperty.getPrice();
    }
    
    /**
     * Displays the next property.
     */
    public void nextProperty()
    {
        index++;
        if (index > maxIndex)
        {
            index = 0;
        }
        displayProperty();
    }

    /**
     * Displays the previous property.
     */
    public void previousProperty()
    {
        index--;
        if (index < 0)
        {
            index = maxIndex;
        }
        displayProperty();
    }

    /**
     * Toggles whether this property is marked as a favourite or not.
     */
    public void toggleFavourite()
    {
        currentProperty.toggleFavourite();
        gui.showFavourite(currentProperty);
    }
    
    
    //----- methods for challenge tasks -----
    
    /**
     * This method opens the system's default internet browser
     * The Google maps page should show the current properties location on the map.
     */
    public void viewMap() throws Exception
    {
       double latitude = currentProperty.getLatitude();
       double longitude = currentProperty.getLongitude();
       
       URI uri = new URI("https://www.google.com/maps/place/" + latitude + "," + longitude);
       java.awt.Desktop.getDesktop().browse(uri); 
    }
    
    /**
     * Return the number of properties viewed.
     */
    public int getNumberOfPropertiesViewed()
    {
        return views;
    }
    
    /**
     * Return the average price of the properties viewed.
     */
    public int averagePropertyPrice()
    {
        int averagePrice = totalPrice / views;
        return averagePrice;
    }
}
