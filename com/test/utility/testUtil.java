package com.test.utility;

import java.util.ArrayList;

import com.excel.lib.util.Xls_Reader;

public class testUtil {
	
	
	
	Xls_Reader reader;
	public static ArrayList<Object[]> getDataFromExcel(){
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try  {
			reader = new Xls_Reader(System.getProperty("user.dir")
					+ "src\\com\\HalfEbayTestData.xlsx" );
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
