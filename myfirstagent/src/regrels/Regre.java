package regrels;

public abstract class Regre {
    protected int n = 9;
    protected double[] x = new double [] {23, 26, 30, 34, 43, 48, 52, 57, 58};
    protected double[] y = new double[]{651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    protected double rx[] = {62, 72, 82};
    protected double ry[] = new double[3];
    protected double[] xc = new double[n];
    protected double[] xy = new double[n];
    protected double sax;
    protected double say;
    protected double sx2;
    protected double sxy;
    protected double beta0;
    protected double beta1;

    public Regre(int n, double sax, double say, double sx2, double sxy, double beta0, double beta1) {
        this.n = n;
        this.sax = sax;
        this.say = say;
        this.sx2 = sx2;
        this.sxy = sxy;
        this.beta0 = beta0;
        this.beta1 = beta1;
    }
    public abstract double[] getX();

    public abstract double[] getY();

    public abstract double[] getRx();

    public abstract double[] getRy();

    public abstract double[] getXc();

    public abstract double[] getXy();

    public abstract void mostrarMatrices();

    public abstract void Sax();

    public abstract void say();

    public abstract void cuadradosysuma();

    public abstract void beta0();

    public abstract void beta1();

    public abstract void y();

}