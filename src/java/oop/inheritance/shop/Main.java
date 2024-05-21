package java.oop.inheritance.shop;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			//Si istanzia un oggetto della classe Smartphone con i dati inseriti da tastiera
			System.out.println("Inserire il nome dello Smartphone");
			String nome = input.nextLine();
	 
			System.out.println("Inserire la marca dello Smartphone");
			String marca = input.nextLine();
			
			System.out.println("Inserire il prezzo");
			float prezzo = input.nextFloat();

			System.out.println("Inserire l'iva");
			int iva = input.nextInt();
			
			System.out.println("Inserire il codice IMEI");
			int codiceIMEI = input.nextInt();
			
			System.out.println("Inserire la quantità di memoria");
			int quantitaMemoria = input.nextInt();
			input.nextLine();
			
			Smartphone s = new Smartphone(nome, marca, prezzo, iva, codiceIMEI, quantitaMemoria);
			
			
            		//Si istanzia un oggetto della classe Televisore 
			System.out.println("Inserire il nome del televisore");
			nome = input.nextLine();
	 
			System.out.println("Inserire la marca del televisore");
			marca = input.nextLine();
			
			System.out.println("Inserire il prezzo");
			prezzo = input.nextFloat();

			System.out.println("Inserire l'iva");
			iva = input.nextInt();
			
			System.out.println("Inserire la dimensione");
			int dimensione = input.nextInt();
			
			System.out.println("Inserire se il televisore è smart (true/false)");
			boolean smart = input.nextBoolean();		
			input.nextLine();
			
			Televisore t = new Televisore(nome, marca, prezzo, iva, dimensione, smart);
	
			//Si istanzia un oggetto della classe Cuffie 
			System.out.println("Inserire il nome delle cuffie");
			nome = input.nextLine();
	 
			System.out.println("Inserire la marca delle cuffie");
			marca = input.nextLine();
			
			System.out.println("Inserire il prezzo");
			prezzo = input.nextFloat();

			System.out.println("Inserire l'iva");
			iva = input.nextInt();
			
			input.nextLine();
			
			System.out.println("Inserire il colore");
			String colore = input.nextLine();
	 
			System.out.println("Inserire il tipo, (wireless/cablate)");
			String tipo = input.nextLine();
			
			Cuffie c = new Cuffie(nome, marca, prezzo, iva, colore, tipo);
			
			//Si stampano i dati degli oggetti
			System.out.println("Dati smartphone: " + s.toString() );
			System.out.println("Dati televisore: " + t.toString() );
			System.out.println("Dati cuffie: " + c.toString() );
		}
}
