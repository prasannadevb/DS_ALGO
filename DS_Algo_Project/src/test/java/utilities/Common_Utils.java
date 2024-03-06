package utilities;

import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constants.Constants;



public class Common_Utils {
	

	private static Common_Utils Common_UtilsInstance= null;

	//Config file loader
	public void loadProperties() {

		Properties properties=null;
		try {
			System.out.println("Inside try");
			if(properties==null) {
				properties = new Properties();
				System.out.println("properties object created");
				properties.load(getClass().getResourceAsStream("/config.properties"));
				System.out.println("after load");
				Constants.URL=properties.getProperty("GET_STARTED_URL");
				Constants.BROWSER=	properties.getProperty("BROWSER");
				Constants.HOMEPAGE=	properties.getProperty("HOMEPAGE_URL");
				Constants.LOGINPAGE= properties.getProperty("LOGINPAGE_URL");
				Constants.USERNAME= properties.getProperty("USERNAME");
				Constants.PASSWORD= properties.getProperty("PASSWORD");
				Constants.ARRAYPAGE= properties.getProperty("ARRAYPAGE_URL");
				Constants.ARRAYSINPYTHON= properties.getProperty("ARRAYSINPYTHON_URL");
				Constants.EDITORBOX= properties.getProperty("EDITOR_URL");
				Constants.ARRAYSUSINGLIST= properties.getProperty("ARRAYSUSINGLIST_URL");
				Constants.BASICOPERATIONSINLISTS= properties.getProperty("BASICOPERATIONSINLISTS_URL");
				Constants.APPLICATIONSOFARRAY= properties.getProperty("APPLICATIONSOFARRAY_URL");
			    Constants.PRACTICEQUESTIONS= properties.getProperty("PRACTICEQUESTION_URL");
				Constants.PRACTICEQUESTION1= properties.getProperty("PRACTICEQUESTION1_URL");
				Constants.PRACTICEQUESTION2= properties.getProperty("PRACTICEQUESTION2_URL");
				Constants.PRACTICEQUESTION3= properties.getProperty("PRACTICEQUESTION3_URL");
				Constants.PRACTICEQUESTION4= properties.getProperty("PRACTICEQUESTION4_URL");
				
				
				
			
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		
		
		
		

	}
}


	

	
	
	 


	

