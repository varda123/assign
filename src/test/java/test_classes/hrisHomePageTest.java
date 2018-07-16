package test_classes;
import initializer_classes.object_initailizer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hrisHomePageTest extends object_initailizer{
	@Test
public void testing_homePage()
{
		object_home();
		System.out.println("step 1");
		home.login("vardasaxena", "Varda@321#");
}
}
