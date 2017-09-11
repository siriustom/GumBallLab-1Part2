package GumBall2;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void insertCoin(int coin) {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void ejectCoin() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    public void dispense() {
        if (gumballMachine.numOfQuarter == 2 || gumballMachine.otherCents >= 50 ||
                gumballMachine.numOfQuarter * 25 + gumballMachine.otherCents >= 50) {
            gumballMachine.releaseBall();
            gumballMachine.releaseBall();
            if (gumballMachine.numOfQuarter == 2) {
                gumballMachine.numOfQuarter = 0;
            } else if (gumballMachine.otherCents >= 50) {
                gumballMachine.otherCents -= 50;
            } else if (gumballMachine.numOfQuarter * 25 + gumballMachine.otherCents >= 50) {
                gumballMachine.numOfQuarter = 0;
                gumballMachine.otherCents -= 25;
            }
        } else if (gumballMachine.numOfQuarter == 1) {
            gumballMachine.releaseBall();
            gumballMachine.numOfQuarter--;
        }
        if (gumballMachine.getCount() > 0) {
            if (gumballMachine.otherCents == 0) {
                gumballMachine.setState(gumballMachine.getNoCoinState());
            } else {
                gumballMachine.setState(gumballMachine.getOtherLessThan50State());
            }
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public String toString() {
        return "dispensing a gumball";
    }
}
