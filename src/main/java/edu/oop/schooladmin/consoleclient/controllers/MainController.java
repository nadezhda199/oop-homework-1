package edu.oop.schooladmin.consoleclient.controllers;

import edu.oop.schooladmin.consoleclient.views.MainView;
import edu.oop.schooladmin.consoleclient.views.Menu;
import edu.oop.schooladmin.model.interfaces.DataProvider;
import edu.oop.utils.Console;

public class MainController {
	private final DataProvider dp;

	public MainController(DataProvider dp) {
		this.dp = dp;
	}

	public void runLifecycle() {
		do {
			Console.clearScreen();
			Menu.


		} while (Console.askYesNo(scanner, "\nЖелаете повторить (Y/n)? ", true));
	}
}
