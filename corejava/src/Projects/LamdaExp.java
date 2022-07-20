package Projects;
@FunctionalInterface
interface Statement{
	public String greet();
}

public class LamdaExp {
	public static void main(String[] args) {
		Statement s=()->{return "Hello World";};
		System.out.println(s.greet());
		
		
	}

}
