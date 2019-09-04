package com.isil.ejb.example;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbExample
 */
@Stateless
public class EjbExample implements EjbExampleLocal {

    public EjbExample() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public int suma(int number1, int number2) {
		System.out.println("connect to local Ejb");
		System.out.println("into Ejb sum");
		return number1+number2;
	}

	@Override
	public int resta(int number1, int number2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multiplicacion(int number1, int number2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divicion(int number1, int number2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
