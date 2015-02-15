public class RandomWorld{
  public double makeWealth(String g, int s){
     findGovNum(g);
    int seed = 0;
    seed = (int)(Math.random())*(s*(int)(Math.random()*2));
    double mean = 363448.69;
    if(seed > 10){
     return mean - (Math.random() * (5201.27*g)); 
    }
    else if(seed < 10){
     return mean + (Math.random() * (187807.33*g)); 
    }
  return 0;  
  }
  public int findGovNum(int g){
   return 0; 
  }
  public int makePop(int g, int s){
   findGovNum(g);
   int max = 1368200000;
   int min = 56;
   int mean = 295344439;
   seed = (int)(Math.random())*(s*(int)(Math.random()*2));
     if(seed > 10){
     return mean - (Math.random() * ((mean-min(/7))(*g))); 
    }
    else if(seed < 10){
     return mean + (Math.random() * ((max-mean(/7))(*g))); 
    }
  return 0;
  }
}


  
  
