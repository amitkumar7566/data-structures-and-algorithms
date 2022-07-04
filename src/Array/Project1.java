package Array;

import java.util.Scanner;

public class Project1 {
    
    //Question: Find the average temperature for a given number of days and the number of days above the average temperature.

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("\nProvide the number of days: ");
        int numOfDays = console.nextInt();
        
        int[] temperatures = new int[numOfDays];
        int sumOfAllTemperatures = 0;

        for (int i = 0; i < numOfDays; i++) {
            System.out.print("Day " + (i + 1) + " temperature: ");
            temperatures[i] = console.nextInt();
            sumOfAllTemperatures += temperatures[i];
        }
        
        double averageTemperature = sumOfAllTemperatures / numOfDays;
        System.out.println("\nAverage temperature: " + averageTemperature);

        int numOfDaysAboveAvgTemp = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > averageTemperature)
                numOfDaysAboveAvgTemp++;
        }

        System.out.println("\nNo. of days above average temperature: " + numOfDaysAboveAvgTemp);
        
    }
    
}
