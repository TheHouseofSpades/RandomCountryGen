package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Attributes implements ItemListener{
  JCheckBox cBox;
  JTextField tBox;
  Attributes(String name){
    cBox = new JCheckBox(name);
    cBox.setMnemonic(KeyEvent.VK_W);
    cBox.addItemListener(this);
    tBox = new JTextField(name);
    tBox.setVisible(false);
  }
  public void itemStateChanged(ItemEvent e){
     Object source = e.getItemSelectable();  
     if (source == this.cBox) {
         this.tBox.setVisible(true);
    }
    }
}