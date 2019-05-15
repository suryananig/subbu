package tests;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class CrossBrowser
{

	public static void main(String[] args) throws InterruptedException 
	{
		// get browser name from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String x=sc.nextLine();
		WebDriver driver;
		if(x.equals("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		else if(x.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			OperaOptions oo=new OperaOptions();
			oo.setBinary("C:\\Users\\srigowtham\\AppData\\Local\\Programs\\Opera\\56.0.3051.99_0\\opera.exe");
			System.setProperty("webdriver.opera.driver","E:\\selenium\\operadriver_win64\\operadriver.exe");
			driver=new OperaDriver(oo);
		}
		//launch site
		driver.get("http://www.gmail.com");
		Thread.sleep(2000);
		driver.close();
	}
}
