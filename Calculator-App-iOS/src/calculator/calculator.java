package calculator;

import com.setup.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calculator extends BaseClass {

    @Test
    public static void main(String[] args) {
    	
    	 IOSDriver<IOSElement> driver = cap();
    	 addition();
    	 substraction();
    	 multiplication();
    	 Dividition();
    	 
    	 
    	  @Test
    	  Run | Debug
    	 public void AdditionOperation(){
    	 
    	 driver.findElement(By.id(" Id of Enter the first Number ")).click();
    	 driver.findElement(By.id(" resource id of (+) ")).click();
    	 driver.findElement(By.id(" Id of Enter the second Number ")).click();
    	 driver.findElement(By.id(" resource id of = ")).click();
    	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	 driver.findElement(By.xpath("//TypeButton[@name=\"id of clear button \"]")).click();
    	 }
    	  @Test
    	  Run | Debug 
    	 public void SubtractionOperation(){
        	 
        	 driver.findElement(By.id(" Id of Enter the first Number ")).click();
        	 driver.findElement(By.id(" resource id of (-) ")).click();
        	 driver.findElement(By.id(" Id of Enter the second Number ")).click();
        	 driver.findElement(By.id(" resource id of = ")).click();
        	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//TypeButton[@name=\"id of clear button \"]")).click();
        	 }
    	  @Test
    	  Run | Debug
    	 public void MultiplicationOperation(){
        	 
        	 driver.findElement(By.id(" Id of Enter the first Number ")).click();
        	 driver.findElement(By.id(" resource id of (*) ")).click();
        	 driver.findElement(By.id(" Id of Enter the second Number ")).click();
        	 driver.findElement(By.id(" resource id of = ")).click();
        	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        	 driver.findElement(By.xpath("//TypeButton[@name=\"id of clear button \"]")).click();
        	 }
    	  @Test
    	  Run | Debug        
        public void DivisionOperation(){
       	 
       	 driver.findElement(By.id(" Id of Enter the first Number ")).click();
       	 driver.findElement(By.id(" resource id of "(%) ")).click();
       	 driver.findElement(By.id(" Id of Enter the second Number ")).click();
       	 driver.findElement(By.id(" resource id of = ")).click();
       	 driver.findElement(By.xpath("//TypeButton[@name=\"id of clear button \"]")).click();
       	 
       	 }
    	  @Test
    	  Run | Debug 
    	  public void Clearbuttonflow(){
    	       	 
    	       	 driver.findElement(By.id(" Id of Enter the first Number ")).click();
    	       	 driver.findElement(By.id(" resource id of "(+) ")).click();
    	       	 driver.findElement(By.id(" Id of Enter the second Number ")).click();
    	       	 driver.findElement(By.xpath("//TypeButton[@name=\"id of clear button \"]")).click();
    	         driver.navigate().back();
    	       	 }
               
    }     
}
