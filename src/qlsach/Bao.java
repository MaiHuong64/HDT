package qlsach;

public class Bao extends TaiLieu{

	private String ngayphathanh;

	public String getNgayphathanh() {
		return ngayphathanh;
	}

	public void setNgayphathanh(String ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}

	public Bao(String ngayphathanh) {
		super();
		this.ngayphathanh = ngayphathanh;
	}

	public Bao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bao(String matl, String nxb, int sobanph) {
		super(matl, nxb, sobanph);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		System.out.print("Nhap ngay phat hanh: ");
		ngayphathanh = sc.nextLine();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bao"+"\nNgay phat hanh: "+ngayphathanh+"\nma tai lieu: "+getMatl()+"\nnxb: "+getNxb()+"so ban in: "+getSobanph();
	}
}
