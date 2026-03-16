package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginSteps {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    @Given("browser is open")
    public void browser_is_open() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--remote-allow-origins=*");
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\IdeaProjects\\cucumberjavaproject\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");


    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("User is on Google page");
    }

    @Given("hits enter")
    public void hits_enter() {
        System.out.println("Enter pressed");
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Navigated to results");
    }
}
