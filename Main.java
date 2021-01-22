package cars1;

import java.util.List;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JComboBox;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//create the array of cars
		
		List <Cars> cars;
		Cars[] car = new Cars[10];
		Cars car1 = new Cars(20000, "Germany", "BMW", "BMW M3");
		Cars.cars=Arrays.asList(car1);
		
		JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		
		//create the top panel
		JPanel topPanel = new JPanel();
		mainPanel.add(topPanel);
		
		JLabel topLabel = new JLabel("Sports cars dealership");
		topPanel.add(topLabel);
		
		//create the middle panel and split it vertically
		JPanel middlePanel = new JPanel();
		mainPanel.add(middlePanel);
		middlePanel.setLayout(new BoxLayout(middlePanel, BoxLayout.X_AXIS));
		
		//create left middle panel and fill it
		JPanel leftMiddlePanel = new JPanel();
		middlePanel.add(leftMiddlePanel);
		leftMiddlePanel.setLayout(new BoxLayout(leftMiddlePanel, BoxLayout.Y_AXIS));
		
		JLabel topGreetingsLabel = new JLabel("Here you can find your dream car and see its worth");
		leftMiddlePanel.add(topGreetingsLabel);
		
		JLabel bottomGreetingsLabel = new JLabel("We have gathered the best offers from all around the world");
		leftMiddlePanel.add(bottomGreetingsLabel);
		
		JLabel warningLabel1 = new JLabel("Note: depending on where you live, delivery may take up to 3 months");
		leftMiddlePanel.add(warningLabel1);
		
		JLabel warningLabel2 = new JLabel("Note: There may be import costs");
		leftMiddlePanel.add(warningLabel2);
		
		
		//create right middle panel and fill it
		JPanel rightMiddlePanel = new JPanel();
		middlePanel.add(rightMiddlePanel);
		rightMiddlePanel.setLayout(new BoxLayout(rightMiddlePanel, BoxLayout.Y_AXIS));
		
		JLabel priceMargineLabel = new JLabel("First select the price margine");
		rightMiddlePanel.add(priceMargineLabel);
		
		//create a panel oriented horizontally with the from to txt fields
		JPanel fromToPanel = new JPanel();
		rightMiddlePanel.add(fromToPanel);
		fromToPanel.setLayout(new BoxLayout(fromToPanel, BoxLayout.X_AXIS));
		
		JLabel fromLabel = new JLabel("From:");
		fromToPanel.add(fromLabel);
		
		JTextField fromTextField = new JTextField();
		fromToPanel.add(fromTextField);
		
		JLabel toLabel = new JLabel("To:");
		fromToPanel.add(toLabel);
		
		JTextField toTextField = new JTextField();
		fromToPanel.add(toTextField);
		
		JLabel countryLabel = new JLabel("Then enter the country of manufacture");
		rightMiddlePanel.add(countryLabel);
		
		JTextField countryTextField = new JTextField();
		rightMiddlePanel.add(countryTextField);
		
		JLabel brandLabel = new JLabel("Finally, select the brand");
		rightMiddlePanel.add(brandLabel);
		
		JTextField brandTextField = new JTextField();
		rightMiddlePanel.add(brandTextField);
	
		//create the bottom panel and add the search button in it
		JPanel bottomPanel = new JPanel();
		mainPanel.add(bottomPanel);
		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int from = Integer.parseInt(fromTextField.getText());
				int to = Integer.parseInt(toTextField.getText());
				String country = countryTextField.getText();
				String brand = brandTextField.getText();
//				System.out.println(from);
//				System.out.println(to);
//				System.out.println(country);
//				System.out.println(brand);
				
				
				for(Cars cars : Cars.cars) {
					if(cars.getPrice() > from && cars.getPrice() < to) {
						if(cars.getCountry().equals(country) || country == "any") {
							if(cars.getBrand().equals(brand)|| brand == "any") {
								
								JOptionPane.showMessageDialog(searchButton, cars.getName());
								JOptionPane.showMessageDialog(searchButton, cars.getName());
//								System.out.println(cars.getName());
//								System.out.print(cars.getPrice());
//								System.out.print(" " + cars.getCountry());
//								System.out.print(" " + cars.getBrand());
							}
						}
					}
				}
				
				
			}
		});
		bottomPanel.add(searchButton);
		
		frame.pack();
		frame.setVisible(true);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
