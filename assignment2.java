package LinkedListCoding;

public class WrapperClassConvert {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("After converting into wrapper object: " + convertToWrapper(a));
	}

	public static Object convertToWrapper(Object value) {

		Class valueCl = value.getClass();

		if (value == null || valueCl.isPrimitive()) {
			System.out.println("Give proper primitive as input");
		}

		Integer aObj = Integer.valueOf((int) value);

		if (aObj instanceof Integer) {
			return aObj;
		} else {
			System.out.println("Give proper primitive as input");
		}

		return aObj;

	}
}
