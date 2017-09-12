package GumBall2;

public class NoCoinState implements State {
    GumballMachineAllCoin all;

    public NoCoinState(GumballMachineAllCoin all) {
        this.all = all;
    }

    public void insertQuarter() {}

    public void ejectQuarter() {}

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for coin";
    }

    public void insertCoin(int coin) {
        all.cents += coin;
        if (all.cents < 50) {
            all.setState(all.getLess50State());
        } else {
            all.setState(all.getEqual50State());
        }
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
}
