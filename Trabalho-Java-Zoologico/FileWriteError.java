package com.mago.zoologico;

import java.io.Serial;

public class FileWriteError extends Exception {

		@Serial
		private static final long serialVersionUID = 1L;

		// polimorfismo de sobrecarga
      	public FileWriteError() {}

      	public FileWriteError(String message) {
      		super(message);
      	}
 }