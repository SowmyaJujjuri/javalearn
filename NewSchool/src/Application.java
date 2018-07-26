public class Application 
{
	public static void main(String[] args) 
	{
		Address a = new Address();
		a.addressLine1 = "17177 nw Tucson st.";
		a.city = "Beaverton";
		a.zipCode = "97006";
		a.country = "USA";
		
		Student s = new Student();
		s.name = "joe";
		s.grade = 8;
		s.age = 13;
		s.homeAddress = a;
		
		School sc1 = new School();
		sc1.enrollStudent(s);
	}

}
