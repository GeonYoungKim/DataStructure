package lambda;

interface Say {
	int something();
}


class Person{
	public void greeting(Say line) {
		int a=line.something();
		System.out.println("Number is "+a);
	}
}

public class LambdaMain {
	public static void main(String[] args) {
		
		Person p=new Person();
		p.greeting(new Say() {
			@Override
			public int something() {
				System.out.println("김건영");
				System.out.println("Nice to meet you");
				return 8;
				
			}
		});
		
		System.out.println("================================");
		
		p.greeting(() -> {
			System.out.println("김건영");
			System.out.println("Nice to meet you");
			return 7;
		});
		
	}

}
