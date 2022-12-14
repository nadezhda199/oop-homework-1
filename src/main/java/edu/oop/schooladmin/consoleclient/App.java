package edu.oop.schooladmin.consoleclient;

import edu.oop.schooladmin.consoleclient.controllers.MainController;
import edu.oop.schooladmin.model.implementations.testdb.TestDbProvider;

public class App {
	public static void main(String[] args) {
		TestDbProvider dataProvider = new TestDbProvider();

		// MainController mainController = new MainController(dataProvider);


	}
}
