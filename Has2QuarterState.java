package GumBall2;

public class Has2QuarterState implements State {
    GumballMachineTwoQuarter TwoQuarter;

    public Has2QuarterState(GumballMachineTwoQuarter TwoQuarter) {
        this.TwoQuarter = TwoQuarter;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        TwoQuarter.setState(TwoQuarter.getNo2QuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        TwoQuarter.setState(TwoQuarter.getSoldState2Q());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
