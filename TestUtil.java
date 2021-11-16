package seleniumAssignments;

public class TestUtil {

	static String fileName;

	public static void captureScreenshot() {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		TestUtil.captureScreenshot();
		
		System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+">Screenshot link</a>");
		System.out.print("<br>");
		System.out.print("<a target=\"_blank\" href="+TestUtil.fileName+"><img src="+TestUtil.fileName+" height=200 width=200></a>");
		
		
	}

		
	}


