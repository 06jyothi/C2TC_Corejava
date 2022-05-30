package corejava_package;

public class finalvariable {
final int speedlimit=90;//final variable
void run() {
	speedlimit=500;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
finalvariable obj=new finalvariable();
obj.run();
	}

}
