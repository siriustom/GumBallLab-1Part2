package GumBall2;

public class SoldState2Q implements State {
    GumballMachineTwoQuarter TwoQuarter;

    public SoldState2Q(GumballMachineTwoQuarter TwoQuarter) {
        this.TwoQuarter = TwoQuarter;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        TwoQuarter.releaseBall();
        if (TwoQuarter.getCount() > 0) {
            TwoQuarter.setState(TwoQuarter.getNo2QuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            TwoQuarter.setState(TwoQuarter.getSoldOutState2Q());
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
