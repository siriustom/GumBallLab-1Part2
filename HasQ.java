package GumBall2;

public class HasQ implements State {
    GumballMachine gumballMachine;

    public HasQ(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        if (coin == 25) {
            if (gumballMachine.oneQ) {
                System.out.println("You can't insert another quarter");
            }

            if (gumballMachine.twoQ) {
                System.out.println("You insert a quarter");
                gumballMachine.quarterNum++;
                gumballMachine.setState(gumballMachine.getHas50());
            }
        } else {
            System.out.println("only quarters are accepted");
        }
    }
    public void ejectCoin() {
        System.out.println("Quarter returned");
        if (gumballMachine.twoQ) {
            gumballMachine.quarterNum--;
        }
        gumballMachine.setState(gumballMachine.getNoCoin());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        if (gumballMachine.oneQ) {
            gumballMachine.setState(gumballMachine.getSold());
        }
        if (gumballMachine.twoQ){
            System.out.println("You only inserted one quarter, please insert another one");
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        if (gumballMachine.oneQ) {
            return "waiting for turn of crank";
        }
        return "waiting for another quarter";
    }
}
