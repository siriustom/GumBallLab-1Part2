package GumBall2;

import GumBall.GumballMachine;

public class Main {
    public static void main(String[] args) {
        //Model 1: One Quarter machine
        GumballMachineOneQuarter OneQuarter = new GumballMachineOneQuarter(5);

        System.out.println(OneQuarter);

        OneQuarter.insertQuarter();
        OneQuarter.turnCrank();

        System.out.println(OneQuarter);

        //Model 2: Two Quarter machine
        GumballMachineTwoQuarter TwoQuarter = new GumballMachineTwoQuarter(5);

        System.out.println(TwoQuarter);

        TwoQuarter.insertQuarter();
        TwoQuarter.turnCrank();
        TwoQuarter.insertQuarter();
        TwoQuarter.turnCrank();

        System.out.println(TwoQuarter);

        //Model 3: All coins machine
        GumballMachineAllCoin all = new GumballMachineAllCoin(5);
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
