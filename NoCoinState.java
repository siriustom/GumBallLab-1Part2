package GumBall2;

public class NoCoinState implements State {
    GumballMachine gumballMachine;

    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.numOfQuarter++;
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void insertCoin(int coin) {
        System.out.println("You inserted" + coin + "cents");
        gumballMachine.otherCents += coin;
        gumballMachine.setState(gumballMachine.getOtherLessThan50State());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted any coins");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter or coin");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter or other coin";
    }
}
