package qlsach;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QuanLyTaiLieu taiLieu = new QuanLyTaiLieu();
		while (true) {
			System.out.println("Chuong trinh quan ly tai lieu");
			System.out.println("Nhap 1: Them tai lieu");
			System.out.println("Nhap 2: Tim tai lieu");
			System.out.println("Nhap 3: Hien thi thong tin tai lieu");
			System.out.println("Nhap 4: Xoa tai lieu");
			System.out.println("Nhap 5: Thoat");
			System.out.println();
			String line = sc.nextLine();
			switch (line) {
			case "1":
				System.out.println("Nhap a: them Sach");
				System.out.println("Nhap b: them Bao");
				System.out.println("Nhap c: them Tap chi");
				String type = sc.nextLine();
				switch (type) {
				case "a":
					Sach s = new Sach();
					s.Nhap();
					taiLieu.Themtailieu(s);
					break;
				case "b":
					Bao b = new Bao();
					b.Nhap();
					taiLieu.Themtailieu(b);
					break;
				case "c":
					TapChi t = new TapChi();
					t.Nhap();
					taiLieu.Themtailieu(t);
					break;
				default:
					break;
				}
				break;
			case "2":
				System.out.println("Nhap a: tim Sach");
				System.out.println("Nhap b: tim Bao");
				System.out.println("Nhap c: tim Tap chi");
				String choice = sc.nextLine();
				switch (choice) {
				case "a":
					System.out.print("Nhap ma sach can tim: ");
					String masach = sc.nextLine();
					taiLieu.TimSach(masach);
					break;
				case "b":
					System.out.print("Nhap ma bao can tim: ");
					String mabao = sc.nextLine();
					taiLieu.TimBao(mabao);
					break;
				case "c":
					System.out.print("Nhap ma tap chi can tim: ");
					String matapchi = sc.nextLine();
					taiLieu.TimBao(matapchi);
					break;
				default:
					System.out.println("Loi");
					break;
				}
			case "3":
				taiLieu.HienThi();
				break;
			case "4":
				System.out.print("Nhap ma tai lieu can xoa: ");
				String ma  = sc.nextLine();
				taiLieu.Xoatailieu(ma);
				break;
			case "5":
				return;
			default:
				System.out.println("Loi");
				continue;
			}
		}
	}
}
