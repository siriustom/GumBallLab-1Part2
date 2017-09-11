package GumBall2;

public class Equal50State implements State {
    GumballMachine gumballMachine;

    public Equal50State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You've already paid 50 cents");
    }

    public void insertCoin(int coin) {
        System.out.println("You've already paid 50 cents");
    }

    public void ejectQuarter() {
        gumballMachine.numOfQuarter = 0;
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
