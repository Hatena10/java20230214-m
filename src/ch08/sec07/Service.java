package ch08.sec07;

public interface Service {
	default void default Method1() {
		System.out.println("defaultMethod1 중속 코드");
		defaultCommon();
	}
}
