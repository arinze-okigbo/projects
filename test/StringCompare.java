class StringCompare{
	public static void main(String [] args){

		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println (s1);
		System.out.println (s2);

		System.out.println (s1 == s2);
		System.out.println (s1.compareTo(s2));
	}
}
x