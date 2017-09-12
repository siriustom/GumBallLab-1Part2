package GumBall2;

public class Has50 implements State {
    GumballMachine gumballMachine;

    public Has50(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        System.out.println("You've already inserted 50 cents");
    }
    public void ejectCoin() {
        if (gumballMachine.twoQ) {
            gumballMachine.quarterNum = 0;
            System.out.println("Quarters returned");
            gumballMachine.setState(gumballMachine.getNoCoin());
        }
        if (gumballMachine.allCoin) {
            System.out.println(gumballMachine.cents + " Cents returned");
            gumballMachine.cents = 0;
            gumballMachine.setState(gumballMachine.getNoCoin());
        }
    }

    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.twoQ) {
            gumballMachine.quarterNum = 0;
            gumballMachine.setState(gumballMachine.getSold());
        }
        if (gumballMachine.allCoin) {
            gumballMachine.cents -= 50;
            this.ejectCoin();
            gumballMachine.setState(gumballMachine.getSold());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "waiting for turn of crank";
    }

}
