package MOSB;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
import regreml.Resolver;
public class RLM extends Agent {
    protected void setup() {
        System.out.println("Regresion Lineal Multiple");
        addBehaviour(new MyOneShotBehaviour());
    }
    private class MyOneShotBehaviour extends OneShotBehaviour {
        public void action() {
            Resolver r = new Resolver(0,0,0,0,0,0,0);
            r.getM1();
            r.getY();
            r.getTr();
            r.getF1();
            r.getF2();
            r.getInversa();
            r.getBtas();
            r.getR();
            r.getRy();
            r.cargar();
            r.Mostrar();
            r.Multiplicacion();
            r.Multiplicacion2();
            r.Inversa();
            r.Betas();
            r.YFactores();
        }
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}
