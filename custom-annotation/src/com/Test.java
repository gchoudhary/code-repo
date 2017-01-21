package com;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee emp = new Employee("Sandeep", null);

		List<String> errors = NotNullAndNotEmptyValidator.validate(emp);

		for (String error : errors) {
			System.out.println(error);
		}

	}
}