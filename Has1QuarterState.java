package GumBall2;

public class Has1QuarterState implements State {
    GumballMachineTwoQuarter TwoQuarter;

    public Has1QuarterState(GumballMachineTwoQuarter TwoQuarter) {
        this.TwoQuarter = TwoQuarter;
    }

    public void insertQuarter() {
        System.out.println("You insert another quarter");
        TwoQuarter.setState(TwoQuarter.getHas2QuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        TwoQuarter.setState(TwoQuarter.getNo2QuarterState());
    }

    public void turnCrank() {
        System.out.println("You don't have enough quarters");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "You have 1 quarter";
    }

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
