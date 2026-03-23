package com.mago.zoologico.Funcionarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.mago.zoologico.FileReadError;
import com.mago.zoologico.FileWriteError;


// essa classe armazena os funcionarios em um arraylist através dos nomes vindos de um arquivo .txt
public class FuncionariosManager {
	public void loadNamesFromFile(String filename) throws FileReadError {
		try {
	      File file = new File(filename);
	      Scanner scanner = new Scanner(file);
	      while (scanner.hasNextLine()) {
	        String data = scanner.nextLine();
	        System.out.println(data);
	      }
		  scanner.close();
	    } catch (FileNotFoundException e) {
	      throw new FileReadError("Não foi possível ler deste arquivo.");
	    }
	}

	public void cadastrarFuncionario(String nome) throws FileWriteError {
		try {
			FileWriter myWriter = new FileWriter("funcionarios.txt", true);
			myWriter.write('\n');
			myWriter.write(nome);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			throw new FileWriteError("Não foi possível escrever para este arquivo.");
		}
    }

	// Polimorfismo de sobrecarga
	public void cadastrarFuncionario(Funcionario funcionario) throws IOException {
		try {
			FileWriter myWriter = new FileWriter("funcionarios.txt", true);
			myWriter.write('\n');
			myWriter.write(funcionario.getNome());
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
