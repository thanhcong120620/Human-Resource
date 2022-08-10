import java.util.ArrayList;
import java.util.Scanner;

public class Employee extends Staff implements ICalculator {
	private double hlamthem;
	static String condition = "";
	private ArrayList<Employee> El;

	
	public Employee(int codenv, int agenv, int ngaynghiphep, String namenv, String bplamviec, double ngayvaolam,
			double hsluong, double hlamthem) {
		super(codenv, agenv, ngaynghiphep, namenv, bplamviec, ngayvaolam, hsluong);
		this.hlamthem = hlamthem;
		
	}
	


	public ArrayList<Employee> getEl() {
		return El;
	}
	public void setEl(ArrayList<Employee> El) {
		this.El = El;
	}

	public Employee() {
		
	}


	public double getHlamthem() {
		return hlamthem;
	}
	public void setHlamthem(double hlamthem) {
		this.hlamthem = hlamthem;
	}
	
	
	/*
	public static void inputemployee() {
		Scanner sce = new Scanner(System.in);
		do {
		System.out.println("Nhập mã số nhân viên: ");
		int msnv = sce.nextInt();
		System.out.println("Nhập tên nhân viên: ");
		String tennv = sce.nextLine();
		System.out.println("Nhập tuổi nhân viên: ");
		int tuoinv = sce.nextInt();
		System.out.println("Nhập bộ phận làm việc của nhân viên: ");
		String bplamviecnv = sce.nextLine();
		System.out.println("Nhập ngày vào làm của nhân viên: ");
		double ngayvaolamnv = sce.nextDouble();
		System.out.println("Nhập hệ số lương của nhân viên: ");
		double hsluongnv = sce.nextDouble();
		System.out.println("Nhập số ngày nghỉ phép: ");
		int ngaynghiphepnv = sce.nextInt();
		System.out.println("Nhập số giờ làm thêm của nhân viên: ");
		double hlamthemnv = sce.nextDouble();
		
		
		Employee El1 = new Employee(msnv, tuoinv, ngaynghiphepnv,tennv, bplamviecnv,ngayvaolamnv,hsluongnv,hlamthemnv);
		El.add(El1); 
	
		}while(condition.equalsIgnoreCase("Có")||condition.equalsIgnoreCase("Co")||
		condition.equalsIgnoreCase("C")||condition.equalsIgnoreCase("yes")||condition.equalsIgnoreCase("y"));
		
	}
	*/
	
	
	public void displayInformation() {
		//for(Employee El2:El) {
		System.out.println("Ma so nhan vien: "+ getCodenv());
		System.out.println("Tuoi: " + getAgenv());
		System.out.println("So ngay nghi phep: "+ getNgaynghiphep());
		System.out.println("Ten nhan vien: "+getNamenv());
		System.out.println("Bo phan lam viec: "+getBplamviec());
		System.out.println("Ngay vao lam: "+getNgayvaolam());
		System.out.println("He so luong: "+getHsluong());
		System.out.println("So gio lam them: "+getHlamthem());
		
	}
	
	
	
	public void calculatesalary() {
		double luongemployee = getHsluong()*3000000*getHlamthem()*200000;
		System.out.println("Luong nhan vien: "+luongemployee);
	}
}
