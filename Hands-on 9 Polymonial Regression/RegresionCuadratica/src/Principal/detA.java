package Principal;
import java.util.Arrays;
public class detA extends Sistemaa{

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
        System.out.println("\n"+Arrays.deepToString(detA));
        System.out.println("Determinante de a: "+rdet2);


    }
}
