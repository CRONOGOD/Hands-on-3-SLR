package Gradient;
public abstract class Regre1 {
    int n = 9;
    double[] x = {23, 26, 30, 34, 43, 48, 52, 57, 58};
    double[] y = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};
    double[] xc = new double[n];
    double[] xy = new double[n];
    double sax;
    double say;
    double sx2;
    double sxy;
    double beta0;
    double beta1;
    double f1, f2, sf1, sf2;
    double er2;
    double ser2;
    double a;
    double nbt0, nbt1;


    public Regre1(int n, double sax, double say, double sx2, double sxy, double f1, double er2, double ser2, double nbt0, double nbt1, double a, double beta0, double beta1, double f2, double sf1, double sf2){
        this.n = n;
        this.sax = sax;
        this.say = say;
        this.sx2 = sx2;
        this.f1 = f1;
        this.f2 = f2;
        this.sf1 = sf1;
        this.sf2 = sf2;
        this.er2 = er2;
        this.ser2 = ser2;
        this.nbt0 = nbt0;
        this.nbt1 = nbt1;
        this.a = a;
        this.sxy = sxy;
        this.beta0 = beta0;
        this.beta1 = beta1;

    }
    public abstract double[] getX();

    public abstract double[] getY();

    public abstract double[] getXc();

    public abstract double[] getXy();

    public abstract void mostrarMatrices();

    public abstract void Sax();

    public abstract void say();

    public abstract void cuadradosysuma();

    public abstract void beta0();

    public abstract void beta1();

    public abstract void step2p1();

    public abstract void step2P2();

    public abstract void sumatoriasStep2();

    public abstract void step3();

    public abstract void NewBetas();
}
