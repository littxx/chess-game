package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("program chess init");
		Position pos = new Position(3, 5);
		
		System.out.println(pos);
		
		
		
		sc.close();

	}

}
