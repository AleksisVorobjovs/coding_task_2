import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1.Write a program which creates two dimensional array and stores multiplication table (from 1 - 10) in it.
        int[][] multiplicationTable = new int[10][10];
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                multiplicationTable[i][j]=(i+1)*(j+1);
                System.out.print(multiplicationTable[i][j]+"  ");
            }
            System.out.println();
        }

        //2.Declare and initialize array with four arbitrary whole numbers. Write a Java program to copy this array by iterating it.
        int[] arbitraryWholeNumbers = {7,6,9,2};
        int[] copy = new int[4];
        for(int i=0;i<arbitraryWholeNumbers.length;i++){
            copy[i]=arbitraryWholeNumbers[i];
        }
        System.out.println("Copied array: "+ Arrays.toString(copy));

        //3. and 4. Here I call out methods and create objects using class "BankAccount" from BankAccount.java
        BankAccount myBank = new BankAccount();
        BankAccount notMyBank = new BankAccount();
        myBank.deposit(40.43);
        //write a code which tries to withdraw more money than there is in bank account (tries to buy Tesla Model S)
        myBank.withdraw(60420);
        //write a code which tries to deposit more than max limit (based on my true daily deposit)
        myBank.deposit(999999999);
        //write a code which tries to transfer more money from one account to another account than possible
        myBank.transferFrom(notMyBank,50);

        //5.Program should be able to handle steering, changing gears, and drive (having speed in other words)
        ElectricCar myTesla = new ElectricCar(190,"Tesla","White",6);
        myTesla.startVehicle();
        for(int i=0;i<50;i++) {
            myTesla.speedUp();
        }
        myTesla.turnLeft();
        myTesla.turnLeft();
        myTesla.turnRight();
        myTesla.turnRight();
        for(int i=0;i<50;i++) {
            myTesla.speedDown();
        }

    }
}