
public class CaneJuiceSample extends Sample{
   
    private SampleEntity firstExpressedJuice;
    private SampleEntity lastExpressedJuice;
    private SampleEntity mixedJuice;
    private SampleEntity clarifiedJuice;
    private SampleEntity syrup;
    private SampleEntity filtrate;

    public CaneJuiceSample(SampleEntity firstExpressedJuice, SampleEntity lastExpressedJuice, SampleEntity mixedJuice, SampleEntity clarifiedJuice, SampleEntity syrup, SampleEntity filtrate) {
        this.firstExpressedJuice = firstExpressedJuice;
        this.lastExpressedJuice = lastExpressedJuice;
        this.mixedJuice = mixedJuice;
        this.clarifiedJuice = clarifiedJuice;
        this.syrup = syrup;
        this.filtrate = filtrate;
    }
    
    

    public SampleEntity getFirstExpressedJuice() {
        return firstExpressedJuice;
    }

    public SampleEntity getLastExpressedJuice() {
        return lastExpressedJuice;
    }

    public SampleEntity getMixedJuice() {
        return mixedJuice;
    }

    public SampleEntity getClarifiedJuice() {
        return clarifiedJuice;
    }

    public SampleEntity getSyrup() {
        return syrup;
    }

    public SampleEntity getFiltrate() {
        return filtrate;
    }
    
    
    
    
    
    
    
    
}
