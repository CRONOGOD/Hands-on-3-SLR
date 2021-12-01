package Principal;
public abstract class Sistemaa {
    public double []X={-3, -2, -1, 0, 1, 2, 3};
    public double []Y={7.5, 3, 0.5, 1, 3, 6, 14};
    //public double []X={50, 50, 50, 70, 70, 70, 80, 80, 80, 90, 90, 90, 100, 100, 100};
    //public double []Y={3.3, 2.8, 2.9, 2.3, 2.6, 2.1, 2.5, 2.9, 2.4, 3.0, 3.1, 2.8, 3.3, 3.5, 3.0};
    //public double []X={0, 20, 40, 60, 80, 100};
    //public double []Y={0.0002, 0.0012, 0.0060, 0.0300, 0.0900, 0.2700};
    public double sx;
    public double sy;
    public int n = X.length;
    public double[] xy = new double[n];
    public double[] x2 = new double[n];
    public double[] x3 = new double[n];
    public double[] x4 = new double[n];
    public double[] x2xy = new double[n];
    public double sxy;
    public double sx2;
    public double sx3;
    public double sx4;
    public double sx2y;

    public abstract void Sistema();

    public void setX(double[] x) {
        this.X = X;
    }

    public double[] getX() {
        return X;
    }

    public void setY(double[] y) {
        this.Y = Y;
    }

    public double[] getY() {
        return Y;
    }

    public double getSx() {
        for(int i=0; i< X.length; i++ ){
            sx = sx + X[i];
        }
        return sx;
    }
    public void setSx(double sx) {this.sx = sx;}

    public double getSy() {
        for(int i=0; i< Y.length; i++ ){
            sy = sy + Y[i];
        }
        return sy;
    }
    public void setSy(double sy) {this.sy = sy;}

    public double getSx2() {
        for (int i =0; i< n; i++){
            sx2= sx2 + x2[i];
        }
        return sx2;
    }

    public void setSx2(double sx2) {
        this.sx2 = sx2;
    }

    public double getSx3() {
        for (int i =0; i< n; i++){
            sx3= sx3 + x3[i];
        }
        return sx3;
    }

    public void setSx3(double sx3) {
        this.sx3 = sx3;
    }

    public double getSx4() {
        for (int i =0; i< n; i++){
            sx4= sx4 + x4[i];
        }
        return sx4;
    }

    public void setSx4(double sx4) {
        this.sx4 = sx4;
    }

    public double getSx2y() {
        for (int i =0; i< n; i++){
            sx2y= sx2y + x2xy[i];
        }
        return sx2y;
    }

    public void setSx2y(double sx2y) {
        this.sx2y = sx2y;
    }

    public double[] getX2() {
        for(int i = 0; i< n; i++){
            x2[i] = X[i] * X[i];
        }
        return x2;
    }

    public void setX2(double[] x2) {
        this.x2 = x2;
    }

    public double[] getX3() {
        for(int i = 0; i< n; i++){
            x3[i] = X[i] * X[i] * X[i];
        }
        return x3;
    }

    public void setX3(double[] x3) {
        this.x3 = x3;
    }

    public double[] getX4() {
        for(int i = 0; i< n; i++){
            x4[i] = X[i] * X[i] * X[i] * X[i];
        }
        return x4;
    }

    public void setX4(double[] x4) {
        this.x4 = x4;
    }

    public double[] getX2xy() {
        for(int i = 0; i< n; i++){
            x2xy[i] = X[i] * X[i] * Y[i];
        }
        return x2xy;
    }

    public void setX2xy(double[] x2xy) {
        this.x2xy = x2xy;
    }

    public double[] getXy() {
        for(int i = 0; i< n; i++){
            xy[i] = X[i] * Y[i];
        }
        return xy;
    }

    public void setXy(double[] xy) {
        this.xy = xy;
    }

    public double getSxy() {
        for (int i =0; i< n; i++){
            sxy= sxy + xy[i];
        }
        return sxy;
    }

    public void setSxy(double sxy) {
        this.sxy = sxy;
    }
    public double rdet1;

    public double getRdet1(double rdet1) {
        return this.rdet1;
    }

    public double setRdet1(double rdet1) {
        this.rdet1 = rdet1;
        return rdet1;
    }

}
