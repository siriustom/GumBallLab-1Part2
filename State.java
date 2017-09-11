package GumBall2;

public interface State {
    public void insertQuarter();
    public void insertCoin(int coin);
    public void ejectQuarter();
    public void ejectCoin();
    public void turnCrank();
    public void dispense();
}
