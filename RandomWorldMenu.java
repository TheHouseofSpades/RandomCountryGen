package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RandomWorldMenu extends JPanel
                          implements ItemListener, ActionListener {
    Overview stats;
    String govtName = "";
    Attributes wealth = new Attributes("Wealth");
    Attributes population = new Attributes("Population");
    String[] govts = {"Anarchy", "Imperialist", "Communist", "Feudalism", "Monarchy", "Republic", "Democracy"};
    JComboBox government = new JComboBox(govts);
    JButton confirm = new JButton("Confirm");
    
   public RandomWorldMenu() {
        super(new BorderLayout());
         JLabel lab1 = new JLabel("Label");
         setLayout(new FlowLayout()); 
         add(lab1 = new JLabel("Welcome to the Random Country Generator."));
         lab1.setVerticalAlignment(0);
         lab1.setHorizontalAlignment(SwingConstants.CENTER);
         JLabel lab2 = new JLabel("LabelTwo");
         setLayout(new FlowLayout()); 
         add(lab2 = new JLabel("Scale your population and wealth from 1-10!"));
         lab2.setVerticalAlignment(0);
         lab2.setHorizontalAlignment(SwingConstants.CENTER);

        //Put the check boxes in a column in a panel
        JPanel comboPanel = new JPanel(new GridLayout(0, 1));
        comboPanel.add(government);
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(wealth.cBox);
        checkPanel.add(population.cBox);
        JPanel fieldPanel = new JPanel(new GridLayout(0, 2));
        fieldPanel.add(wealth.tBox);
        fieldPanel.add(population.tBox);
        JPanel confirmPanel = new JPanel(new GridLayout(0, 1));
        confirmPanel.add(confirm);
        confirm.addActionListener(this);
        
        add(comboPanel, BorderLayout.LINE_START);
        add(fieldPanel, BorderLayout.LINE_START);
        add(checkPanel, BorderLayout.LINE_START);
        add(confirm, BorderLayout.PAGE_END);
        
        setBorder(BorderFactory.createEmptyBorder(250,100,250,100));
    }
   public void itemStateChanged(ItemEvent e){
    
   }
    public void actionPerformed(ActionEvent e){
      stats = calc();
      String lkj[] = null;
      MainScreen ms = new MainScreen(stats);
       System.out.println(stats.budget + " " + stats.crimeRateV + " " + stats.happiness + " " + stats.hunger + " " + stats.populationV + " " + stats.taxes);
      ms.main(lkj, stats);
    }
    
    public Overview calc(){
        confirm.setVisible(false);
        wealth.getInput();
        population.getInput();
        govtName = (String)(government.getItemAt(government.getSelectedIndex()));
        RandomWorld calculations = new RandomWorld();
        //Placeholder variables
        double wealthV = calculations.makeWealth(govtName, wealth.value);
        int popV = calculations.makePop(govtName, population.value);
        double literacyV = calculations.makeLiteracy(govtName, wealthV);
        double crimeRateV = calculations.makeCriRate(wealthV, literacyV);
        double techV = calculations.makeTech(wealthV, literacyV);
        double lifeExpectancyV = calculations.makeLifExpec(techV, crimeRateV);
        int foodSupplyV = calculations.makeFoSupp(wealthV);
        double budgetV = calculations.makeBudget(govtName);
        
        //Overview Variable
        Overview stats = new Overview(crimeRateV, literacyV, popV, foodSupplyV, wealthV);
        stats.budget = budgetV;
        
        System.out.println(stats.budget + " " + stats.crimeRateV + " " + stats.happiness + " " + stats.hunger + " " + stats.populationV + " " + stats.taxes);
        return stats;
    }
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Random World Generator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new RandomWorldMenu();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
       
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
