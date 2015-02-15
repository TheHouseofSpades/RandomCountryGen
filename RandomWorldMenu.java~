package attachments;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RandomWorldMenu extends JPanel
                          implements ItemListener {
    JCheckBox wealthButton;
    JCheckBox populationButton;
    JCheckBox waterButton;
    JCheckBox urbanButton;
    JCheckBox lifeButton;
    JCheckBox literacyButton;
    
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
         //lab2.setVerticalAlignment(SwingConstants.TOP);
         lab2.setHorizontalAlignment(SwingConstants.CENTER);
        //Create the check boxes.
        wealthButton = new JCheckBox("Wealth");
        wealthButton.setMnemonic(KeyEvent.VK_W);
        wealthButton.setSelected(false);
        
        populationButton = new JCheckBox("Population");
        populationButton.setMnemonic(KeyEvent.VK_P);
        populationButton.setSelected(false);
        
        waterButton = new JCheckBox("Water percentage");
        waterButton.setMnemonic(KeyEvent.VK_R);
        waterButton.setSelected(false);
        
        urbanButton = new JCheckBox("Urban percentage");
        urbanButton.setMnemonic(KeyEvent.VK_U);
        urbanButton.setSelected(false);
        
        lifeButton = new JCheckBox("Life expectancy");
        lifeButton.setMnemonic(KeyEvent.VK_L);
        lifeButton.setSelected(false);
        
        literacyButton = new JCheckBox("Literacy rate");
        literacyButton.setMnemonic(KeyEvent.VK_F);
        literacyButton.setSelected(false);
 
        //Register a listener for the check boxes.
        wealthButton.addItemListener(this);
        populationButton.addItemListener(this);
        waterButton.addItemListener(this);
        urbanButton.addItemListener(this);
        lifeButton.addItemListener(this);
        literacyButton.addItemListener(this);
 
        //Put the check boxes in a column in a panel
        JPanel checkPanel = new JPanel(new GridLayout(0, 1));
        checkPanel.add(wealthButton);
        checkPanel.add(populationButton);
        checkPanel.add(waterButton);
        checkPanel.add(urbanButton);
        checkPanel.add(lifeButton);
        checkPanel.add(literacyButton);
    
 
        add(checkPanel, BorderLayout.LINE_START);
        setBorder(BorderFactory.createEmptyBorder(50,100,50,100));
    }
 
   public void itemStateChanged(ItemEvent e){
     Object source = e.getItemSelectable();  
     if (source == wealthButton) {
          JTextField ws;
          ws = new JTextField();
        }
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
