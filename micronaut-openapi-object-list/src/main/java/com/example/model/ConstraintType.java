package com.example.model;

import java.math.BigDecimal;

public enum ConstraintType {
	LESS_THAN("<", (a, b) -> a < b),
	LESS_THAN_OR_EQUAL("<=", (a, b) -> a <= b),
	EQUAL("=", (a, b) -> a == b),
	NOT_EQUAL("!=", (a, b) -> a != b),
	GREATER_THAN_OR_EQUAL(">=", (a, b) -> a >= b),
	GREATER_THAN(">", (a, b) -> a > b);

	private final String symbol;
	private final CompareOperation operator;

	private interface CompareOperation {
		boolean check(double a, double b);
	}

	ConstraintType(String symbol, CompareOperation operator) {

		this.symbol = symbol;
		this.operator = operator;
	}

	public boolean check(BigDecimal a, BigDecimal b) {
		return operator.check(a.doubleValue(), b.doubleValue());
	}

	public String getSymbol() {
		return symbol;
	}

	public String translationKey() {
		return "la.constraint." + name();
	}
}
