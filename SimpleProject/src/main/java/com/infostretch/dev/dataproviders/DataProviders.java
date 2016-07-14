package com.infostretch.dev.dataproviders;

import org.testng.annotations.DataProvider;

import com.infostretch.dev.utils.ExcelUtilsCommon;


/**
 * @author Pooja
 *
 */
public class DataProviders {
	
	private static ExcelUtilsCommon excelFileUtils = new ExcelUtilsCommon(); 
	
	@DataProvider(name="keywords")
	public static Object[][] loginData() {
		String currentDir = System.getProperty("user.dir");
		String filePath = (currentDir + "/src/main/resources/com/pooja/testData/ExcelData.xls").replace('\\',
				'/');
		Object[][] arrayObject = excelFileUtils.getExcelData(filePath, "Sheet1");
		return arrayObject;
	}

}
