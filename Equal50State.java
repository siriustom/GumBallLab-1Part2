package GumBall2;

public class Equal50State implements State {
    GumballMachineAllCoin all;

    public Equal50State(GumballMachineAllCoin all) {
        this.all = all;
    }

    public void insertQuarter() {}

    public void ejectQuarter() {}

    public void turnCrank() {
        System.out.println("You turned...");
        all.cents -= 50;
        this.ejectCoin();
        all.setState(all.getSoldStateAll());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

    public void insertCoin(int coin) {
        System.out.println("You've already inserted 50 cents");
    }
    public void ejectCoin() {
        all.cents = 0;
        all.setState(all.getNoCoinState());
    }
}
