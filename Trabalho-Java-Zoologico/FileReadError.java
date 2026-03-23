package com.mago.zoologico;

import java.io.Serial;

public class FileReadError extends Exception {
		
		@Serial
		private static final long serialVersionUID = 1L;

		// polimorfismo de sobrecarga
      	public FileReadError() {}

      	public FileReadError(String message) {
      		super(message);
      	}
 }