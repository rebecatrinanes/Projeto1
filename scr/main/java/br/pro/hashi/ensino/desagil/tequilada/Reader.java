package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;
import java.util.LinkedList;

public class Reader {
	


		
		private BufferedReader reader;

		void ReadFile(){
				
			try {
				
				String line = null;
				int n_line = 0;
				reader = new BufferedReader(new FileReader("/Users/macbook/Documents/Insper/3Semestre/teste.txt"));
				
				while((line = reader.readLine()) != null) {
					
					int col = 0;
					
					if(n_line > 0){
						
						LinkedList<String> lista_linha = new LinkedList<>();
						String array[] = line.split("");
						
						while(col < array.length){
							if(array[col].equals("#")){
								array[col] = "X";
							}
						lista_linha.add(array[col]);
						col ++;
						}
						
						String print_linha = String.join("", lista_linha);
						System.out.println(print_linha);
					}
					n_line ++;
				}
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
	}



