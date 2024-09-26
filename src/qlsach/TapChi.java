package qlsach;

public class TapChi extends TaiLieu{

	private int sophathanh, thangphathanh;

	public int getSophathanh() {
		return sophathanh;
	}

	
	public int getThangphathanh() {
		return thangphathanh;
	}


	public void setThangphathanh(int thangphathanh) {
		this.thangphathanh = thangphathanh;
	}


	public void setSophathanh(int sophathanh) {
		this.sophathanh = sophathanh;
	}


	public TapChi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TapChi(String matl, String nxb, int sobanph, int sophathanh, int thangphathanh) {
		super(matl, nxb, sobanph);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;
	}
	
	@Override
	public void Nhap() {
		// TODO Auto-generated method stub
		super.Nhap();
		System.out.print("Nhap so phat hanh: ");
		sophathanh = sc.nextInt();
		System.out.println("Nhap thang phat hanh");
		thangphathanh = sc.nextInt();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tap Chi"+"\nSo phat hanh: "+sophathanh+"\nThang phat hanh: "+thangphathanh+"\nma tai lieu: "+getMatl()+"\nnxb: "+getNxb()+"so ban in: "+getSobanph();
	}
}
