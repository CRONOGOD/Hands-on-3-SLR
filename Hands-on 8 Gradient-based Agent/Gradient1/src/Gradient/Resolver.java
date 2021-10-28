package Gradient;
import java.text.DecimalFormat;

public class Resolver extends Regre1 {

    public Resolver(int n, double sax, double say, double sx2, double sxy, double f1, double er2, double ser2, double nbt0, double nbt1, double a, double beta0, double beta1, double f2, double sf1, double sf2) {
        super(n, sax, say, sx2, sxy, f1, er2, ser2, nbt0, nbt1, a, beta0, beta1, f2, sf1, sf2);
    }

    public double[] getX() {
        return x;
    }

    public double[] getY() {
        return y;
    }

    public double[] getXc() {
        return xc;
    }

    public double[] getXy() {
        return xy;
    }
    public void mostrarMatrices(){
        System.out.println("|  x"+ "  |  Y  |");
        for (int i = 0; i < n; i++) {
            System.out.println("|"+x[i] + " | " + y[i]+"|");
        }
    }
    public void Sax(){
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
        System.out.println("La suma de los cuadrados de x es= " + sx2);
        System.out.println("La suma de x*y= " + sxy);
    }
    public void beta0(){
        beta0 = (((say * sx2) - (sax * sxy)) / ((n * sx2) - (sax * sax)));
        System.out.println("Beta0= " + beta0);
    }
    public void beta1(){
        beta1 = (((n * sxy) - (sax * say)) / ((n * sx2) - (sax * sax)));
        System.out.println("Beta1= " + beta1);
    }
    public void step2p1(){
        DecimalFormat df = new DecimalFormat("###.########");
        System.out.println("Formula 1");
        for (int i = 0; i < n; i++) {

            f1=(y[i]-(beta0+beta1*x[i]));
            System.out.println("|"+ df.format(f1)+"\t|");
        }
    }
    public void step2P2(){
        System.out.println(" ");
        System.out.println("Formula 2");
        for (int i = 0; i < n; i++) {
            f2 = (x[0] * (y[i] - (beta0 + beta1 * x[i])));
            System.out.println(f2);
        }
    }
    public void sumatoriasStep2(){
        for (int i = 0; i < n; i++) {
            sf1+=(y[i]-(beta0+beta1*x[i]));
            sf2+=(x[0]*(y[i]-(beta0+beta1*x[i])));
        }
        System.out.println("\nLa suma de la formula 1 es:");
        System.out.println(sf1);

        System.out.println("La suma de la formula 2 es:");
        System.out.println(sf2);
    }
    public void step3(){
        System.out.println("Calcular el error");
        for (int i = 0; i < n; i++) {
            er2=Math.pow((y[i]-(beta0+(beta1*x[i]))),2);
            System.out.println(er2);

            ser2+=Math.pow((y[i]-(beta0+(beta1*x[i]))),2);
        }
        System.out.println("La sumatoria de la formula de error es: ");
        System.out.println(ser2);
    }
    public void NewBetas(){
        for (int i =0; i<n; i++){
            nbt0=beta0-a*(0/-1);
            nbt1=beta1-a*(0/-(23*x[i]));
        }
        System.out.println("Beta0 nueva: "+nbt0);
        System.out.println("Beta1 nueva: "+nbt1);
    }
}
