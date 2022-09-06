package lambdas;

public class PrincipalConcurrente {

	public static void main(String[] args) {
		
		Thread t= new Thread(() -> adioses());
		t.start();
	}

	public static void adioses() {
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
				System.out.println("adios");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
