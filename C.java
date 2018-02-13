
public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		for(int i=0;i<100;i++){
			new Thread(a).start();
		}
	}

}
