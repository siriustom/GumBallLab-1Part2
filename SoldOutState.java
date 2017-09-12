package GumBall2;

public class SoldOutState implements State {
    GumballMachineOneQuarter OneQuarter;

    public SoldOutState(GumballMachineOneQuarter OneQuarter) {
        this.OneQuarter = OneQuarter;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
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

    public void insertCoin(int coin) {}
    public void ejectCoin() {}
}
