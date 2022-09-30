package POJOLibraries;

public class ProjectLibrary {

	//Step 1: declare all the variable globally
			String createdBy;
			String projectName;
			String status;
			int teamSize;
			
    //Step 2: Create a constructor to initialize the variable	
			public ProjectLibrary(String createdBy, String projectName, String status, int teamSize) {
			
				this.createdBy = createdBy;
				this.projectName = projectName;
				this.status = status;
				this.teamSize = teamSize;
			}
     //Step 3: Provide getters and Setters		

			public String getCreatedBy() {
				return createdBy;
			}

			public void setCreatedBy(String createdBy) {
				this.createdBy = createdBy;
			}

			public String getProjectName() {
				return projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getStatus() {
				return status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public int getTeamSize() {
				return teamSize;
			}

			public void setTeamSize(int teamSize) {
				this.teamSize = teamSize;
			}
			
			
} 
