package GumBall2;

public class Main {
    public static void main(String[] args) {
        //Model 1: One Quarter machine
        GumballMachine OneQuarter = new GumballMachine(5, "one");

        System.out.println(OneQuarter);

        OneQuarter.insertCoin(25);
        OneQuarter.turnCrank();

        System.out.println(OneQuarter);

        //Model 2: Two Quarter machine
        GumballMachine TwoQuarter = new GumballMachine(5, "two");

        System.out.println(TwoQuarter);

        TwoQuarter.insertCoin(25);
        TwoQuarter.turnCrank();
        TwoQuarter.insertCoin(25);
        TwoQuarter.turnCrank();

        System.out.println(TwoQuarter);

        //Model 3: All coins machine
        GumballMachine all = new GumballMachine(5, "all");
        System.out.println(all);

        all.insertCoin(25);
        all.turnCrank();
        all.insertCoin(10);
        all.insertCoin(10);
        all.insertCoin(5);
        all.turnCrank();

        System.out.println(all);
    }
}
