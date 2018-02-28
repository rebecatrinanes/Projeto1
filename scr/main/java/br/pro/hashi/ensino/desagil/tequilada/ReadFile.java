package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;
import java.util.LinkedList;

public class ReadFile {
	private static BufferedReader br;

	public static void main(String[] args) {
		
		try {
			
			String line = null;
			int num_line = 0;
			
			
			br = new BufferedReader(new FileReader("/Users/macbook/Downloads/teste2.txt"));
			System.out.println("Conteúdos do arquivo FileName.txt");
			while((line = br.readLine()) != null) {
				
				int col = 0;
				
				if (num_line > 0){
					LinkedList<String> lista = new LinkedList<>();
					String array[] = line.split("");
					
					while(col < array.length){
						if (array[col].equals("#")){
								array[col] = "X";
					}
					lista.add(array[col]);
					col++;
					}
				
				String myString = String.join("", lista);
				System.out.println(myString);
				}
				num_line++;
			}
		}
		catch(IOException e) {
		System.out.println(e.getMessage());
		}	
	} 
}
