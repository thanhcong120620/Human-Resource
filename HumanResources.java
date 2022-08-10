
  import java.util.ArrayList;

  import java.util.Scanner;
  
  public class HumanResources {
	  public static void main(String[]args) { 
	
		  
		  Employee employee = new Employee();
					
		  Employee.El = new ArrayList<Employee>();
		  
		  
		  Scanner sce = new Scanner(System.in);
				do {
					
				System.out.println("Nhap ma so nhan vien: ");
				int msnv = sce.nextInt();
				System.out.println("Nhap ten nhan vien: ");
				sce = new Scanner(System.in);
				String tennv = sce.nextLine();
				System.out.println("Nhap tuoi nhan vien: ");
				sce = new Scanner(System.in);
				int tuoinv = sce.nextInt();
				System.out.println("Nhap bo phan lam viec cua nhan vien: ");
				sce = new Scanner(System.in);
				String bplamviecnv = sce.nextLine();
				System.out.println("Nhap ngay vao lam cua nhan vien: ");
				sce = new Scanner(System.in);
				double ngayvaolamnv = sce.nextDouble();
				System.out.println("Nhap he so luong cua nhan vien: ");
				sce = new Scanner(System.in);
				double hsluongnv = sce.nextDouble();
				System.out.println("Nhap so ngay nghi phep: ");
				sce = new Scanner(System.in);
				int ngaynghiphepnv = sce.nextInt();
				System.out.println("Nhap so gio lam them cua nhan vien: ");
				sce = new Scanner(System.in);
				double hlamthemnv = sce.nextDouble();
				
				
				Employee El1 = new Employee(msnv, tuoinv, ngaynghiphepnv,tennv, bplamviecnv,ngayvaolamnv,hsluongnv,hlamthemnv);
				El.add(El1); 
				
				System.out.println("Ban co muon nhap them khong: ");
				sce = new Scanner(System.in);
				Employee.condition = sce.nextLine();
			
				}while(Employee.condition.equalsIgnoreCase("Có")||Employee.condition.equalsIgnoreCase("Co")||
						Employee.condition.equalsIgnoreCase("C")||Employee.condition.equalsIgnoreCase("yes")||
						Employee.condition.equalsIgnoreCase("y"));
		  
				
		  
		employee.displayInformation();
		employee.calculatesalary();
  }
	  
  } 
 