package RandomCountryGen; 
import java.io.*;
import java.lang.Math;
public class Overview{
 
 double budget = 0, crimeRateV = 0, literacyV = 0;
 int happiness = 0, hunger = 0, populationV = 0, taxes = 0;
   
 public Overview(double crimeRate, double literacy, int pop, int foodSupply, double wealth){
  crimeRateV = crimeRate;
  literacyV = literacy;
  populationV = pop;
  happiness = 50;
  hunger = 100-foodSupply;
  taxes = 20;
 }
  //public double makeBudget(String g){
  //int f = RandomWorld.findGovNum(g);
  //return (23966871.42)*(Math.random()*f+1);
   //}   
  public double tax(int t){
   if(t>taxes){
    happiness -= Math.random()*9+1;
    taxes = t;
   }
   else if(t<taxes){
     happiness += Math.random()*9+1;
     taxes = t;
   }
   return budget += (budget*(t/100)); 
 }
 public void taxBreak(){
   happiness += 10;
 }
 public String consAssist(int h, int g, int c){
   if(h<40){
    return ("Your people are discontent with your service. Try decreasing their financial burden, or giving them a bit of a respite."); 
   }
   if(h<25){
    return("Your people may revolt soon. You must do everything in your power to make them happy."); 
   }
   return "";
 }
 
 
}

