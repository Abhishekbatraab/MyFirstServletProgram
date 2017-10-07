class ServletRep{
	//Heavy
	public void doGet(){
		System.out.println("do get call");
	}
	
	public void doPost(){
		System.out.println("do post call");
	}
	
	
}

class ServletThread implements Runnable{
	ServletRep rep;
	public ServletThread(ServletRep rep) {
		// TODO Auto-generated constructor stub
		this.rep = rep;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		rep.doGet();
		rep.doPost();
	}
	
}
public class MyServlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServletRep obj = new ServletRep();
		
		for(int i=0;i<=100000;i++){
			new Thread(new ServletThread(obj)).start();;
		}
		
	}

}
