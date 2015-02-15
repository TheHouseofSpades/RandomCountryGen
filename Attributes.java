package RandomCountryGen;
 
import java.lang.Integer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Attributes implements ItemListener{
  JLabel cBox;
  JTextField tBox;
  int value;
  Attributes(String name){
    cBox = new JLabel(name);
    tBox = new JTextField(name);
  }
  public void itemStateChanged(ItemEvent e){
     Object source = e.getItemSelectable();  
     if (source == this.cBox) {
         this.tBox.setVisible(true);
    }
    }
  public void getInput(){
    this.value = Integer.parseInt(tBox.getText());
  }
}