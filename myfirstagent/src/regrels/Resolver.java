package regrels;

public class Resolver extends Regre {
    public Resolver(int n, double sax, double say, double sx2, double sxy, double beta0, double beta1) {
        super(n, sax, say, sx2, sxy, beta0, beta1);
    }

    public double[] getX() {
        return x;
    }
    public double[] getY() {
        return y;
    }
    public double[] getRx() {
        return rx;
    }
    public double[] getRy() {
        return ry;
    }
    public double[] getXc() {
        return xc;
    }
    public double[] getXy() {
        return xy;
    }

    public void mostrarMatrices(){
        System.out.println("|  x"+ "  |    Y    |");
        for (int i = 0; i < n; i++) {
            System.out.println("|"+x[i] + " | " + y[i]+"\t|");
        }
    }
    public void Sax(){
        System.out.println("\nSumatorias de X y Y");
        for (int i = 0; i < n; i++) {
            sax = x[i] + sax;
        }
        System.out.println("La sumatoria de X es: " + sax);
    }
    public void say(){
        for(int i=0; i<n; i++){
            say = y[i] + say;
        }
        System.out.println("La sumatoria de Y es: "+ say);
    }
    public void cuadradosysuma(){
        for (int i = 0; i < n; i++) {
            xc[i] = x[i] * x[i];
            xy[i] = x[i] * y[i];
        }
        for (int i = 0; i < n; i++) {
            sx2 = sx2 + xc[i];
            sxy = sxy + xy[i];
        }
        System.out.println("\nLa suma de los cuadrados de x es= " + sx2);
        System.out.println("La suma de x*y= " + sxy);
    }
    public void beta0(){
        System.out.println("\nResultado de Beta0 y Beta1: ");
        beta0 = (((say * sx2) - (sax * sxy)) / ((n * sx2) - (sax * sax)));
        System.out.println("Beta0= " + beta0);
    }
    public void beta1(){
        beta1 = (((n * sxy) - (sax * say)) / ((n * sx2) - (sax * sax)));
        System.out.println("Beta1= " + beta1);
    }
    public void y() {
        System.out.println("\nCalculo de y respecto a x: ");
        for (int i = 0; i < 3; i++) {
            ry[i] = rx[i] * beta1 + beta0;
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("x = " + rx[i] + " y = " + ry[i]);
        }
    }
}