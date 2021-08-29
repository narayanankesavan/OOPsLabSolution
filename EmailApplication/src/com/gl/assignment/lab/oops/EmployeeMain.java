package com.gl.assignment.lab.oops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.gl.assignment.lab.oops.model.Employee;
import com.gl.assignment.lab.oops.service.CredentialService;

public class EmployeeMain {

	public static void main(String[] args) {
		Map<Integer, String> deptMap = new HashMap<>();
		deptMap.put(1, "tech");
		deptMap.put(2, "admin");
		deptMap.put(3, "hr");
		deptMap.put(4, "legal");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your First Name");
		String fName = sc.next();
		System.out.println("Please Enter your Last Name");
		String lName = sc.next();
		System.out.println("Please Enter the Department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String dept = deptMap.get(sc.nextInt());

		Employee employee = new Employee(fName, lName, dept);
		CredentialService creditalService = new CredentialService(employee);
		creditalService.generateEmailAddress();
		creditalService.generatePassword();
		creditalService.showCredentials();
		sc.close();

	}

}
