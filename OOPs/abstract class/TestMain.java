
public class TestMain {

	public static void main(String[] args) {
		
		//obj from child class
		AbstractClass ab=new ChildSample();
		
		//inline implementation of unimplemented 
		AbstractClass ab=new AbstractClass() {
			
			@Override
			public void add(int a, int b) {
				
				return a+b;
			}
		};
	
		

	}

}
