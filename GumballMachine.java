package GumBall2;

public class GumballMachine {
    State soldOutState;
    State noCoinState;
    State hasQuarterState;
    State otherLessThan50State;
    State lessThan50HasQuarterState;
    State equal50State;
    State soldState;

    State state = soldOutState;
    int count = 0;
    int otherCents;
    int numOfQuarter;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasQuarterState = new HasQuarterState(this);
        otherLessThan50State = new OtherLessThan50State(this);
        lessThan50HasQuarterState = new LessThan50HasQuarterState(this);
        equal50State = new Equal50State(this);
        soldState = new SoldState(this);

        this.otherCents = 0;
        this.numOfQuarter = 0;
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        if (count != 0) {
            count = count - 1;
            System.out.println("A gumball comes rolling out the slot...");
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getOtherLessThan50State() {
        return otherLessThan50State;
    }

    public State getLessThan50HasQuarterState() {
        return lessThan50HasQuarterState;
    }

    public State getEqual50State() {
        return equal50State;
    }

    public State getSoldState() {
        return soldState;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
