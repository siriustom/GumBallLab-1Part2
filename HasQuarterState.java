package GumBall2;

public class HasQuarterState implements State {
    GumballMachineOneQuarter OneQuarter;

    public HasQuarterState(GumballMachineOneQuarter OneQuarter) {
        this.OneQuarter = OneQuarter;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        OneQuarter.setState(OneQuarter.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        OneQuarter.setState(OneQuarter.getSoldState());
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
