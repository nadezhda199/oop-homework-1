package edu.oop.schooladmin.consoleclient.controllers;

import java.util.Scanner;

import edu.oop.schooladmin.consoleclient.interfaces.Controller;
import edu.oop.schooladmin.consoleclient.views.MainView;
import edu.oop.schooladmin.consoleclient.views.Menu;
import edu.oop.schooladmin.model.interfaces.DataProvider;
import edu.oop.utils.Console;

public class MainController implements Controller {
	private final DataProvider dp;
	private final Scanner scanner;

	private final Controller teachersController;
	private final Controller studentsController;
	private final Controller groupsController;

	public MainController(DataProvider dp, Scanner scanner) {
		this.dp = dp;
		this.scanner = scanner;

		this.teachersController = null;
		this.studentsController = null;
		this.groupsController = null;
	}

	public void runLifecycle() {
		do {
			Console.clearScreen();

		} while (Console.askYesNo(scanner, "\nЖелаете повторить (Y/n)? ", true));
	}
}
