//https://huskdoll.tistory.com/890 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
 
public class ExcelToJava {
 
    public static void main(String[] args) {
 
    	int[] arr = new int[3];
        try {
            FileInputStream file = new FileInputStream("C:/test.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            int rowindex=0;
            int columnindex=0;
            //시트 수 (첫번째에만 존재하므로 0을 준다)
            //만약 각 시트를 읽기위해서는 FOR문을 한번더 돌려준다
            XSSFSheet sheet=workbook.getSheetAt(0);
            //행의 수
            int rows=sheet.getPhysicalNumberOfRows();
            for(rowindex=0;rowindex<rows;rowindex++){
                //행을읽는다
                XSSFRow row=sheet.getRow(rowindex);
                if(row !=null){
                    //셀의 수
                    int cells=row.getPhysicalNumberOfCells();
                    for(columnindex=0; columnindex<=cells; columnindex++){
                        //셀값을 읽는다
                        XSSFCell cell=row.getCell(columnindex);
//                        String value="";
                        //셀이 빈값일경우를 위한 널체크
                        if(cell==null) continue;
                        else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
                        	if(columnindex == 3) break;
                        	arr[columnindex] = (int)cell.getNumericCellValue();
                        }else break;
                            //타입별로 내용 읽기
//                            switch (cell.getCellType()){
//                            case XSSFCell.CELL_TYPE_FORMULA:
//                                value=cell.getCellFormula();
//                                break;
//                            case XSSFCell.CELL_TYPE_NUMERIC:
//                                value=cell.getNumericCellValue()+"";
//                                break;
//                            case XSSFCell.CELL_TYPE_STRING:
//                                value=cell.getStringCellValue()+"";
//                                break;
//                            case XSSFCell.CELL_TYPE_BLANK:
//                                value=cell.getBooleanCellValue()+"";
//                                break;
//                            case XSSFCell.CELL_TYPE_ERROR:
//                                value=cell.getErrorCellValue()+"";
//                                break;
//                            }
//                       System.out.println(rowindex+"번 행 : "+columnindex+"번 열 값은: "+value);
                    }
                }
            }
 
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("중간값은 :  " + getMed(arr[0],arr[1],arr[2]) + " 입니다");
	}

	private static int getMed(int a, int b, int c) {
		// TODO Auto-generated method stub
		int med;
		if(a >= b) {
			if(b >= c) med = b;
			else if(a >= c) med = c;
			else med = a;
		}
		else if(a > c) med = a;
		else if(c > b) med = b;
		else med = c;
		return med;
	}
	
	public void readingFromExcel() {
		try {
			//open the file from a given location
			FileInputStream file = new FileInputStream(new File("C:\\Users\\82104\\Downloads/dataupload.xlsx"));
			Workbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0);
			
			Map<Integer, List<String>> data = new HashMap<>();
			int i = 0;
			for (Row row : sheet) {
				data.put(i, new ArrayList<String>());
				for (Cell cell : row) {
					switch (cell.getCellType()) {
					case XSSFCell.CELL_TYPE_STRING: 
						data.get(new Integer(i)).add(cell.getRichStringCellValue().getString()); 
						break;
					case XSSFCell.CELL_TYPE_NUMERIC: 
						if (DateUtil.isCellDateFormatted(cell)) {
					    data.get(i).add(cell.getDateCellValue() + "");
						} else {
						    data.get(i).add(cell.getNumericCellValue() + "");
						} 
						break;
					case XSSFCell.CELL_TYPE_BOOLEAN: data.get(i).add(cell.getBooleanCellValue() + ""); break;
					case XSSFCell.CELL_TYPE_FORMULA: data.get(i).add(cell.getCellFormula() + ""); break;
					default: data.get(new Integer(i)).add(" ");
					}
				}
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void writingToExcel() {
//		create a method that writes a list of persons to a sheet titled “Persons”. 
//		First, we will create and style a header row that contains “Name” and “Age” cells:
		Workbook workbook = new XSSFWorkbook();
		 
		Sheet sheet = workbook.createSheet("Persons");
		sheet.setColumnWidth(0, 6000);
		sheet.setColumnWidth(1, 4000);
		 
		Row header = sheet.createRow(0);
		 
		CellStyle headerStyle = workbook.createCellStyle();
		headerStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
//		headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		 
		XSSFFont font = ((XSSFWorkbook) workbook).createFont();
		font.setFontName("Arial");
		font.setFontHeightInPoints((short) 16);
		font.setBold(true);
		headerStyle.setFont(font);
		 
		Cell headerCell = header.createCell(0);
		headerCell.setCellValue("Name");
		headerCell.setCellStyle(headerStyle);
		 
		headerCell = header.createCell(1);
		headerCell.setCellValue("Age");
		headerCell.setCellStyle(headerStyle);
		
//	Next, let's write the content of the table with a different style:	
		CellStyle style = workbook.createCellStyle();
		style.setWrapText(true);
		 
		Row row = sheet.createRow(2);
		Cell cell = row.createCell(0);
		cell.setCellValue("John Smith");
		cell.setCellStyle(style);
		 
		cell = row.createCell(1);
		cell.setCellValue(20);
		cell.setCellStyle(style);
		
//	Finally, let's write the content to a ‘temp.xlsx' file in the current directory and close the workbook:	 
		File currDir = new File(".");
		String path = currDir.getAbsolutePath();
		String fileLocation = path.substring(0, path.length() - 1) + "temp.xlsx";
		FileOutputStream outputStream;
		try {
			outputStream = new FileOutputStream(fileLocation);
			workbook.write(outputStream);
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}