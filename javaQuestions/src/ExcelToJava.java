//https://huskdoll.tistory.com/890 
import java.io.FileInputStream;
 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
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
}