package GumBall2;

public class OtherLessThan50State implements State {
    GumballMachine gumballMachine;

    public OtherLessThan50State(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        if (gumballMachine.otherCents < 25) {
            gumballMachine.numOfQuarter++;
            gumballMachine.setState(gumballMachine.getLessThan50HasQuarterState());
        } else {
            gumballMachine.numOfQuarter++;
            gumballMachine.setState(gumballMachine.getEqual50State());
        }
    }

    public void insertCoin(int coin) {
        if (gumballMachine.otherCents < 40) {
            gumballMachine.otherCents += coin;
            System.out.println("You paid " + coin + "cents");
        } else {
            gumballMachine.otherCents += coin;
            System.out.println("You paid " + coin + "cents");
            if (gumballMachine.otherCents >= 50) {
                gumballMachine.setState(gumballMachine.getEqual50State());
            }
        }
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted quarter");
    }

    public void ejectCoin() {
        System.out.println("Coins returned");
        gumballMachine.otherCents = 0;
    }

    public void turnCrank() {
        System.out.println("You don't have enough coins");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
