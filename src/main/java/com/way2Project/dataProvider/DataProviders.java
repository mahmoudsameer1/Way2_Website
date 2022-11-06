package com.way2Project.dataProvider;

import org.testng.annotations.DataProvider;
import com.way2Project.utility.NewExcelLibrary;

public class DataProviders {

	NewExcelLibrary obj = new NewExcelLibrary();

	@DataProvider(name = "Ammount")
	public Object[][] getAmmount() {
		int rows = obj.getRowCount("Ammount");
		int column = obj.getColumnCount("Ammount");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Ammount", j, i + 2);
			}
		}
		return data;
	}
	
	@DataProvider(name = "CreateUser")
	public Object[][] CreateUser() {
		int rows = obj.getRowCount("CreateUser");
		int column = obj.getColumnCount("CreateUser");
		int actRows = rows - 1;
		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("CreateUser", j, i + 2);
			}
		}
		return data;
	}

}
