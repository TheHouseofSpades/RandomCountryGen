package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainScreen extends JPanel implements ItemListener, ActionListener {
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
    JButton begin = new JButton("Begin");
    Overview stats;
    
    JLabel feed = new JLabel("You begin your reign.");

  public MainScreen(Overview s){
    //MainScreen Constructor
    super(new BorderLayout());
    stats = s;
     System.out.println(s.budget + " " + s.crimeRateV + " " + s.happiness + " " + s.hunger + " " + s.populationV + " " + s.taxes);

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
    actionPanel.add(begin);
    begin.addActionListener(this);
    embargo.addActionListener(this);
    consultAssistant.addActionListener(this);
    taxBreak.addActionListener(this);
    holiday.addActionListener(this);
    
    JPanel feedPanel = new JPanel(new GridLayout(0, 1));
    feedPanel.add(feed);
    
    add(overPanel, BorderLayout.WEST);
    add(actionPanel, BorderLayout.SOUTH);
    add(feedPanel, BorderLayout.EAST);
    
    setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == embargo){
       
      }
    budget.setText("Budget: " + stats.budget);
    happiness.setText("Happiness: " + stats.happiness);
    crimeRate.setText("Crime: " + stats.crimeRateV);
    hunger.setText("Hunger: " + stats.hunger);
    literacy.setText("Literacy: " + stats.literacyV);
    population.setText("Population: " + stats.populationV);
  
  }
  public void itemStateChanged(ItemEvent e){
    //...
   
  }
  
  private static void createAndShowGUI(Overview stats) {
    //...
    //Create and set up the window.
        JFrame frame = new JFrame("MainScreen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new MainScreen(stats);
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

       
        //Display the window.
        frame.pack();
        frame.setVisible(true);
  }
  
  public static void main(String[] args, Overview stats){
   //...
   javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(stats);
            }
        });
    }
}
