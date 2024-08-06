package practices;

class Associate {
	int id;
	String name;
	int experienceInYears;
	String technology;

	// Constructor-Parameterised
	public Associate(int id, String name, int experienceInYears, String technology) {
		this.id = id;
		this.name = name;
		this.experienceInYears = experienceInYears;
		this.technology = technology;
	}

	// Getter and Setter for id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Getter and Setter for name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter and Setter for experienceInYears
	public int getExperienceInYears() {
		return experienceInYears;
	}

	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}

	// Getter and Setter for technology
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
}

class Solution {
	public static Associate[] peopleForGivenTechnology(Associate[] associates, String searchTechnology) {
		int count = 0;

		// First pass to count the matching associates
		for (int i = 0; i < associates.length; i++) {
			if (associates[i].getTechnology().equalsIgnoreCase(searchTechnology)
					&& associates[i].getExperienceInYears() % 5 == 0) {
				count++;
			}
		}

		// Create the result array
		Associate[] result = new Associate[count];
		int index = 0;

		// Second pass to populate the result array
		for (int i = 0; i < associates.length; i++) {
			if (associates[i].getTechnology().equalsIgnoreCase(searchTechnology)
					&& associates[i].getExperienceInYears() % 5 == 0) {
				result[index++] = associates[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Associate[] associates = { new Associate(1, "Krishna", 5, "Java"), new Associate(2, "Johann", 10, "Java"),
				new Associate(3, "Somu", 3, "Python"), new Associate(4, "Hema", 7, "JavaScript"),
				new Associate(5, "Kishore", 15, "Java") };

		Associate[] result = peopleForGivenTechnology(associates, "Java");

		for (int i = 0; i < result.length; i++) {
			System.out.println("ID: " + result[i].getId() + ", Name: " + result[i].getName() + ", Experience: "
					+ result[i].getExperienceInYears() + " years, Technology: " + result[i].getTechnology());
		}
	}
}
