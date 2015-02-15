package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomWorldMenu extends JPanel
                          implements ItemListener {
    AttributeButtons wealth = new AttributeButtons("Wealth");
    AttributeButtons population = new AttributeButtons("Population");
    AttributeButtons water = new AttributeButtons("Water");
    AttributeButtons urban = new AttributeButtons("Urban");
    AttributeButtons life = new AttributeButtons("Life");
    AttributeButtons literacy = new AttributeButtons("Literacy");
    
   public RandomWorldMenu() {
        super(new BorderLayout());
         JLabel lab1 = new JLabel("Label");
         setLayout(new FlowLayout()); 
         add(lab1 = new JLabel("Welcome to the Random Country Generator."));
         lab1.setVerticalAlignment(SwingConstants.TOP);
         lab1.setHorizontalAlignment(SwingConstants.CENTER);
         JLabel lab2 = new JLabel("LabelTwo");
         setLayout(new FlowLayout()); 
         add(lab2 = new JLabel("Select any parameters you wish to input."));
         lab2.setVerticalAlignment(0);
         lab2.setHorizontalAlignment(SwingConstants.CENTER);

        //Put the check boxes in a column in a panel
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(wealth.cBox);
        checkPanel.add(population.cBox);
        checkPanel.add(water.cBox);
        checkPanel.add(urban.cBox);
        checkPanel.add(life.cBox);
        checkPanel.add(literacy.cBox);
        JPanel fieldPanel = new JPanel(new GridLayout(0, 2));
        fieldPanel.add(wealth.tBox);
        fieldPanel.add(population.tBox);
        fieldPanel.add(water.tBox);
        fieldPanel.add(urban.tBox);
        fieldPanel.add(life.tBox);
        fieldPanel.add(literacy.tBox);
        
 
        add(fieldPanel, BorderLayout.LINE_START);
        add(checkPanel, BorderLayout.LINE_START);
        setBorder(BorderFactory.createEmptyBorder(50,100,50,100));
    }
    public void itemStateChanged(ItemEvent e){
      
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
