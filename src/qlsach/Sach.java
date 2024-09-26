package qlsach;

public class Sach extends TaiLieu {

	private String tentg;
	private int sotrang;

	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sach(String matl, String nxb, int sobanph, String tentg, int sotrang) {
		super(matl, nxb, sobanph);
		this.tentg = tentg;
		this.sotrang = sotrang;// TODO Auto-generated constructor stub
	}

	public String getTentg() {
		return tentg;
	}

	public void setTentg(String tentg) {
		this.tentg = tentg;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	@Override
	public void Nhap() {
		super.Nhap();
		sc.nextLine();
		System.out.print("Nhap ten tac gia: ");
		tentg = sc.nextLine();
		System.out.print("Nhap so trang: ");
		sotrang = sc.nextInt();
		sc.nextLine();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sach" + "\ntac gia: " + tentg + "\nso trang: " + sotrang + "\nma tai lieu: " + getMatl() + "\nnxb: "
				+ getNxb() + "so ban in: " + getSobanph();
	}
}
