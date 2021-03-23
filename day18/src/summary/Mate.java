package summary;

// 인터페이스는 클래스의 한 종류
// 인터페이스는 추상클래스의 한 종류

public interface Mate {
	// public abstract
	String getName();
}
// public interface ServiceImpl { ... }
// public class MemberService implements ServiceImpl { ... }

// 인터페이스는 서로 다른 자료형을 묶어서 처리할 때 사용하거나
// 서로 다른 클래스의 기능 호출 방식을 지정하여 강제할 때 사용할 수 있다

// class Image extends File implements Serializable
// -> File 클래스를 상속하고, 직렬화 가능한 클래스 Image (파일 형식의 입출력이 가능한 클래스)

// class Timer implements Runnable
// -> 시간을 측정하기 위한 클래스 (다중 스레드 작업이 가능한 형태, 특성)