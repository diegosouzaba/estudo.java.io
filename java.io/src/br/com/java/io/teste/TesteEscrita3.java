package br.com.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;


public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Assim como todo o resto das bibliotecas em Java, a parte de controle de entrada e sa�da de");
		ps.println();
		ps.println("dados (conhecido como io) � orientada a objetos e usa os principais conceitos mostrados at�");
				
		ps.close();
		

	}

}
