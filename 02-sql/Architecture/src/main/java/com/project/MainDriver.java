package com.project;

import java.util.Scanner;

import com.project.ui.GiraffeUi;

public class MainDriver {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		GiraffeUi ui = new GiraffeUi();
		ui.menu();
	}

}
