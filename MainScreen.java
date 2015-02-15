package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainScreen extends JPanel implements ItemListener {
    //Overview stats = new Overview();
    int x = 10;
    JLabel budget = new JLabel("Budget ");
    JLabel crimeRate = new JLabel("Crime Rate ");
    JLabel literacy = new JLabel("Literacy ");
    JLabel happiness = new JLabel("Happiness ");
    JLabel hunger = new JLabel("Hunger ");
    JLabel population = new JLabel("Population ");
    
    JButton holiday = new JButton("Delcare a Holiday");
    JButton taxBreak = new JButton("Tax Break");
    JButton consultAssistant = new JButton("Consult an Assistant");
    JButton embargo = new JButton("Create Embargo");
    Overview stats;
    
    JLabel feed = new JLabel("You begin your reign.");
  public MainScreen(){
    //MainScreen Constructor
    super(new BorderLayout());
    RandomWorldMenu rwm = new RandomWorldMenu();
    String args[] = null;
    rwm.main(args);
    
    RandomWorld calculations = new RandomWorld();
    //Placeholder variables
    double wealthV = calculations.makeWealth(rwm.govtName, rwm.wealth.value);
    int popV = calculations.makePop(rwm.govtName, rwm.population.value);
    double literacyV = calculations.makeLiteracy(rwm.govtName, wealthV);
    double crimeRateV = calculations.makeCriRate(wealthV, literacyV);
    double techV = calculations.makeTech(wealthV, literacyV);
    double lifeExpectancyV = calculations.makeLifExpec(techV, crimeRateV);
    int foodSupplyV = calculations.makeFoSupp(wealthV);
    double budgetV = calculations.makeBudget(rwm.govtName);
    
    //Declare Panels
    JPanel overPanel = new JPanel(new GridLayout(0, 1));
    overPanel.add(budget);
    overPanel.add(crimeRate);
    overPanel.add(literacy);
    overPanel.add(hunger);
    overPanel.add(population);
    
    JPanel actionPanel = new JPanel(new GridLayout(0, 1));
    actionPanel.add(holiday);
    actionPanel.add(taxBreak);
    actionPanel.add(consultAssistant);
    actionPanel.add(embargo);
    
    JPanel feedPanel = new JPanel(new GridLayout(0, 1));
    feedPanel.add(feed);
    
    add(overPanel, BorderLayout.LINE_START);
    add(actionPanel, BorderLayout.PAGE_END);
    add(feedPanel, BorderLayout.LINE_END);
  }
  
  public void itemStateChanged(ItemEvent e){
    //...
    
  }
  
  private static void createAndShowGUI() {
    //...
    //Create and set up the window.
        JFrame frame = new JFrame("MainScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new MainScreen();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
       
        //Display the window.
        frame.pack();
        frame.setVisible(true);
  }
  
  public static void main(String[] args){
   //...
   javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
