package alfa;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import regrels.Resolver;

public class RLS extends Agent {

    protected void setup() {
        System.out.println("Regresion Lineal Simple");
        addBehaviour(new MyOneShotBehaviour());
    }

    private class MyOneShotBehaviour extends OneShotBehaviour {
        public void action() {
            Resolver r = new Resolver(9, 0, 0, 0, 0, 0, 0);
            r.getX();
            r.getY();
            r.getRx();
            r.getRy();
            r.getXc();
            r.getXy();
            r.mostrarMatrices();
            r.Sax();
            r.say();
            r.cuadradosysuma();
            r.beta0();
            r.beta1();
            r.y();
        }
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}