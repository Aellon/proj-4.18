package Calculators;



/**
 *
 * @author Randika
 */
public class AlcalinityCalulator {
    double alkalinity;
	double volume=100;
    
   public double getAlkalinity(double reading){
                  
               
               alkalinity=((1000/volume)*reading);
               
               return alkalinity;
    }
    
    
}
