package OSB;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import Gradient.Resolver;
public class GradientD extends Agent {

    protected void setup() {
        System.out.println("Regresion Lineal Simple");
        addBehaviour(new MyOneShotBehaviour());
    }

    private class MyOneShotBehaviour extends OneShotBehaviour{
    public void action() {
        Resolver r = new Resolver(9,0,0,0,0,0,0,0,0,0,0.003,0,0,0,0,0);
        r.getX();
        r.getY();
        r.getXc();
        r.getXy();
        r.mostrarMatrices();
        r.Sax();
        r.say();
        r.cuadradosysuma();
        r.beta0();
        r.beta1();
        r.step2p1();
        r.step2P2();
        r.sumatoriasStep2();
        r.step3();
        r.NewBetas();
    }
    public int onEnd() {
        myAgent.doDelete();
        return super.onEnd();
    }
    }
}