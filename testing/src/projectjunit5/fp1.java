package projectjunit5;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
public class fp1 {
  @Test
	void a()
	{
	  System.out.println("hi");
	}
  @Disabled
  void a2()
  {
	  System.out.println("hello");
  }
  @Test
  void a3()
  {
	  System.out.println("jyothi");
  }
}
