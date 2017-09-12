package GumBall2;

public class GumballMachine {
    State noCoin;
    State hasQ;
    State less50;
    State has50;
    State sold;
    State soldOut;

    State state = soldOut;
    int count = 0;
    int quarterNum = 0;
    int cents = 0;
    boolean oneQ = false;
    boolean twoQ = false;
    boolean allCoin = false;

    public GumballMachine(int numberGumballs, String type) throws IllegalArgumentException {
        if (type.equalsIgnoreCase("one") || type.equalsIgnoreCase("two")
                || type.equalsIgnoreCase("all")) {
            this.noCoin = new NoCoin(this);
            this.sold = new Sold(this);
            this.soldOut = new SoldOut(this);
            if (type.equalsIgnoreCase("one") || type.equalsIgnoreCase("two")) {
                this.hasQ = new HasQ(this);
                if (type.equalsIgnoreCase("one")) {
                    this.oneQ = true;
                } else {
                    this.twoQ = true;
                    this.has50 = new Has50(this);
                }
            } else {
                this.allCoin = true;
                this.less50 = new Less50(this);
                this.has50 = new Has50(this);
            }
        } else {
            throw new IllegalArgumentException();
        }
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoin;
        }
    }

    public void insertCoin(int coin) {
        state.insertCoin(coin);
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

    public void releaseBall() {
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
        state = noCoin;
    }

    public State getState() {
        return state;
    }

    public State getHas50() { return has50; }

    public State getLess50() { return less50; }

    public State getSoldOut() {
        return soldOut;
    }

    public State getNoCoin() {
        return noCoin;
    }

    public State getHasQ() {
        return hasQ;
    }

    public State getSold() {
        return sold;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        if (this.oneQ) {
            result.append("\nJava-enabled Standing Gumball Model-25Q #2004");
        } else if (this.twoQ) {
            result.append("\nJava-enabled Standing Gumball Model-50Q #2004");
        } else {
            result.append("\nJava-enabled Standing Gumball Model-50A #2004");
        }
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
