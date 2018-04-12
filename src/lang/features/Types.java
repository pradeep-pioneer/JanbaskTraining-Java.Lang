package lang.features;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Types {
	public static void main(String[] args) {
		//String testVal = new String("test");
		/*String testVal = "test";
		testVal = "new Test";
		Class classObject = (testVal).getClass();
		Class mathClass = Math.class.getClass();
		try {
			Class stringClass = Class.forName("java.lang.String");
			System.out.println("Type Name:(pos2) " + stringClass.getPackage());
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Type Name: " + classObject.getName());
		System.out.println("Type Name: " + mathClass.getName());
		
		stringChronicles();
		
		Boolean b = true;
		b.getClass();
		
		Object[] items = new Object[3];
		Integer ints[] = new Integer[2];
		items[0] = 1;
		items[1] = true;
		items[2] = "Test";
		
		int first = (Integer)items[0];*/
		stringBuilderExample();
	}
	
	static void stringChronicles() {
		String bigString = "Gets the package for this class. The class loader of this class is used to find the package.";
		String allUpper = bigString.toUpperCase();
		String allLower = bigString.toLowerCase();
		String partial = bigString.substring(5, 8);
		System.out.println(bigString);
		System.out.println(allUpper);
		System.out.println(allLower);
		System.out.println(partial);
		String garbageFilled = "     someValue      ";
		String garbageCleaned = garbageFilled.trim();
		System.out.println("Garbage cleaned value: " + garbageCleaned);
		String name = "Pradeep Singh";
		String parts[] = name.split(" ");
		String firstName = parts[0];
		String lastName = parts[1];
		
		System.out.println(firstName);
		System.out.println(lastName);
	}
	
	static void stringBuilderExample() {
		StringBuilder builder = new StringBuilder();
		LocalDateTime time = LocalDateTime.now();
		String dateString = time.toString();
		builder.append("Today is: " + dateString + "\n");
		Month month = time.getMonth();
		String monthName = month.getDisplayName(TextStyle.FULL, Locale.US);
		builder.append("Month Name is: " + monthName + "\n");
		System.out.println(builder);
	}
	
	static void stringBufferExample() {
		StringBuffer builder = new StringBuffer();
		LocalDateTime time = LocalDateTime.now();
		String dateString = time.toString();
		builder.append("Today is: " + dateString + "\n");
		Month month = time.getMonth();
		String monthName = month.getDisplayName(TextStyle.FULL, Locale.US);
		builder.append("Month Name is: " + monthName + "\n");
		System.out.println(builder);
	}
}
