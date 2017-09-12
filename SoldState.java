package GumBall2;

public class SoldState implements State {
    GumballMachineOneQuarter OneQuarter;

    public SoldState(GumballMachineOneQuarter OneQuarter) {
        this.OneQuarter = OneQuarter;
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
        OneQuarter.releaseBall();
        if (OneQuarter.getCount() > 0) {
            OneQuarter.setState(OneQuarter.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            OneQuarter.setState(OneQuarter.getSoldOutState());
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
