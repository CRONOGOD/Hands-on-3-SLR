package Principal;
import java.util.Arrays;

public class detSistema extends Sistemaa{

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
    @Override
    public void Sistema() {
        System.out.println("  X" + "  | Y");
        for(int i = 0; i <n; i++) {
            System.out.print("["+X[i]+"]");
            System.out.println("["+Y[i]+"]");
        }

        System.out.println("X*Y");
        System.out.println(Arrays.toString(getXy()));
        System.out.println("X2");
        System.out.println(Arrays.toString(getX2()));
        System.out.println("X3");
        System.out.println(Arrays.toString(getX3()));
        System.out.println("X4");
        System.out.println(Arrays.toString(getX4()));
        System.out.println("(X2)*Y");
        System.out.println(Arrays.toString(getX2xy()));

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
        System.out.println("\n"+Arrays.deepToString(RdetS));
        System.out.println("Determinante del sistema: "+rdet1);
    }
}
