package practice_POJO_SerDes;

public class EmployeeDetails {

		//Step 1: declare all the Variable globally
		String Name;
		int Phone;
		String EmpID;
		String Email;
		boolean isEmployed;
		
		//Step 2: Create a constructor to initialize the Variable
		public EmployeeDetails(String name, int phone, String empID, String email, boolean isEmployed) {
			this.Name = name;
			this.Phone = phone;
			this.EmpID = empID;
			this.Email = email;
			this.isEmployed = isEmployed;
		}
		public EmployeeDetails()
		{
			
		}
		//Step 3: provide getters and setters

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getPhone() {
			return Phone;
		}

		public void setPhone(int phone) {
			Phone = phone;
		}

		public String getEmpID() {
			return EmpID;
		}

		public void setEmpID(String empID) {
			EmpID = empID;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public boolean isEmployed() {
			return isEmployed;
		}

		public void setEmployed(boolean isEmployed) {
			this.isEmployed = isEmployed;
		}
		
		
		

	}


