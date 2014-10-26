
/**
 * Calculate tonnes cane crushed.
 */
public class CaneCrush {

    private double imbPercentage,imbibitionFactor, fiberFactor, mixJuiceScale, imbibitionUnits;
    private double tonnesCane,tonnesBaggase,tonnesPolInMJ,tonnesPolInBaggase;
    private int mixJuiceTips;

    public void setImbibitionFactor(double imbibitionFactor) {
        this.imbibitionFactor = imbibitionFactor;
    }

    public void setFiberFactor(double fiberFactor) {
        this.fiberFactor = fiberFactor;
    }

    public void setMixJuiceScale(double mixJuiceScale) {
        this.mixJuiceScale = mixJuiceScale;
    }
     public void setTonnesBaggase(double tonnesBaggase) {
        this.tonnesBaggase = tonnesBaggase;
    }

    public void setTonnesPolInMJ(double tonnesPolInMJ) {
        this.tonnesPolInMJ = tonnesPolInMJ;
    }

    public void setTonnesPolInBaggase(double tonnesPolInBaggase) {
        this.tonnesPolInBaggase = tonnesPolInBaggase;
    }

    double getTonnesCane(int mixJuiceTips,double imbibitionUnits) {
        this.mixJuiceTips=mixJuiceTips;
        this.imbibitionUnits=imbibitionUnits;
        tonnesCane = (mixJuiceTips * mixJuiceScale - imbibitionUnits * imbibitionFactor) * fiberFactor;
        return tonnesCane;
    }
    
    
    double getImbibitionPercentage(int mixJuiceTips,double imbibitionUnits){
        
        imbPercentage=(imbibitionUnits*imbibitionFactor)*fiberFactor;
        
        return imbPercentage;
        
}
    double getExtraction(){
    
    return (tonnesPolInMJ/(tonnesPolInMJ+tonnesPolInBaggase));
    
    }
    
    double getFiberPercentageCane(){
    
    return (tonnesBaggase/tonnesCane);
    }

   

}
