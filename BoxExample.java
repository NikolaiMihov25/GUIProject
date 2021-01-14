package cars1;

	import java.awt.Component;
	import java.awt.Container;
	import javax.swing.BoxLayout;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JPasswordField;
	import javax.swing.JTextField;
	import javax.swing.JComboBox;
		
	public class BoxExample {


		    public static void addComponentsToPane(Container pane) {
		        pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
		     
		        addALabel("Sports cars dealership", pane);
		        addALabel("Here you can find your dream car and see its worth", pane);
		        addALabel("We have gathered the best offers from all around the world", pane);
		        addALabel("First select the price margine", pane);
		        addALabel("From", pane);
		        addATextField(pane);
		        addALabel("To", pane);
		        addATextField(pane);
		        addALabel("Then select the country of manufacture", pane);
		        addAComboBoxForCountries(pane);
		        addALabel("Finally select the brand", pane);
		        addAComboBoxForBrands( pane);
		        addAButton("Search", pane);
		        addALabel("Note: depending on where you live, delivery may take up to 3 months and there may be import costs", pane);

		       
		    }
		    

		    private static void addALabel(String text, Container container) {
		    	JLabel label = new JLabel(text);
		    	label.setAlignmentX(Component.CENTER_ALIGNMENT);
		    	container.add(label);
		    }
		    
		    private static void addAButton(String text, Container container) {
		        JButton button = new JButton(text);
		        button.setAlignmentX(Component.CENTER_ALIGNMENT);
		        container.add(button);
		    }
		    
		    private static void addATextField(Container container) {
		    	JTextField txtfld = new JTextField();
		    	container.add(txtfld);
		    }
		    
		    static String[] countriesOfManufacture = {"Any", "Italy", "USA", "Germany"};
		    static String[] brandsStrings = {"Any","Mazda", "Nissan", "Mercedes", "Dodge"};

		  private static void addAComboBoxForCountries( Container container) {
			  JComboBox countries = new JComboBox(countriesOfManufacture);
			  container.add(countries);
			  countries.setAlignmentX(Component.CENTER_ALIGNMENT);
		  }
		  
		  private static void addAComboBoxForBrands( Container container) {
			  JComboBox brands = new JComboBox(brandsStrings);
			  container.add(brands);
			  brands.setAlignmentX(Component.CENTER_ALIGNMENT);
		  }
		    /**
		     * Create the GUI and show it.  For thread safety,
		     * this method should be invoked from the
		     * event-dispatching thread.
		     */
		    private static void createAndShowGUI() {
		        //Create and set up the window.
		        JFrame frame = new JFrame("BoxLayoutDemo");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		        //Set up the content pane.
		        addComponentsToPane(frame.getContentPane());

		        //Display the window.
		        frame.pack();
		        frame.setVisible(true);
		    }

		    public static void main(String[] args) {
		        //Schedule a job for the event-dispatching thread:
		        //creating and showing this application's GUI.
		        javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		                createAndShowGUI();
		            }
		        });
		    }
		


	}


