
public class OverloadingMethondExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showName();
		showName("Yodyada");
		showName("Miss", "Yodyada");
		showName("Thai - Nichi", 3);
	}

	public static void showName() {
		System.out.println("Yodyada.S");
	}

	public static void showName(String name) {
		System.out.println(name);
	}

	public static void showName(String title, String name) {
		System.out.println(title + " " + name);
	}

	public static void showName(String name, int num) {
		for(int i = 1; i <= num; i++) {
			System.out.println(name);
		}
	}
}
