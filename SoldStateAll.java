package GumBall2;

public class SoldStateAll implements State {
    GumballMachineAllCoin all;

    public SoldStateAll(GumballMachineAllCoin all) {
        this.all = all;
    }

    public void insertQuarter() {}

    public void ejectQuarter() {}

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        all.releaseBall();
        if (all.getCount() > 0) {
            all.setState(all.getNoCoinState());
        } else {
            System.out.println("Oops, out of gumballs!");
            all.setState(all.getSoldOutStateAll());
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }

    public void insertCoin(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }
    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank");
    }
}
