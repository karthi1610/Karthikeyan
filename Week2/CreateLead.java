package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// URL Redirect
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login/");
		driver.manage().window().maximize();

		//Login page
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//Post login action
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestDay1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLN");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Local");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("DeptName");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing the description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@teamleaf.com");
		Select state = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Notes field");
		//driver.findElement(By.className("submitButton")).click();
		driver.findElement(By.xpath("//input[@value='Update']")).click();

		//getTitle
		String title = driver.getTitle();
		System.out.println("Title of the page is "+ title);

	}

}
