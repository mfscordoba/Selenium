
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Pedro
 */
public class TestEjemplo {
    WebDriver driver;
    public TestEjemplo() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    @BeforeAll
    public static void setUpClass() {
    }
    @AfterAll
    public static void tearDownClass() {
    }
    @BeforeEach
    public void setUp() {
    }
    @AfterEach
    public void tearDown() {
        this.driver.quit();
    }
     @Test
    @DisplayName("Testeo del login")
    public void testBoton() {
        String atributo;
        this.driver.get("http://localhost:4200");
        driver.findElement(By.id("usuario")).sendKeys("Antonio");
        driver.findElement(By.id("clave")).sendKeys("secreto");
        atributo = driver.findElement(By.id("btnentrar")).getAttribute("disabled");
        assertEquals(atributo, null, "Se activa el botón");
        driver.close();
    }
}
