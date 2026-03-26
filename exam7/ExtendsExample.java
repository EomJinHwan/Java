package ch08.exam7;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl;
		ia.methodA();
		// ia.methodB(); // 사용 불가
		System.out.println();

		InterfaceB ib = impl;
		// ib.methodA(); // 사용 불가
		ib.methdoB();
		System.out.println();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methdoB();
		ic.methodC(); 
	}

}
