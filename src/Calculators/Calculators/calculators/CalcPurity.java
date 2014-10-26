
/**
 * calculate purity
 */
public class CalcPurity {

    double getPurity(double brix, double pol) {

        return ((brix / pol) * 100);
    }

}
/*calculate rendament*/
class CalcRendament {

    private double rendament;

    double getRendament(double purity, double pol) {
        rendament = (purity - 6.4) * 0.78 * (pol - 2);

        return rendament;
    }

}
/* calculate grade*/
class grade {

    private double a, b, c, d, e;
     private char grade;

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public char getGrade(double rendment) {
       
        if (rendment > a) {
            grade = 'A';
        } else if (rendment > b) {
            grade = 'B';
        } else if (rendment > c) {
            grade = 'C';
        } else if (rendment > d) {
            grade = 'D';
        } else if (rendment > e) {
            grade = 'E';
        } else {
            grade = '-';
        }
        return grade;

    }
}
