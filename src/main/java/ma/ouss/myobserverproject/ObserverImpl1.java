package ma.ouss.myobserverproject;

public class ObserverImpl1 implements Observer{
    @Override
    public void update(int state) {
        double r=state*state+9;
        System.out.println("Observer IMP 11111111111111111111111111111111111111111");
        System.out.println("New mise à jour : state ="+state);
        System.out.println("Result ========> "+r);
    }
}
