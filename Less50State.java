package GumBall2;

public class Less50State implements State {
    GumballMachineAllCoin all;

    public Less50State(GumballMachineAllCoin all) {
        this.all = all;
    }

    public void insertQuarter() {}

    public void ejectQuarter() {}

    public void turnCrank() {
        System.out.println("You don't have enough coins");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "you have less than 50 cents";
    }

    public void insertCoin(int coin) {
        all.cents += coin;
        System.out.println("You inserted " + coin + " cents");
        System.out.println("You have " + all.cents + " cents");
        if (all.cents >= 50) {
            all.setState(all.getEqual50State());
        }
    }

    public void ejectCoin() {
        all.cents = 0;
        System.out.println("Coins returned");
    }
}
