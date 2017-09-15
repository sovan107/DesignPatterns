package com.sovanm.designs.singleton;

class SingletonClass {

	// private static member
	private static SingletonClass instance;

	// private constructor to prevent instantiation
	private SingletonClass() {

	}

	// public method to create instance.
	public static SingletonClass getInstance() {

		if (null == instance) {
			synchronized (SingletonClass.class) {
				/**
				 * <b> Reason for double null checking (DCL - Double checking locking)
				 * This is used to optimized creation of singleton class instance. 
				 * 
				 * Lets say Thread T1 and T2 enters the FIRST if block (outside synchronization block)
				 * Then say T1 enters into the synchronization block and T2 enters into WAITING state, so
				 * T1 creates the instance and move out of the synchronization block hence completing its job. 
				 * Now T2 gets out from WAITING State and enters ACTIVE state to create another instance. 
				 * 
				 * Here the second check for null comes into play and stops creating a new instance.
				 * 
				 * 
				 * */
				if (null == instance) {
					instance = new SingletonClass();
				}
			}
		}
		
		return instance;
	}
	
	//Any public methods. 
	public void callingMethod(){
		System.out.println("Single ton class : " + this.hashCode());
	}
}

public class Singleton{
	public static void main(String[] args) {
		SingletonClass.getInstance().callingMethod();  // If singleton, returns same instance for all calls
		SingletonClass.getInstance().callingMethod();  // If not singleton, returns new instance for each calls.
		SingletonClass.getInstance().callingMethod();
		SingletonClass.getInstance().callingMethod();
		
		System.gc();
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finallzie");
		super.finalize();
	}
	
}

// singleton
//Single ton class : 14621846
//Single ton class : 14621846
//Single ton class : 14621846
//Single ton class : 14621846

// removing check. 
//Single ton class : 31168322
//Single ton class : 17225372
//Single ton class : 5433634
//Single ton class : 2430287
