package edu.oop.schooladmin.consoleclient.interfaces;

import java.util.Scanner;

import edu.oop.schooladmin.model.interfaces.DataProvider;

public interface Controller {
	// /** Аксессор. Возвращает экземпляр провайдера данных */
	// DataProvider dp();
	// /** Аксессор. Возвращает экземпляр текстового сканера, настроенного на поток ввода консоли  */
	// Scanner scanner();

	/** Запуск жизненного цикла контроллера */
	void runLifecycle();
}
