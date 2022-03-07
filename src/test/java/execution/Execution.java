package execution;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Execution extends Base {
	public static Execution bo = new Execution();
	
	@Given("user entering Adactin and logging")
	public void user_entering_Adactin() throws InterruptedException {
		bo.browserlaunch();
		bo.getURL("https://adactinhotelapp.com/");
		bo.typed(By.xpath("//input[@type='text']"),"Sureshsurya");
		bo.typed(By.xpath("//input[@type='password']"),"Suresh123");
		bo.Click(By.xpath("//input[@type='Submit']"));
		
		
		bo.Click(By.xpath("//select[@name='location']"));
		bo.Click(By.xpath("//option[@value='Melbourne']"));
		bo.Click(By.xpath("//select[@name='hotels']"));
		bo.Click(By.xpath("//option[@value='Hotel Sunshine']"));
		bo.Click(By.xpath("//select[@name='room_type']"));
		bo.Click(By.xpath("//option[@value='Standard']"));
		bo.Click(By.xpath("//select[@name='room_nos']"));
		bo.Click(By.xpath("//*[@id=\"room_nos\"]/option[3]"));
		
		bo.Click(By.xpath("//input[@name='datepick_in']"));
		bo.typed(By.xpath("//input[@name='datepick_in']"), "10/03/2022");
		bo.Click(By.xpath("//input[@name='datepick_out']"));
		bo.typed(By.xpath("//input[@name='datepick_in']"), "10/03/2022");
		
		bo.Click(By.xpath("//select[@name='adult_room']"));
		bo.Click(By.xpath("//*[@id=\"adult_room\"]/option[2]"));
		bo.Click(By.xpath("//select[@name='child_room']"));
		bo.Click(By.xpath("//*[@id=\"child_room\"]/option[2]"));
		bo.Click(By.xpath("//input[@type='submit']"));
		
		bo.Click(By.xpath("//*[@id=\"radiobutton_0\"]"));
		bo.Click(By.xpath("//*[@id=\"continue\"]"));
		
		bo.typed(By.xpath("//*[@id=\"first_name\"]"), "Suresh");
		bo.typed(By.xpath("//*[@id=\"last_name\"]"), "Surya");
		bo.typed(By.xpath("//*[@id=\"address\"]"), "3718 Lincoln Way,Ames,Idaho,50014");
		bo.typed(By.xpath("//*[@id=\"cc_num\"]"), "4506 6580 4425 1441");
		bo.Click(By.xpath("//*[@id=\"cc_type\"]"));
		bo.Click(By.xpath("//*[@id=\"cc_type\"]/option[3]"));
		bo.Click(By.xpath("//*[@id=\"cc_exp_month\"]"));
		bo.Click(By.xpath("//*[@id=\"cc_exp_month\"]/option[4]"));
		bo.Click(By.xpath("//*[@id=\"cc_exp_year\"]"));
		bo.Click(By.xpath("//*[@id=\"cc_exp_year\"]/option[13]"));
		bo.typed(By.xpath("//*[@id=\"cc_cvv\"]"), "212");
		bo.Click(By.xpath("//*[@id=\"book_now\"]"));
		Thread.sleep(7000);
		String str = bo.gettext(By.xpath("//*[@id=\"order_no\"]"));
		System.out.println("Your order ID is ="+str);
		
		
//		String str = bo.gettext(By.xpath("//input[@name='order_no']"));
//		System.out.println("Your order ID is ="+str);
	}	

	@When("Steps to do")
	public void steps_to_do() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Some steps")
	public void some_steps() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Ssuresh final")
	public void ssuresh_final() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
