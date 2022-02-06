
public class TestMain {

	public static void main(String[] args) {
		// obj from the child class implementation
		
		Sample sa=new  SampleInterface();
		//inline implementation

		Sample sa1=new Sample() {
			
			@Override
			public void sub() {
			
				
			}
			
			@Override
			public void add(int a, int b) {
				
				
			}
		};
	
		

	}

}
