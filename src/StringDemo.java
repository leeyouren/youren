
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = "world";
		
		// == check memory location
		if(s1.equals(s2)) {
			System.out.println("Both are equal");		
		}
		else {
			System.out.println("Both are different");	
		}
		
			System.out.println("----------------");	
			
			System.out.println("concat: " + s1.concat(s3));
			System.out.println("toUpperCase: " +s1.toUpperCase());
			System.out.println("toLowerCase: " +s1.toLowerCase());
			System.out.println("length: " +s1.length());
			System.out.println("indexOf: " +s1.indexOf('l'));
			System.out.println("lastIndexOf: " +s1.lastIndexOf('l'));
			System.out.println("substring: " +s1.substring(1));
			System.out.println("substring: " +s1.substring(1, 4));

		//s1 = s1 + s2;
		//System.out.println(s1);
		
	}

}
