package com.isil.ejb.example;

import javax.ejb.Local;

@Local
public interface EjbExampleLocal {

	public int suma(int number1, int number2);
	public int resta(int number1, int number2);
	public int multiplicacion(int number1, int number2);
	public int divicion(int number1, int number2);
}
