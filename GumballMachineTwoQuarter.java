package GumBall2;

public class GumballMachineTwoQuarter {
    State soldOutState2Q;
    State no2QuarterState;
    State has2QuarterState;
    State has1QuarterState;
    State soldState2Q;

    State state = soldOutState2Q;
    int count = 0;

    public GumballMachineTwoQuarter(int numberGumballs) {
        soldOutState2Q = new SoldOutState2Q(this);
        no2QuarterState = new No2QuarterState(this);
        has1QuarterState = new Has1QuarterState(this);
        has2QuarterState = new Has2QuarterState(this);
        soldState2Q = new SoldState2Q(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = no2QuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }

    int getCount() {
        return count;
    }

    void refill(int count) {
        this.count = count;
        state = no2QuarterState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState2Q() {
        return soldOutState2Q;
    }

    public State getNo2QuarterState() {
        return no2QuarterState;
    }

    public State getHas1QuarterState() {
        return has1QuarterState;
    }

    public State getHas2QuarterState() {
        return has2QuarterState;
    }

    public State getSoldState2Q() {
        return soldState2Q;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2005");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
