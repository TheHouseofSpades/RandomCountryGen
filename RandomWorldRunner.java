package RandomCountryGen;
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
import java.lang.*;

class RandomWorldRunner{
  public static void main(String args[]){
    Overview view;
    RandomWorldMenu rwm = new RandomWorldMenu();
    String pbj[] = null;
    view = rwm.main(pbj);
    if(view != null) System.out.println("SUCCESS");
    else System.out.println("FAILURE");
  }
}
  
