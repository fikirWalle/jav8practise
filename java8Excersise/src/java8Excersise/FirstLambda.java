package java8Excersise;

public class FirstLambda {

	
	public void greeting(myLambda my) {
		my.foo();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myLambda mylambdaExpression=()->System.out.println("Hello Java 8");
		FirstLambda f=new FirstLambda();
		//f.greeting(mylambdaExpression);
		
	     mylambdaExpression.foo();
	     
	     Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				System.out.println("hello java ");
				
			}
		});
	     t.run();
	     Thread mytread= new Thread( ()->System.out.println("hello thread"));
	     
	     mytread.run();
	}
	
	

}

interface myLambda{
	
	
	  void foo();
	
}
