import java.io.IOException;

public class AntiOO {
     
   public static char betuzes(double pi)
     {
        int kovetkezojegy = (int) (pi*16); // A következő jegy a pi 16-szorosának egész része
        char betu = 0;
              
            if(kovetkezojegy>=0 && kovetkezojegy<=9 )     //16-os számrendszerben a számok 0-9ig ugyanazok,
                betu = (char) (kovetkezojegy + '0');      // ezekkel nem kell sokat foglalkozni     
              
            else{
              switch (kovetkezojegy) {        //10-15 ig A-F ig betük helyettesítik a számokat
                case 10:  betu = 'A';         
                     break;
                case 11:  betu = 'B';
                     break;
                case 12:  betu = 'C';
                     break;
                case 13:  betu = 'D';
                     break;
                case 14:  betu = 'E';
                     break;
                case 15:  betu = 'F';
                     break;
                    }
                }
        return betu;
     }        
     
    public static double hexalas(double pi)
    {
            pi=(pi*16) - (int) (pi*16);         //erre azért van szükség hogy ujr egy 0-1 közötti számot kapjunk,
        return pi;                              // egyre kevesebb tizedes jegyünk lesz 
    }  
    
    public static double kerekites(double Si)    
    {
        Si=Si-Math.round(Si);                   //csak egy szimpla kerekítés, round fgv. lefelé kerekít(nekünk ez tökéletes)
        return Si;
    }
            
    public static double modulo(double n,double k)
    {
        double r=1;
        int b=16,t=1;
           
        while(t<=n)
            t=t*2;
           
        t/=2;
        
        while(true)
        {
          if(n>=t)
            {
              r=b*r%k;
              n=n-t;
            }
           t/=2;
           if(t>=1) 
           {
              r=Math.pow(r,2)%k;     
            }
            else
              break;
         }
        return r;
    }
    public static void main(String[] args) throws IOException {
        long[] d2={1000000,10000000,100000000};
       //double S1 = 0,S4 = 0,S5 = 0,S6 = 0, pi=0;
        for(int i=0;i<3;i++){  
            double S1 = 0,S4 = 0,S5 = 0,S6 = 0, pi=0;
            long d=d2[i];
            //System.out.print(d+"\n");
            String pijegyek = new String();
            double startTime = System.nanoTime();
          for (int k = 0; k <= d; k++) 
            {
                   
           S1+=(modulo(d-k,8*k+1))/(8*k+1);
            S4+=(modulo(d-k,8*k+4))/(8*k+4);
             S5+=(modulo(d-k,8*k+5))/(8*k+5);
              S6+=(modulo(d-k,8*k+6))/(8*k+6);
            }
                
               
        S1=kerekites(S1);
        S4=kerekites(S4);
        S5=kerekites(S5);
        S6=kerekites(S6);
           
        pi=4*S1-2*S4-S5-S6;
        if(pi<0)
            pi+=1;
        while(pi>0)
        {
           pijegyek+=betuzes(pi);
           pi=hexalas(pi);
        }
           
        System.out.print(pijegyek+"\n");
    
        double endTime=System.nanoTime();
        double duration = (endTime - startTime)/1000000000;
        System.out.println("duration:"+ duration + "sec");
        
            }
    }
    
}
