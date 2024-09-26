package qlsach;

import java.util.Scanner;

public class TaiLieu {

	private String matl;
	private String nxb;
	private int sobanph;

	Scanner sc = new Scanner(System.in);
	
	public TaiLieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaiLieu(String matl, String nxb, int sobanph) {
		super();
		this.matl = matl;
		this.nxb = nxb;
		this.sobanph = sobanph;
	}

	public String getMatl() {
		return matl;
	}

	public void setMatl(String matl) {
		this.matl = matl;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public int getSobanph() {
		return sobanph;
	}

	public void setSobanph(int sobanph) {
		this.sobanph = sobanph;
	}

	public void Nhap() {
		System.out.print("Nhap ma tai lieu: ");
		matl = sc.nextLine();
		System.out.print("Nhap ten nha xuat ban: ");
		nxb = sc.nextLine();
		System.out.print("Nhap so ban phat hanh: ");
		sobanph = sc.nextInt();
	}
}
