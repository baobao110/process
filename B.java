
public class B implements Runnable {
	int i=10;
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		if(i>0){
			System.out.println(i);
			i--;
		}
		else{
			System.out.println("ÎÞÆ±");
		}
	}

}
