package lesson2;

public class ComputerRunner {
    public static void main(String[] args) {
        int value = 5;
        Computer computer = new Computer();
        computer.printStait();

        Computer computer2 = new Computer(100);
        computer2.printStait();

        Computer computer3 = new Computer(2048, 1000);
        computer3.printStait();

    }
}
