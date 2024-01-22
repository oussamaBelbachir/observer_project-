package ma.ouss.myobserverproject;
public class ObserverImpl2 implements Observer{
    private int counter;
    @Override
    public void update(int state) {
        if((state%2)==0) ++counter;
        System.out.println("Observer IMP 11111111111111111111111111111111111111111");
        System.out.println("New mise à jour : state ="+state);
        System.out.println("Result ========>"+((state%2)==0?"Pair":"impaire"));
        System.out.println("Cmp est  :"+counter);
    }
}
