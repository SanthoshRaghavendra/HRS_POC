package com.hrs.test;

import org.testng.annotations.Test;
import com.business.hrs.HRSBusinessLogic;
import com.driverInstance.DriverManager;
import com.hrs.Androidpages.LoginPage;
import com.utility.ExtentReporter;
import static com.utility.Utilities.*;

public class Homepage extends BaseTest{

	
	/***
	 * @throws Exception
	 * @Function Name : verifyhomePage()
	 * @Description :Validating general display of PCM 'Home' screen
	 * @Return : N/A
	 * @Date : June, 21, 2023
	 * @Author : Pratima
	 */
	
	@Test(priority = 0)
	public void verifyhomePage() throws Exception {
		
		ExtentReporter.HeaderChildNode("[T2894780]");
		try {
			HRSBusinessLogic.verifyLoginPage();
			HRSBusinessLogic.verificationOfHomePageModules();
			logger.info("T2894780 Validating general display of PCM 'Home' screen.");
			ExtentReporter.extentLoggerPass("Pass","T2894780 Validating general display of PCM 'Home' screen.");
		} catch (AssertionError e) {
			logger.error("T2894780 Validating general display of PCM 'Home' screen.");
			ExtentReporter.extentLoggerFail("Fail", "T2894780 Validating general display of PCM 'Home' screen.");
			throw e;
		} finally {
			softAssert.assertAll();
		}
	}
	

	/***
	 * @throws Exception
	 * @Function Name : verifyContactClinicianMessageOption()
	 * @Description : Validate the UI elements displayed inside the PCM 'Message' modal. 
	 * @Return : N/A
	 * @Date : June, 24, 2023
	 * @Author : Pratima
	 */
	@Test(dependsOnMethods = "verifyhomePage")
	public void verifyContactClinicianMessageOption() throws Exception {
		ExtentReporter.HeaderChildNode("T2967740");
		try {
		//	HRSBusinessLogic.verifyLoginPage();
			HRSBusinessLogic.verifySendMessageOption(prop.getproperty("SMSMob"),prop.getproperty("SMSWeb"));
			
			logger.info("T2967740 Validate the UI elements displayed inside the PCM 'Message' modal. .");
			ExtentReporter.extentLoggerPass("Pass","Validate the UI elements displayed inside the PCM 'Message' modal.");
		} catch (AssertionError e) {
			logger.error("T2967740 Validate the UI elements displayed inside the PCM 'Message' modal. ");
			ExtentReporter.extentLoggerFail("Fail", "Validate the UI elements displayed inside the PCM 'Message' modal.");
			throw e;
		} finally {
			softAssert.assertAll();
		}
	}

	/***
	 * @throws Exception
	 * @Function Name :verifyBloodPressure()
	 * @Description :Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission
	 * @Return : N/A
	 * @Date : June, 22, 2023
	 * @Author : Pratima
	 */
	@Test(priority = 1)
	public void verifyBloodPressure() throws Exception {
		ExtentReporter.HeaderChildNode("T2895318");
		try {
			
			//HRSBusinessLogic.verifyLoginPage();
			
			HRSBusinessLogic.recordBloodPressure(prop.getproperty("Systolic_value"),prop.getproperty("Diastolic_value"),prop.getproperty("Heartrate_value"));
			logger.info("T2895318 Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission");
			ExtentReporter.extentLoggerPass("Pass","Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission");
		} catch (AssertionError e) {
			logger.error("T2895318 Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission");
			ExtentReporter.extentLoggerFail("Fail", "Validate that patient is able to submit entry after entering valid values into all fields and that green check mark appears on home screen after submission");
			throw e;
		} finally {
			softAssert.assertAll();
		}
	}

	


}
