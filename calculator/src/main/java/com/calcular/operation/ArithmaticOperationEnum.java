package com.calcular.operation;


class ArithmaticOperationEnum {

	enum Operations {
		ADD, DELETE, MULTIPLY, DIVIDE , PERCENTAGE
	}

	Operations operations;

	public Operations getOperations() {
		return operations;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

}