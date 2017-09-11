package GumBall2;

public class LessThan50HasQuarterState implements State {
    GumballMachine gumballMachine;

    public LessThan50HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        gumballMachine.numOfQuarter++;
        gumballMachine.setState(gumballMachine.getEqual50State());
    }

    public void insertCoin(int coin) {
        gumballMachine.otherCents += coin;
        System.out.println("You paid " + coin + "cents");
        if (gumballMachine.otherCents >= 25) {
            gumballMachine.setState(gumballMachine.getEqual50State());
        }
    }

    public void ejectQuarter() {
        gumballMachine.numOfQuarter--;
        System.out.println("Quarter returned");
    }

    public void ejectCoin() {
        gumballMachine.otherCents = 0;
        System.out.println("Coins returned");
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
