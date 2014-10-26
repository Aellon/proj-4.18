/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thilini
 */
public class SampleEntity {
    
    private float brix;
    private float pol;
    private float purity;
    private float pH;
    

    public SampleEntity(float brix, float pol) {
        this.brix = brix;
        this.pol = pol;
    }
    
    

    public float getBrix() {
        return brix;
    }

    public void setBrix(float brix) {
        this.brix = brix;
    }

    public float getPol() {
        return pol;
    }

    public void setPol(float pol) {
        this.pol = pol;
    }

    public float getPurity() {
        return purity;
    }

    public void setPurity(float purity) {
        this.purity = purity;
    }

    public float getpH() {
        return pH;
    }

    public void setpH(float pH) {
        this.pH = pH;
    }

    
    
    
    
    
    
}
