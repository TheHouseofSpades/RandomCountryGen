package RandomCountryGen;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AttributeButtons {
  JCheckBox cBox;
  JTextField tBox;
  AttributeButtons(String name){
    cBox = new JCheckBox(name);
    tBox = new JTextField(name);
    tBox.setVisible(false);
    tBox.addItemListener(this);
  }
}