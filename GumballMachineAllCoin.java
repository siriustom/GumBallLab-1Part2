package GumBall2;

public class GumballMachineAllCoin {
    State soldOutStateAll;
    State noCoinState;
    State less50State;
    State equal50State;
    State soldStateAll;

    State state = soldOutStateAll;
    int count = 0;
    int cents;

    public GumballMachineAllCoin(int numberGumballs) {
        soldOutStateAll = new SoldOutStateAll(this);
        noCoinState = new NoCoinState(this);
        less50State = new Less50State(this);
        equal50State = new Equal50State(this);
        soldStateAll = new SoldStateAll(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        }
    }

    public void insertCoin(int coin) { state.insertCoin(coin); }

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
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutStateAll() {
        return soldOutStateAll;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getLess50State() {
        return less50State;
    }

    public State getEqual50State() {
        return equal50State;
    }

    public State getSoldStateAll() {
        return soldStateAll;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2006");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
