package regreml;

public abstract class RegreLM{
    protected double[][] M1 = {{1, 41.9, 29.1}, {1, 43.4, 29.3}, {1, 43.9, 29.5}, {1, 44.5, 29.7}, {1, 47.3, 29.9}, {1, 47.5, 30.3,}, {1, 47.9, 30.5}, {1, 50.2, 30.7}, {1, 52.8, 30.8}, {1, 53.2, 30.9}, {1, 56.7, 31.5}, {1, 57, 31.7}, {1, 63.5, 31.9}, {1, 65.3, 32}, {1, 71.1, 32.1}, {1, 77, 32.5}, {1, 77.8, 32.9}};
    protected double[] Y = {251.3, 251.3, 248.3, 267.5, 273.0, 276.5, 270.3, 274.9, 285.0, 290.0, 297.0, 302.5, 304.5, 309.3, 321.7, 330.7, 349.0};
    protected double[] F1 = {81.5, 81.4, 82.2, 42.9, 44.4, 64.2};
    protected double[] F2 = {33.2, 34.3, 35.2, 28.9, 31.3, 31.4};
    protected String[] sig = {"a)", "b)", "c)", "d)", "e)", "f)"};
    protected double[][] inversa;
    protected double[] btas;
    protected double[][] Tr;
    protected double[][] R;
    protected double[] Ry;
    protected double rdet;
    protected double ryf0, ryf1, ryf2, ryf3, ryf4, ryf5;

    public RegreLM(double rdet, double ryf0, double ryf1, double ryf2, double ryf3, double ryf4, double ryf5){
        this.rdet=rdet;
        this.ryf0=ryf0;
        this.ryf1=ryf1;
        this.ryf2=ryf2;
        this.ryf3=ryf3;
        this.ryf4=ryf4;
        this.ryf5=ryf5;
    }
    public abstract  double [][] getM1();

    public abstract  double [] getY();

    public abstract double [] getF1();

    public abstract double [] getF2();

    public abstract double [][] getInversa();

    public abstract double [] getBtas();

    public abstract double [][] getTr();

    public abstract double [][] getR();

    public abstract double [] getRy();

    public abstract void cargar();

    public abstract void Mostrar();

    public abstract String [] getSig();

}
