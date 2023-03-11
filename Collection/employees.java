package Collection;

public class employees {
private String name;
private int empid;
private int empsa;
public employees(String name, int empid, int empsa){
	this.name=name;
	this.empid=empid;
	this.empsa=empsa;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getEmpsa() {
	return empsa;
}
public void setEmpsa(int empsa) {
	this.empsa = empsa;
}
public String toSting() {
	return name+""+empid+""+empsa;
}
}
