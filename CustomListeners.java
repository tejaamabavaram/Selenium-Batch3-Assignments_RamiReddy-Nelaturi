
package seleniumAssignments;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author NelaturiR
 *
 */

/**
	 * @param Screen shot path
	 */
	public class CustomListeners implements ITestListener,  {

		public void onFinish(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onStart(ITestContext arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestFailure(ITestResult arg0) {

			System.setProperty("org.uncommons.reportng.escape-output", "false");
			try {
				TestUtil.captureScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+">Screenshot link</a>");
			System.out.print("<br>");
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+"><img src="+TestUtil.fileName+" height=200 width=200></a>");
			
			
		}

		public void onTestSkipped(ITestResult arg0) {
			
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			try {
				TestUtil.captureScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+">Screenshot link</a>");
			System.out.print("<br>");
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+"><img src="+TestUtil.fileName+" height=200 width=200></a>");
			
			
			
			
			
		}

		public void onTestStart(ITestResult arg0) {
			// TODO Auto-generated method stub
			
		}

		public void onTestSuccess(ITestResult arg0) {

			System.setProperty("org.uncommons.reportng.escape-output", "false");
			try {
				TestUtil.captureScreenshot();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+">Screenshot link</a>");
			System.out.print("<br>");
			System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+"><img src="+TestUtil.fileName+" height=200 width=200></a>");
			
			
		
		}


}
