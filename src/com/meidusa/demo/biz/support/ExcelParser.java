package com.meidusa.demo.biz.support;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelParser {

	public static Logger log = Logger.getLogger(ExcelParser.class);

	public static Map<String, List<String>> parse(InputStream inputStream)
			throws Exception {
		log.info("enter ExcelParser.parse()");
		
		Map<String, List<String>> excelData = new HashMap<String, List<String>>();
		try{

		HSSFWorkbook workbook = new HSSFWorkbook(inputStream);
		int sheetNum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetNum; i++) {
			HSSFSheet childSheet = workbook.getSheetAt(i);
			int sheetRows = childSheet.getPhysicalNumberOfRows();
			for (int r = 1; r < sheetRows; r++) {					//exclude row index 0
				List<String> rowList = new ArrayList<String>();
				int rowCells = childSheet.getRow(0).getPhysicalNumberOfCells();
				for (short c = 0; c < rowCells; c++) {
					HSSFCell cell = childSheet.getRow(r).getCell(c);
					String value = null;

					if (cell == null){
						value = "";
						rowList.add(value != null ? value.trim() : value);
						continue;
					}
					switch (cell.getCellType()) {
					case HSSFCell.CELL_TYPE_NUMERIC:
					case HSSFCell.CELL_TYPE_FORMULA:{
		                if (HSSFDateUtil.isCellDateFormatted(cell)) {
		                    Date date = cell.getDateCellValue();
		                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		                    value = sdf.format(date);
		                    
		                }
		                else {
		                	value = String.format("%.0f", cell.getNumericCellValue());
		                	//value = String.valueOf(cell.getNumericCellValue());
		                }
						break;
					}
					case HSSFCell.CELL_TYPE_STRING:
						value = cell.getRichStringCellValue().getString();
						break;
					case HSSFCell.CELL_TYPE_BLANK:
						value = "";
						break;
					default:
						value = "";
					}
					if ("NULL".equals(value))
						value = "";
					rowList.add(value != null ? value.trim() : value);
				}
				log.info("sheet:" + i + "row:" + r + ".value->" + rowList);
				excelData.put("" + i + "_" + r, rowList);
			}
		}
		}catch(Exception e){
			log.error("parse excel error", e);
		}

		return excelData;
	}
}
