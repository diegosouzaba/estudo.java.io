package br.com.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;


public class TesteTecladoEConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStream fis = System.in;
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String linha = br.readLine();
		
		OutputStream fos = System.out;
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(linha != null && !linha.isEmpty()){
			bw.write(linha);
			bw.newLine();
			
			linha = br.readLine();
			
		}
		
		bw.flush();
		br.close();
		bw.close();
		

	}

}
