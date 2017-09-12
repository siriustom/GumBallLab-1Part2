package GumBall2;

public class NoQuarterState implements State {
    GumballMachineOneQuarter OneQuarter;

    public NoQuarterState(GumballMachineOneQuarter OneQuarter) {
        this.OneQuarter = OneQuarter;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        OneQuarter.setState(OneQuarter.getHasQuarterState());
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
