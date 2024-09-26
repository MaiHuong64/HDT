package qlsach;

import java.util.ArrayList;
import java.util.Iterator;

public class QuanLyTaiLieu {

	ArrayList<TaiLieu> documents = new ArrayList<>();

	public ArrayList<TaiLieu> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<TaiLieu> documents) {
		this.documents = documents;
	}

	public QuanLyTaiLieu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public QuanLyTaiLieu(ArrayList<TaiLieu> documents) {
		super();
		this.documents = documents;
	}

	public boolean TimTheoMa(String matl) {
		for (TaiLieu t1 : documents) {
			t1.getMatl().equals(matl);
			return true;
		}
		return false;
	}

	public void Themtailieu(TaiLieu tl) {
		documents.add(tl);
	}

	public void Xoatailieu(String matl) {
		for (TaiLieu t : documents) {
			if (TimTheoMa(matl)) {
				documents.remove(t);
				System.out.println("Xoa thanh cong");
			} else {
				System.out.println("Thua");
			}
		}
	}

	public void HienThi() {
		for(TaiLieu t: documents) {
			System.out.println(t.toString());
		}
	}

	public void TimSach(String masach) {
		for (TaiLieu tl : documents) {
			if (TimTheoMa(masach))
				tl.toString();
			else
				System.out.println("Khong co ma sach can tim");
		}
	}

	public void TimBao(String mabao) {
		for (TaiLieu tl : documents) {
			if (TimTheoMa(mabao))
				tl.toString();
			else
				System.out.println("Khong co ma bao can tim");
		}
	}

	public void TimTapChi(String matapchi) {
		for (TaiLieu tl : documents) {
			if (TimTheoMa(matapchi))
				tl.toString();
			else
				System.out.println("Khong co ma tap chi can tim");
		}
	}
}
