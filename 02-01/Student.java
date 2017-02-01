/**
 * @citation    Original file retrieved from:
 *              http://www.cs.grinnell.edu/~osera/courses/csc207/17sp/readings/02-object-oriented-modeling.pdf
 * @editor      Yimin Wu <wuyimin17@grinnell.edu>
 * @update      enhanced privacy and documented Javadoc comments
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private int id;
	private int age;

	/**
	 * @param  firstName: a string of the student's first name;
	 * @param  lastName: a string of the student's last name;
	 * @param  id: an integer of the student's id;
	 * @param  age: an integer of the studnet's age;
	 * @this is the constructor of the class.
	 */
	public Student (String firstName, String lastName, int id, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}

	/**
	 * @param  field: a string of the field to be reset;
	 * @param  value: a string of the value to be put into the target field;
	 * @this is the setter method of the class.
	 */
	public void setter (String field, String value) {
		if (field.equalsIgnoreCase("firstName")){
			this.firstName = value;
		} else if (field.equalsIgnoreCase("lastName")){
			this.lastName = value;
		} else if (field.equalsIgnoreCase("id")){
			this.id = Integer.parseInt(value);
		} else if (field.equalsIgnoreCase("age")){
			this.age = Integer.parseInt(value);
		} else {
			System.out.println("Unknown field!");
		}
	}

	/**
	 * @param  field: a string of the field to be fetched;
	 * @return the value of the target field.
	 */
	public String getter (String field) {
		if (field.equalsIgnoreCase("firstName")){
			return this.firstName;
		} else if (field.equalsIgnoreCase("lastName")){
			return this.lastName;
		} else if (field.equalsIgnoreCase("id")){
			return Integer.toString(this.id);
		} else if (field.equalsIgnoreCase("age")){
			return Integer.toString(this.age);
		} else {
			System.out.println("Unknown field!");
			return null;
		}
	}

	/**
	 * @this is my own testing of the functionality of the class.
	 */
	public static void main(String[] args) {
		Student s1 = new Student("Yimin", "Wu", 0, 0);
		s1.setter("id", "541567");
		s1.setter("age", "23");
		s1.setter("IQ", "0");
		System.out.println(s1.getter("firstname")+" "+s1.getter("lastname")
				+" ("+s1.getter("id")+") "+"is "+s1.getter("age")+" years old.");
		// TODO Auto-generated method stub
	}
	
}
