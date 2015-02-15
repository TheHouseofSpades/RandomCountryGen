package RandomCountryGen; 
import java.io.*;
import java.lang.Math;
public class Overview{
 
 double crimeRateV = 0, literacyV = 0;
 int happiness = 0, hunger = 0, populationV = 0, taxes = 0, budget = 0;
   
 public Overview(double crimeRate, double literacy, int pop, int foodSupply, double wealth){
  crimeRateV = crimeRate;
  literacyV = literacy;
  populationV = pop;
  happiness = 50;
  hunger = 100-foodSupply;
  taxes = 20;
 }
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
   if(h<25){
    return("Your people may revolt soon. You must do everything in your power to make them happy."); 
   }
   else if(h<40){
    return ("Your people are discontent with your service. Try decreasing their financial burden, or giving them a bit of a respite."); 
   }
   else if(g>90){
     return("Your people are starving, you must increase the supply of food!");
   }
   else if(g>50){
    return("Your people are hungry, find a way to feed them."); 
   }
   else if(c>85){
   return ("There is looting and murdering in the streets! You must put a stop to this!");
   }
   else if(c>50){
    return("There are many criminals about! You must lower the rate of crime!"); 
   }
   return ("");
 }
 public void embargo(){
  happiness -= Math.random()*14 + 1; 
  budget -= 50;
  crimeRateV += Math.random()*4;
 }
 public void investEdu(){
  happiness += (int)Math.random()*14+1; 
  literacyV += Math.random()*19+1;
  budget -= 200;
 }
 public void strPolFor(){
   crimeRateV -= (int)Math.random()*19+1;
   budget -= 100;
 }
 
}

