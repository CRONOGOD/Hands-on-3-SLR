package Principal;
import java.util.Arrays;

public class detB extends Sistemaa{

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
        System.out.println("\n"+Arrays.deepToString(detB));
        System.out.println("Determinante de b: "+rdet3);
    }
}
