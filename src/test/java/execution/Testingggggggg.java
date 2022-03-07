package execution;

import org.openqa.selenium.By;

public class Testingggggggg extends Base {
public static void main(String[] args) {
	Execution sa = new Execution();
	
	sa.browserlaunch();
	sa.getURL("https://adactinhotelapp.com/SearchHotel.php");
	
	sa.Click(By.xpath("//select[@name='location']"));
	sa.Click(By.xpath("//option[@value='Melbourne']"));

}
}
