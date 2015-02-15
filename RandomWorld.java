package RandomCountryGen;
public class RandomWorld{
  int population = 0, technology = 0, lifeExpectancy = 0, foodSupply = 0;
  double literacy = 0, crimeRate = 0, wealth = 0; 
  public double makeWealth(String g, int s){
    int f = findGovNum(g);
    int seed = 0;
    seed = (int)(Math.random())*(s*(int)(Math.random()*2));
    double mean = 363448.69;
    if(seed > 10){
     return mean - (Math.random() * (5201.27*f)); 
    }
    else if(seed < 10){
     return mean + (Math.random() * (187807.33*f)); 
    }
  return 0;  
  }
  public int findGovNum(String g){
   String[] govt = {"Anarchy", "Imperialist", "Communist", "Feudalism", "Monarchy", "Republic", "Democracy"};
   for(int i = 0; i<govt.length; i++){
     if (govt[i].equals(g)){
      return i+1; 
     }
   }
   return 0; 
  }
  public int makePop(String g, int s){
   int f = findGovNum(g);
   int max = 1368200000;
   int min = 56;
   int mean = 295344439;
   int seed = 0;
   seed = (int)(Math.random())*(s*(int)(Math.random()*2));
     if(seed > 10){
     return mean - (int)(Math.random() * ((mean-min)/7)*f); 
    }
    else if(seed < 10){
     return mean + (int)(Math.random() * ((max-mean)/7)*f); 
    }
  return 0;
  }
  public double makeLiteracy(String g, double w){
   int f = findGovNum(g);
   double d = ((w/16768100)*100)/2;
   return d + d*(f/10);
  }
  public double makeCriRate(double w, double l){
    double d = (w/16768100)/1.5;
    d = 40 - (40*d);
    return d - (d*(l/100));
  }
  public int makeTech(int w, double l){
   double d = (w/16768100)*5;
   return (int)(d + (l/20));
  }
  public int makeLifExpec(int t, double c){
   double d = ((t/10)*100)-12; 
   return (int)(d-c/10);
  }
  public int makeFoSupp(int w){
   return (int)((w/16768100)*100); 
  }
  public double makeBudget(String g){
    int f = findGovNum(g);
    return (23966871.42)*(Math.random()*f+1);
  }   
}


  
  
