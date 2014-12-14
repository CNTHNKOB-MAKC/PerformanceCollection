package Wrapper;

public class ConstantPoolVSHeapEQUALS
	{
		public static void main(String[] args)
		{

			String st1 = "This string is going inside"; // Constant Pool

			String st2 = new String("This string is going inside"); // HEAP ,
																	// which
			// means
			// that st2
			// is not at
			// the same
			// location
			// as the
			// st1 and
			// are
			// LOCATION
			// is
			// different
			// but
			// content
			// is the
			// same

			String st3 = "This string is going inside"; // both st1 and st3 are
														// pointing to the same
														// object in Constant
														// pool
			String st4 = new String("This string is going inside"); // both st2
																	// and st3
																	// are
																	// pointing
																	// to the
																	// same
																	// object in
																	// the HEAP

			System.out.println(st1 == st2); // false

			System.out.println(st1 == st3); // true because in Constant pool,
											// constants with the same content
											// are pointing to the same
											// value/content/literal

			System.out.println(st2 == st4); // false , because on the heap each
											// object has its own place

			System.out.println(st1.equals(st2)); // true , because .EQUALS()
													// checks if the content is
													// the same/equals not the
													// plase of the memory of
													// the object

		}
	}
