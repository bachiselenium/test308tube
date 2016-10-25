package sikuliDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DesktopAutomate {

	public static void main(String[] args) throws Exception{
		
		//For Desktop
		/*Screen screen = new Screen();
		Pattern pattern = new Pattern("C:/Users/bhaskar/Desktop/SikuliImgs/Image1.PNG");
		//screen.click(pattern);
		//screen.doubleClick(pattern);
		screen.rightClick(pattern);*/
		
		
		//web application
		Screen screen = new Screen();
		Pattern img1 = new Pattern("C:/Users/bhaskar/Desktop/SikuliImgs/uname.PNG");
		Pattern img2 = new Pattern("C:/Users/bhaskar/Desktop/SikuliImgs/psswd.PNG");
		Pattern img3 = new Pattern("C:/Users/bhaskar/Desktop/SikuliImgs/login.PNG");
				
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php");
		
		screen.wait(img1, 10);
		
		screen.type(img1, "litratureweb");
		screen.type(img2, "vijaya50");
		screen.click(img3);
	
		
	}

}
