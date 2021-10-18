package seleniumbasicTest;

public class AmazonTest {

	public static void main(String[] args) {
		browserUtils br = new browserUtils();
		br.initDriver("chrome");
		br.launchUrl("https:www.amazon.com");
		String title = br.getPagetitle();
		System.out.println(title);
		System.out.println("get page url display :" + br.getPageUrl());
		br.quiteBrowser();
	}

}
