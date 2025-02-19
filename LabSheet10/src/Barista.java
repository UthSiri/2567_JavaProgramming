
public class Barista {
private String name;
private char gender;

public Barista(String name,char gender) {
	this.name = name;
	this.gender = gender;
}

public String getNameGender() {
	if (gender == 'M') 		return "Male";
	if (gender == 'F')		return "Female";
	return " ";
}
public String getName() {
	return name;
}
}
