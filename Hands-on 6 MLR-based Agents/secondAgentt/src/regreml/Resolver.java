package regreml;

import java.text.DecimalFormat;

public class Resolver extends RegreLM{
    public Resolver(double rdet, double ryf0, double ryf1, double ryf2, double ryf3, double ryf4, double ryf5) {
        super(rdet, ryf0, ryf1, ryf2, ryf3, ryf4, ryf5);
    }

    public double[][] getM1() {
        return M1;
    }

    public double[] getY() {
        return Y;
    }

    public double[] getF1() {
        return F1;
    }

    public double[] getF2() {
        return F2;
    }

    public double[][] getInversa() {
        return inversa;
    }

    public double[] getBtas() {
        return btas;
    }

    public double[][] getTr() {
        return Tr;
    }

    public double[][] getR() {
        return R;
    }

    public double[] getRy() {
        return Ry;
    }

    public String[] getSig() {
        return sig;
    }

    public void cargar() {
        Tr = new double[3][17];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 17; j++) {
                Tr[i][j] = M1[j][i];
            }
            System.out.println(" ");
        }
    }
    public void Mostrar() {
        System.out.println("Matriz 1");
        for (int i = 0; i < 17; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(M1[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("La traspuesta de la matraz 1 es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(Tr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public void Multiplicacion() {
        System.out.println("La Multiplicacion de la matriz 1 y su transpuesta es: ");
        R = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                R[0][0] = (Tr[0][0] * M1[0][0]) + (Tr[0][1] * M1[1][0]) + (Tr[0][2] * M1[2][0] + (Tr[0][3]) * (M1[3][0]) + (Tr[0][4]) * (M1[4][0]) + (Tr[0][5]) * (M1[5][0]) + (Tr[0][6]) * (M1[6][0]) + (Tr[0][7]) * (M1[7][0]) + (Tr[0][8]) * (M1[8][0]) + (Tr[0][9]) * (M1[9][0]) + (Tr[0][10]) * (M1[10][0]) + (Tr[0][11]) * (M1[11][0]) + (Tr[0][12]) * (M1[12][0]) + (Tr[0][13]) * (M1[13][0]) + (Tr[0][14]) * (M1[14][0]) + (Tr[0][15]) * (M1[15][0]) + (Tr[0][16]) * (M1[16][0]));
                R[0][1] = (Tr[0][0] * M1[0][1]) + (Tr[0][1] * M1[1][1]) + (Tr[0][2] * M1[2][1] + (Tr[0][3]) * (M1[3][1]) + (Tr[0][4]) * (M1[4][1]) + (Tr[0][5]) * (M1[5][1]) + (Tr[0][6]) * (M1[6][1]) + (Tr[0][7]) * (M1[7][1]) + (Tr[0][8]) * (M1[8][1]) + (Tr[0][9]) * (M1[9][1]) + (Tr[0][10]) * (M1[10][1]) + (Tr[0][11]) * (M1[11][1]) + (Tr[0][12]) * (M1[12][1]) + (Tr[0][13]) * (M1[13][1]) + (Tr[0][14]) * (M1[14][1]) + (Tr[0][15]) * (M1[15][1]) + (Tr[0][16]) * (M1[16][1]));
                R[0][2] = (Tr[0][0] * M1[0][2]) + (Tr[0][1] * M1[1][2]) + (Tr[0][2] * M1[2][2] + (Tr[0][3]) * (M1[3][2]) + (Tr[0][4]) * (M1[4][2]) + (Tr[0][5]) * (M1[5][2]) + (Tr[0][6]) * (M1[6][2]) + (Tr[0][7]) * (M1[7][2]) + (Tr[0][8]) * (M1[8][2]) + (Tr[0][9]) * (M1[9][2]) + (Tr[0][10]) * (M1[10][2]) + (Tr[0][11]) * (M1[11][2]) + (Tr[0][12]) * (M1[12][2]) + (Tr[0][13]) * (M1[13][2]) + (Tr[0][14]) * (M1[14][2]) + (Tr[0][15]) * (M1[15][2]) + (Tr[0][16]) * (M1[16][2]));
                ;
                R[1][0] = (Tr[1][0] * M1[0][0]) + (Tr[1][1] * M1[1][0]) + (Tr[1][2] * M1[2][0] + (Tr[1][3]) * (M1[3][0]) + (Tr[1][4]) * (M1[4][0]) + (Tr[1][5]) * (M1[5][0]) + (Tr[1][6]) * (M1[6][0]) + (Tr[1][7]) * (M1[7][0]) + (Tr[1][8]) * (M1[8][0]) + (Tr[1][9]) * (M1[9][0]) + (Tr[1][10]) * (M1[10][0]) + (Tr[1][11]) * (M1[11][0]) + (Tr[1][12]) * (M1[12][0]) + (Tr[1][13]) * (M1[13][0]) + (Tr[1][14]) * (M1[14][0]) + (Tr[1][15]) * (M1[15][0]) + (Tr[1][16]) * (M1[16][0]));
                R[1][1] = (Tr[1][0] * M1[0][1]) + (Tr[1][1] * M1[1][1]) + (Tr[1][2] * M1[2][1] + (Tr[1][3]) * (M1[3][1]) + (Tr[1][4]) * (M1[4][1]) + (Tr[1][5]) * (M1[5][1]) + (Tr[1][6]) * (M1[6][1]) + (Tr[1][7]) * (M1[7][1]) + (Tr[1][8]) * (M1[8][1]) + (Tr[1][9]) * (M1[9][1]) + (Tr[1][10]) * (M1[10][1]) + (Tr[1][11]) * (M1[11][1]) + (Tr[1][12]) * (M1[12][1]) + (Tr[1][13]) * (M1[13][1]) + (Tr[1][14]) * (M1[14][1]) + (Tr[1][15]) * (M1[15][1]) + (Tr[1][16]) * (M1[16][1]));
                R[1][2] = (Tr[1][0] * M1[0][2]) + (Tr[1][1] * M1[1][2]) + (Tr[1][2] * M1[2][2] + (Tr[1][3]) * (M1[3][2]) + (Tr[1][4]) * (M1[4][2]) + (Tr[1][5]) * (M1[5][2]) + (Tr[1][6]) * (M1[6][2]) + (Tr[1][7]) * (M1[7][2]) + (Tr[1][8]) * (M1[8][2]) + (Tr[1][9]) * (M1[9][2]) + (Tr[1][10]) * (M1[10][2]) + (Tr[1][11]) * (M1[11][2]) + (Tr[1][12]) * (M1[12][2]) + (Tr[1][13]) * (M1[13][2]) + (Tr[1][14]) * (M1[14][2]) + (Tr[1][15]) * (M1[15][2]) + (Tr[1][16]) * (M1[16][2]));
                R[2][0] = (Tr[2][0] * M1[0][0]) + (Tr[2][1] * M1[1][0]) + (Tr[2][2] * M1[2][0] + (Tr[2][3]) * (M1[3][0]) + (Tr[2][4]) * (M1[4][0]) + (Tr[2][5]) * (M1[5][0]) + (Tr[2][6]) * (M1[6][0]) + (Tr[2][7]) * (M1[7][0]) + (Tr[2][8]) * (M1[8][0]) + (Tr[2][9]) * (M1[9][0]) + (Tr[2][10]) * (M1[10][0]) + (Tr[2][11]) * (M1[11][0]) + (Tr[2][12]) * (M1[12][0]) + (Tr[2][13]) * (M1[13][0]) + (Tr[2][14]) * (M1[14][0]) + (Tr[2][15]) * (M1[15][0]) + (Tr[2][16]) * (M1[16][0]));
                R[2][1] = (Tr[2][0] * M1[0][1]) + (Tr[2][1] * M1[1][1]) + (Tr[2][2] * M1[2][1] + (Tr[2][3]) * (M1[3][1]) + (Tr[2][4]) * (M1[4][1]) + (Tr[2][5]) * (M1[5][1]) + (Tr[2][6]) * (M1[6][1]) + (Tr[2][7]) * (M1[7][1]) + (Tr[2][8]) * (M1[8][1]) + (Tr[2][9]) * (M1[9][1]) + (Tr[2][10]) * (M1[10][1]) + (Tr[2][11]) * (M1[11][1]) + (Tr[2][12]) * (M1[12][1]) + (Tr[2][13]) * (M1[13][1]) + (Tr[2][14]) * (M1[14][1]) + (Tr[2][15]) * (M1[15][1]) + (Tr[2][16]) * (M1[16][1]));
                R[2][2] = (Tr[2][0] * M1[0][2]) + (Tr[2][1] * M1[1][2]) + (Tr[2][2] * M1[2][2] + (Tr[2][3]) * (M1[3][2]) + (Tr[2][4]) * (M1[4][2]) + (Tr[2][5]) * (M1[5][2]) + (Tr[2][6]) * (M1[6][2]) + (Tr[2][7]) * (M1[7][2]) + (Tr[2][8]) * (M1[8][2]) + (Tr[2][9]) * (M1[9][2]) + (Tr[2][10]) * (M1[10][2]) + (Tr[2][11]) * (M1[11][2]) + (Tr[2][12]) * (M1[12][2]) + (Tr[2][13]) * (M1[13][2]) + (Tr[2][14]) * (M1[14][2]) + (Tr[2][15]) * (M1[15][2]) + (Tr[2][16]) * (M1[16][2]));
                DecimalFormat df = new DecimalFormat("###.##");
                System.out.print(" " + df.format(R[i][j]));
            }
            System.out.println(" ");
        }
    }

    public void Multiplicacion2() {
        System.out.println("La multiplicacion de la matriz Transpuesta de X por Y");
        Ry = new double[3];
        for (int i = 0; i < 3; i++) {
            Ry[0] = (Tr[0][0] * Y[0]) + (Tr[0][1] * Y[1]) + (Tr[0][2] * Y[2]) + (Tr[0][3] * Y[3]) + (Tr[0][4] * Y[4]) + (Tr[0][5] * Y[5]) + (Tr[0][6] * Y[6]) + (Tr[0][7] * Y[7]) + (Tr[0][8] * Y[8]) + (Tr[0][9] * Y[9]) + (Tr[0][10] * Y[10]) + (Tr[0][11] * Y[11]) + (Tr[0][12] * Y[12]) + (Tr[0][13] * Y[13]) + (Tr[0][14] * Y[14]) + (Tr[0][15] * Y[15]) + (Tr[0][16] * Y[16]);
            Ry[1] = (Y[0] * Tr[1][0]) + (Y[1] * Tr[1][1]) + (Y[2] * Tr[1][2]) + (Y[3] * Tr[1][3]) + (Y[4] * Tr[1][4]) + (Y[5] * Tr[1][5]) + (Y[6] * Tr[1][6]) + (Y[7] * Tr[1][7]) + (Y[8] * Tr[1][8]) + (Y[9] * Tr[1][9]) + (Y[10] * Tr[1][10]) + (Y[11] * Tr[1][11]) + (Y[12] * Tr[1][12]) + (Y[13] * Tr[1][13]) + (Y[14] * Tr[1][14]) + (Y[15] * Tr[1][15]) + (Y[16] * Tr[1][16]);
            Ry[2] = (Y[0] * Tr[2][0]) + (Y[1] * Tr[2][1]) + (Y[2] * Tr[2][2]) + (Y[3] * Tr[2][3]) + (Y[4] * Tr[2][4]) + (Y[5] * Tr[2][5]) + (Y[6] * Tr[2][6]) + (Y[7] * Tr[2][7]) + (Y[8] * Tr[2][8]) + (Y[9] * Tr[2][9]) + (Y[10] * Tr[2][10]) + (Y[11] * Tr[2][11]) + (Y[12] * Tr[2][12]) + (Y[13] * Tr[2][13]) + (Y[14] * Tr[2][14]) + (Y[15] * Tr[2][15]) + (Y[16] * Tr[2][16]);

            DecimalFormat df = new DecimalFormat("###.##");
            System.out.println(" " + df.format(Ry[i]));
        }
    }

    public void Inversa() {
        System.out.println("inversa de la matriz transpuesta de x por x");
        DecimalFormat df = new DecimalFormat(".####");
        rdet = (R[0][0] * R[1][1] * R[2][2]) + (R[0][1] * R[1][2] * R[2][0]) + (R[0][2] * R[1][0] * R[2][1]);
        rdet += ((R[0][2] * R[1][1] * R[2][0] * -1) - (R[0][0] * R[1][2] * R[2][1]) - (R[0][1] * R[1][0] * R[2][2]));
        System.out.println(" " + df.format(rdet));

        System.out.println("Calculando cofactores y obteniendo la inversa: ");
        inversa = new double[3][3];
        inversa[0][0] = ((R[1][1] * R[2][2]) - (R[2][1] * R[1][2]));
        inversa[1][0] = ((R[0][1] * R[2][2]) - (R[2][0] * R[1][2]));
        inversa[2][0] = ((R[1][0] * R[2][1]) - (R[2][0] * R[1][1]));
        inversa[0][1] = ((R[0][1] * R[2][2]) - (R[2][1] * R[0][2]));
        inversa[1][1] = ((R[0][0] * R[2][2]) - (R[2][0] * R[0][2]));
        inversa[2][1] = ((R[0][0] * R[2][1]) - (R[2][0] * R[0][1]));
        inversa[0][2] = ((R[0][1] * R[1][2]) - (R[1][1] * R[0][2]));
        inversa[1][2] = ((R[0][0] * R[1][2]) - (R[1][0] * R[0][2]));
        inversa[2][2] = ((R[0][0] * R[1][1]) - (R[1][0] * R[0][1]));

        inversa[0][1] *= -1;
        inversa[1][0] *= -1;
        inversa[1][2] *= -1;
        inversa[2][1] *= -1;

        inversa[0][0] = inversa[0][0] / rdet;
        inversa[1][0] = inversa[1][0] / rdet;
        inversa[2][0] = inversa[2][0] / rdet;
        inversa[0][1] = inversa[0][1] / rdet;
        inversa[1][1] = inversa[1][1] / rdet;
        inversa[2][1] = inversa[2][1] / rdet;
        inversa[0][2] = inversa[0][2] / rdet;
        inversa[1][2] = inversa[1][2] / rdet;
        inversa[2][2] = inversa[2][2] / rdet;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(df.format(inversa[i][j]) + " ");
            }
            System.out.println(" ");
        }
    }

    public void Betas() {
        btas = new double[3];
        DecimalFormat df = new DecimalFormat("###.##");
        for (int i = 0; i < 3; i++) {
            btas[0] += (Ry[i] * inversa[0][i]);
            btas[1] += (Ry[i] * inversa[1][i]);
            btas[2] += (Ry[i] * inversa[2][i]);

        }
        System.out.println("Resultado de betas");
        for (int i = 0; i < 3; i++) {
            System.out.println(df.format(btas[i]));
        }
    }

    public void YFactores() {
        System.out.println("Pronosticar los respectivos Yields dado los siguientes pares factor");
        System.out.println("  Factor 1" + "| Factor 2");
        DecimalFormat df = new DecimalFormat(".###");
        for (int i = 0; i < 6; i++) {
            System.out.print(sig[i]);
            System.out.print("  " + F1[i] + "  |  ");
            System.out.println(F2[i]);
        }
        for (int i = 0; i < 6; i++) {
            ryf0 = btas[0] + btas[1] * F1[0] + btas[2] * F2[0];
            ryf1 = btas[0] + btas[1] * F1[1] + btas[2] * F2[1];
            ryf2 = btas[0] + btas[1] * F1[2] + btas[2] * F2[2];
            ryf3 = btas[0] + btas[1] * F1[3] + btas[2] * F2[3];
            ryf4 = btas[0] + btas[1] * F1[4] + btas[2] * F2[4];
            ryf5 = btas[0] + btas[1] * F1[5] + btas[2] * F2[5];
        }
        System.out.println(" ");
        System.out.println("a) " + df.format(ryf0));
        System.out.println("b) " + df.format(ryf1));
        System.out.println("c) " + df.format(ryf2));
        System.out.println("d) " + df.format(ryf3));
        System.out.println("e) " + df.format(ryf4));
        System.out.println("f) " + df.format(ryf5));
    }
}
