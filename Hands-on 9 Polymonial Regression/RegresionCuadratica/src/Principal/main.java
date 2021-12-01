package Principal;
import jade.core.Agent;
import jade.core.behaviours.OneShotBehaviour;
public class main extends Agent{
    protected void setup() {
        System.out.println("Regresion Cuadratica");
        addBehaviour(new MyOneShotBehaviour());
    }


    private class MyOneShotBehaviour extends OneShotBehaviour {
        public void action() {
            detSistema p = new detSistema();
            p.Sistema();
            detA a = new detA();
            a.Sistema();
            detB db = new detB();
            db.Sistema();
            detC dc = new detC();
            dc.Sistema();
            Rabc acb = new Rabc();
            acb.Sistema();
        }
        public int onEnd() {
            myAgent.doDelete();
            return super.onEnd();
        }
    }
}

