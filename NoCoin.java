package GumBall2;

public class NoCoin implements State {
    GumballMachine gumballMachine;

    public NoCoin(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    public void turnCrank() {
        System.out.println("You turned, but there's no coin");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for coin";
    }

    public void insertCoin(int coin) {
        if (gumballMachine.oneQ || gumballMachine.twoQ) {
            if (coin == 25) {
                System.out.println("You insert a quarter");
                gumballMachine.setState(gumballMachine.getHasQ());
                if (gumballMachine.twoQ) {
                    gumballMachine.quarterNum++;
                }
            } else {
                System.out.println("Please insert one quarter");
            }
        }

        if (gumballMachine.allCoin) {
            System.out.println("You insert " + coin + " cents");
            gumballMachine.cents += coin;
            gumballMachine.setState(gumballMachine.getLess50());
        }
    }

    public void ejectCoin() {
        System.out.println("You haven't inserted a coin");
    }
}
