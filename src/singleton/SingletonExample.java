package singleton;

class SingletonEager {
	private static SingletonEager instance = new SingletonEager();

	private SingletonEager() {}

	public static  SingletonEager getInstance() {
		System.out.println("SingletonEager object => "+instance);
		return instance;
	}
}

class Singleton{
	private static Singleton instance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		
		if(instance == null)
			instance = new Singleton();
		
		System.out.println("Singleton object => "+instance);
		return instance;
	}
}

class SingletonSynchronizeMethod{
	private static SingletonSynchronizeMethod instance;
	
	private SingletonSynchronizeMethod() {}
	
	public static synchronized SingletonSynchronizeMethod getInstance() {
		if(instance == null)
			instance = new SingletonSynchronizeMethod();
		
		System.out.println("Singleton synchronised object => "+instance);
		return instance;
	}
}

class SingletonSynchronize{
	private static SingletonSynchronize instance;
	
	private SingletonSynchronize() {}
	
	public static synchronized SingletonSynchronize getInstance() {
		if(instance == null) {
			synchronized (SingletonSynchronize.class) {
				instance = new SingletonSynchronize();
			}
		}
		
		System.out.println("Singleton synchronised object => "+instance);
		return instance;
		
	}
}

public class SingletonExample {

	public static void main (String arg[]) {
		
		// SingletonEager
		SingletonEager.getInstance();
		SingletonEager.getInstance();
		//Singleton 
		Singleton.getInstance();
		Singleton.getInstance();
		// threadSafe method
		SingletonSynchronizeMethod.getInstance();
		SingletonSynchronizeMethod.getInstance();
		// thread safe block
		SingletonSynchronize.getInstance();
		SingletonSynchronize.getInstance();
		

	}

}
