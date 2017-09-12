package GumBall2;

public class SoldOutStateAll implements State {
    GumballMachineAllCoin all;

    public SoldOutStateAll(GumballMachineAllCoin all) {
        this.all = all;
    }

    public void insertCoin(int coin) {
        System.out.println("You can't insert a coin, the machine is sold out");
    }

    public void ejectCoin() {
        if (all.cents == 0) {
            System.out.println("You can't eject, you haven't inserted a coin yet");
        } else {
            all.cents = 0;
            System.out.println("Coins returned");
        }
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "sold out";
    }

    public void insertQuarter() {}
    public void ejectQuarter() {}
}
