package GumBall2;

public class Less50 implements State {
    GumballMachine gumballMachine;

    public Less50(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertCoin(int coin) {
        if (gumballMachine.allCoin) {
            gumballMachine.cents += coin;
            System.out.println("You inserted " + coin + " cents");
            System.out.println("You have " + gumballMachine.cents + " cents");
            if (gumballMachine.cents >= 50) {
                gumballMachine.setState(gumballMachine.getHas50());
            }
        }
    }

    public void ejectCoin() {
        if (gumballMachine.allCoin) {
            System.out.println(gumballMachine.cents + " Cents returned");
            gumballMachine.cents = 0;
            gumballMachine.setState(gumballMachine.getNoCoin());
        }
    }

    public void turnCrank() {
        System.out.println("You don't have enough coins");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "you have less than 50 cents";
    }

}
