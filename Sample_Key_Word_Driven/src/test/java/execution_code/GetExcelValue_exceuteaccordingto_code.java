package execution_code;

import java.io.IOException;

import com.ActinsKeywords.Action_KeyWords;
import com.Utilities.Excel_Utilities1;



public class GetExcelValue_exceuteaccordingto_code {
public static void main(String[] args) throws IOException {
Excel_Utilities1 utilities = new Excel_Utilities1();
		utilities.readExcelFile("C:\\Users\\gokul\\workspace\\Sample_Key_Word_Driven\\testcases.xlsx");
		for(int row=1; row<=5;row++){
		String keyword = utilities.getvalueFromExcel(row, 3);
		if(keyword.equalsIgnoreCase("openBrowser")){
			Action_KeyWords.openBrowser();
		}else if (keyword.equalsIgnoreCase("gotourl")){
			Action_KeyWords.goToUrl();
		}
		else if (keyword.equalsIgnoreCase("enterusername")){
			Action_KeyWords.enterUserName();
		}
		else if (keyword.equalsIgnoreCase("enterpassword")){
			Action_KeyWords.enterPassword();
		}
		else if (keyword.equalsIgnoreCase("clicklogin")){
			Action_KeyWords.clickLogin();;
		}
		
	}
}
	}


