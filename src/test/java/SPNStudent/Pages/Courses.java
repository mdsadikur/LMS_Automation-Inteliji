package SPNStudent.Pages;

import SPNStudent.Util.BaseSPN;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Courses extends BaseSPN {

    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement checkoutBtn;

    @FindBy(xpath = "//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div[2]/div[1]/a[1]/div[1]/div[2]/span[1]/span[1]")
    WebElement textElement;

    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div/div[1]/a[1]/div[1]/div[1]")
    WebElement eachCourseSection;


    public Courses(){
        PageFactory.initElements(driver, this);
    }

    public void coursePurchase(int i){
        driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/div[1]/div[1]/a[1]")).click();
        checkoutBtn.isDisplayed();
        checkoutBtn.click();

    }

    public Courses clickAddCartBtn(){

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scroll(0,700)");

        int i=2;
        int size= driver.findElements(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div/div[1]/a[1]/div[1]/div[1]")).size();
        System.out.println(size);

        while (i<=size+1){

            int size2 = driver.findElements(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/a[1]/div[1]/div[1]")).size();
            System.out.println(size2);

            if (size2==1){

                String text = driver.findElement(By.xpath("//body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div["+i+"]/div[1]/a[1]/div[1]/div[2]/span[1]/span[1]")).getText();
                System.out.println(text);

                if (text.equals("Free")){

                    driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div/duv/div["+i+"]/div/div/div[1]/a")).click();
                }

                else {
                    coursePurchase(i);

                }
                break;

            }

        }









//        addCartBtn.isDisplayed();
//        Dimension size = addCartBtn.getSize();
//        System.out.println(size);
//        int i = 1;
//        Dimension size2 = driver.findElement(By.xpath("//body/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/duv[1]/div[i]/div[1]/a")).getSize();
//        System.out.println(size2);
//        if (addCartBtn.isDisplayed()) {
//            addCartBtn.click();
//
////            if ()
//        }
//
//        else {
//            return this;
//        }
        return this;
    }
}
