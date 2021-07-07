
public class hooks extends baseUtil{

		@Before

		Public void InitializeTest(){


		try{


		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(capabilities);

		}
		Catch(Exception e){
		e.printStackTrace();
		}


		}
}
