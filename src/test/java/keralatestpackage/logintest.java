package keralatestpackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import keralabasepackage.base;


public class logintest extends base {

    @Test(priority = 1)
    public void titleverificationmethod() {

        String actualtitle = loginobj.titlemethod();

        System.out.println(actualtitle);

        Assert.assertEquals(actualtitle, "Post your Property - Login | Keralaproperty");
    }

    @Test(priority = 2)
    public void loginvalidationmethod() {

        loginobj.LoginMethod("vgzmodox@gmail.com", "123456789");
    }
}