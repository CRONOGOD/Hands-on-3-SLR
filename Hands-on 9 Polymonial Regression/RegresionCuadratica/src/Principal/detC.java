package Principal;
import java.util.Arrays;

public class detC extends  Sistemaa{


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
        System.out.println("\n"+Arrays.deepToString(detC));
        System.out.println("Determinante de c: "+rdet4);
    }
}
