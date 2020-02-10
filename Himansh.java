package java_assign;

public final class Himansh {
	final String name;
	final String designation;

	public Himansh(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	  static class test{
		public static void main(String [] args) {
			Himansh hs = new Himansh("himanshu","developer");
			System.out.println(hs.getName());
			System.out.println(hs.getDesignation());
		}
	}
}
