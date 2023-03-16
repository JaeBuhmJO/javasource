package lang;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}

	// 자손 toString() : 인스턴스에 대한 정보를 문자열로 제공하는 목적으로 사용
	@Override
	public String toString() {
		return "Value [value=" + value + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// Object obj = value2
		// instanceof : 특정 객체의 인스턴스인지 확인
		// obj가 Value객체의 인스턴스냐
		if (obj instanceof Value) {
			Value v = (Value) obj;
			// obj 를 Value로 강제 형변환

			if (this.value == v.value) {
				return true;
			}
		}
		return false;
	}

}
