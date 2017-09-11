package GumBall2;

public class Main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);//1 quarter

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);//2 quarters

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);//50 cents all

        gumballMachine.insertQuarter();
        gumballMachine.insertCoin(10);
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();
        gumballMachine.insertCoin(10);
        gumballMachine.insertCoin(10);
        gumballMachine.insertCoin(10);
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
