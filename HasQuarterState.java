package GumBall2;

public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.numOfQuarter++;
        gumballMachine.setState(gumballMachine.getEqual50State());
    }

    public void insertCoin(int coin) {
        gumballMachine.otherCents += coin;
        System.out.println("You paid " + coin + "cents");
        gumballMachine.setState(gumballMachine.getLessThan50HasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted coins other than quarter");
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
