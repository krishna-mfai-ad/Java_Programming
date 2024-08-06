package practices;

public class printclass {
	public static void main(String[] args) {
		System.out.println("Krishna'Eclipse");
		printclass o = new printclass();
		o.details();
		o.phone();
	}

	public void details() {
		System.out.println("details method!");
	}

	public void phone() {
		System.out.println("Mobile Method");
	}

}
