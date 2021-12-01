package Principal;
import java.lang.Math;
import static java.lang.Math.pow;
import java.util.Arrays;

public class Rabc extends Sistemaa{

    public double ra;
    public double rb;
    public double rc;
    public double sse;
    public double sst;
    public double mediay;
    public double r2;
    public double getMediay() {
        return mediay;
    }

    public void setMediay(double mediay) {
        this.mediay = mediay;
    }

    public double getSst() {
        return sst;
    }

    public void setSst(double sst) {
        this.sst = sst;
    }

    public double getRa(double pow) {
        return ra;
    }

    public void setRa(double ra) {
        this.ra = ra;
    }

    public double getRb(double x) {
        return rb;
    }

    public void setRb(double rb) {
        this.rb = rb;
    }

    public double getRc() {
        return rc;
    }

    public void setRc(double rc) {
        this.rc = rc;
    }

    public double[][] RdetS = new double[3][5];
    public double rdet1;

    public double getRdet1(double rdet1) {
        return this.rdet1;
    }

    public double setRdet1(double rdet1) {
        this.rdet1 = rdet1;
        return rdet1;
    }

    public double[][] getRdetS() {
        return RdetS;
    }

    public void setRdetS(double rdetS) {
        this.RdetS=RdetS;
    }

    public double[][] detA = new double[3][5];
    public double rdet2;

    public double[][] getDetA() {
        return detA;
    }

    public void setDetA(double[][] detA) {
        this.detA = detA;
    }

    public double getRdet2() {
        return rdet2;
    }

    public void setRdet2(double rdet2) {
        this.rdet2 = rdet2;
    }

    public double[][] detB = new double[3][5];
    public double rdet3;

    public double[][] getDetB() {
        return detB;
    }

    public void setDetB(double[][] detB) {
        this.detB = detB;
    }

    public double getRdet3() {
        return rdet3;
    }

    public void setRdet3(double rdet3) {
        this.rdet3 = rdet3;
    }

    public double[][] detC = new double[3][5];
    public double rdet4;

    public double[][] getDetC() {
        return detC;
    }

    public void setDetC(double[][] detC) {
        this.detC = detC;
    }

    public double getRdet4() {
        return rdet4;
    }

    public void setRdet4(double rdet4) {
        this.rdet4 = rdet4;
    }

    @Override
    public void Sistema() {
        Arrays.toString(getXy());
        Arrays.toString(getX2());
        Arrays.toString(getX3());
        Arrays.toString(getX4());
        Arrays.toString(getX2xy());

        getSx();
        getSy();
        getSxy();
        getSx2();
        getSx3();
        getSx4();
        getSx2y();

        RdetS[0][0] = (sx4);
        RdetS[0][1] = (sx3);
        RdetS[0][2] = (sx2);
        RdetS[0][3] = (sx4);
        RdetS[0][4] = (sx3);

        RdetS[1][0] = (sx3);
        RdetS[1][1] = (sx2);
        RdetS[1][2] = (sx);
        RdetS[1][3] = (sx3);
        RdetS[1][4] = (sx2);

        RdetS[2][0] = (sx2);
        RdetS[2][1] = (sx);
        RdetS[2][2] = (n);
        RdetS[2][3] = (sx2);
        RdetS[2][4] = (sx);
        rdet1 = (RdetS[0][0] * RdetS[1][1] * RdetS[2][2]) + (RdetS[0][1] * RdetS[1][2] * RdetS[2][3]) + (RdetS[0][2] * RdetS[1][3] * RdetS[2][4]) - (RdetS[2][0] * RdetS[1][1] * RdetS[0][2]) - (RdetS[2][1] * RdetS[1][2] * RdetS[0][3])-(RdetS[2][2] * RdetS[1][3] * RdetS[0][4]);

        detA[0][0] = (sx2y);
        detA[0][1] = (sx3);
        detA[0][2] = (sx2);
        detA[0][3] = (sx2y);
        detA[0][4] = (sx3);

        detA[1][0] = (sxy);
        detA[1][1] = (sx2);
        detA[1][2] = (sx);
        detA[1][3] = (sxy);
        detA[1][4] = (sx2);

        detA[2][0] = (sy);
        detA[2][1] = (sx);
        detA[2][2] = (n);
        detA[2][3] = (sy);
        detA[2][4] = (sx);
        rdet2 = (detA[0][0] * detA[1][1] * detA[2][2]) + (detA[0][1] * detA[1][2] * detA[2][3]) + (detA[0][2] * detA[1][3] * detA[2][4]) - (detA[2][0] * detA[1][1] * detA[0][2]) - (detA[2][1] * detA[1][2] * detA[0][3])-(detA[2][2] * detA[1][3] * detA[0][4]);

        detB[0][0] = (sx4);
        detB[0][1] = (sx2y);
        detB[0][2] = (sx2);
        detB[0][3] = (sx4);
        detB[0][4] = (sx2y);

        detB[1][0] = (sx3);
        detB[1][1] = (sxy);
        detB[1][2] = (sx);
        detB[1][3] = (sx3);
        detB[1][4] = (sxy);

        detB[2][0] = (sx2);
        detB[2][1] = (sy);
        detB[2][2] = (n);
        detB[2][3] = (sx2);
        detB[2][4] = (sy);

        rdet3 = (detB[0][0] * detB[1][1] * detB[2][2]) + (detB[0][1] * detB[1][2] * detB[2][3]) + (detB[0][2] * detB[1][3] * detB[2][4]) - (detB[2][0] * detB[1][1] * detB[0][2]) - (detB[2][1] * detB[1][2] * detB[0][3])-(detB[2][2] * detB[1][3] * detB[0][4]);

        detC[0][0] = (sx4);
        detC[0][1] = (sx3);
        detC[0][2] = (sx2y);
        detC[0][3] = (sx4);
        detC[0][4] = (sx3);

        detC[1][0] = (sx3);
        detC[1][1] = (sx2);
        detC[1][2] = (sxy);
        detC[1][3] = (sx3);
        detC[1][4] = (sx2);

        detC[2][0] = (sx2);
        detC[2][1] = (sx);
        detC[2][2] = (sy);
        detC[2][3] = (sx2);
        detC[2][4] = (sx);
        rdet4 = (detC[0][0] * detC[1][1] * detC[2][2]) + (detC[0][1] * detC[1][2] * detC[2][3]) + (detC[0][2] * detC[1][3] * detC[2][4]) - (detC[2][0] * detC[1][1] * detC[0][2]) - (detC[2][1] * detC[1][2] * detC[0][3])-(detC[2][2] * detC[1][3] * detC[0][4]);


        System.out.println("\nResultados de a,b, c");
        ra = (rdet2/rdet1);
        System.out.println("B0= "+ra);
        rb = (rdet3/rdet1);
        System.out.println("B1= "+rb);
        rc = (rdet4/rdet1);
        System.out.println("B2= "+rc);

        for(int i = 0; i<n; i++) {
            sse += pow(Y[i]-(ra*(Math.pow(X[i], 2)))-(rb*X[i])-rc,2);
        }
        for(int c=0; c<n; c++){
            mediay = mediay + Y[c];
        }
        mediay = mediay / n;

        for(int i=0; i<n; i++){
            sst += Math.pow(Y[i] - mediay,2);
        }

        r2 = 1 - (sse/sst);

        System.out.println("\nModelo cuadrático: ");
        System.out.println("R2 = "+r2);
    }
}

