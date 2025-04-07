package assignment_javaprograms;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Stringfuctions_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner s1=new Scanner(System.in);
		System.out.print("Enter number of days to go back: ");
        int pastDays = s1.nextInt();
        System.out.print("Enter number of days to go forward: ");
        int futureDays = s1.nextInt();
        LocalDate currentDate = LocalDate.now();
       LocalDate pastDate = currentDate.minusDays(pastDays);
        LocalDate futureDate = currentDate.plusDays(futureDays);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentdat = currentDate.format(formatter);
        String pastDat = pastDate.format(formatter);
        String futureDat = futureDate.format(formatter);
        System.out.println("Current Date: " + currentdat);
        System.out.println("Past Date : " + pastDat);
        System.out.println("Future Date (" + futureDays + " days ahead): " + futureDat);
        s1.close();
	}}

        
	

