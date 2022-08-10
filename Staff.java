
public abstract class Staff {
	
 protected int codenv;
 protected int agenv;
 protected int ngaynghiphep;
 protected String namenv;
 protected String bplamviec;
 protected double ngayvaolam;
 protected double hsluong;

 public Staff() {}

public Staff(int codenv, int agenv, int ngaynghiphep, String namenv, String bplamviec, double ngayvaolam,
		double hsluong) {
	this.codenv = codenv;
	this.agenv = agenv;
	this.ngaynghiphep = ngaynghiphep;
	this.namenv = namenv;
	this.bplamviec = bplamviec;
	this.ngayvaolam = ngayvaolam;
	this.hsluong = hsluong;
}



public int getCodenv() {
	return codenv;
}



public void setCodenv(int codenv) {
	this.codenv = codenv;
}



public int getAgenv() {
	return agenv;
}



public void setAgenv(int agenv) {
	this.agenv = agenv;
}



public int getNgaynghiphep() {
	return ngaynghiphep;
}



public void setNgaynghiphep(int ngaynghiphep) {
	this.ngaynghiphep = ngaynghiphep;
}



public String getNamenv() {
	return namenv;
}



public void setNamenv(String namenv) {
	this.namenv = namenv;
}



public String getBplamviec() {
	return bplamviec;
}



public void setBplamviec(String bplamviec) {
	this.bplamviec = bplamviec;
}



public double getNgayvaolam() {
	return ngayvaolam;
}



public void setNgayvaolam(double ngayvaolam) {
	this.ngayvaolam = ngayvaolam;
}



public double getHsluong() {
	return hsluong;
}



public void setHsluong(double hsluong) {
	this.hsluong = hsluong;
}



public abstract void displayInformation();



}



	
