package GumBall2;

public class No2QuarterState implements State {
    GumballMachineTwoQuarter TwoQuarter;

    public No2QuarterState(GumballMachineTwoQuarter TwoQuarter) {
        this.TwoQuarter = TwoQuarter;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        TwoQuarter.setState(TwoQuarter.getHas1QuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
