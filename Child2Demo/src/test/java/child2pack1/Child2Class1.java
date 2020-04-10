package child2pack1;

import org.testng.annotations.Test;

import child1pack1.Child1Class1;

public class Child2Class1 {
	
	@Test
	public void method1(){
		Child1Class1 c1 = new Child1Class1();
		c1.child1Method1("Chrome");
		if(c1 != null)
			c1.driver.quit();
	}
	
}
