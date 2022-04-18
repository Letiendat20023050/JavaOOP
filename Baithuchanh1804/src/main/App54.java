package main;
import shapes.hinhhoc;
import shapes.hinhtron;
import shapes.hinhvuong;
import shapes.hinhtru;
import shapes.hinhchunhat;
public class main {
	public static void main(String[] args) {
		//hình tròn
		hinhtron hinhtron=new hinhtron();
		hinhtron.xuatten();
		hinhtron.nhapbankinh();
		hinhtron.tinhchuvi();
		hinhtron.tinhdientich();
		hinhtron.inchuvi();
		hinhtron.indientich();
		// hình trụ
		hinhtru hinhtru=new hinhtru();
		hinhtru.xuatten();
		hinhtru.nhapchieucao();
		hinhtru.tinhthetich();
		hinhtru.tinhthetich();
		//hình chữ nhật
		hinhchunhat hinhchunhat=new hinhchunhat();
		hinhchunhat.xuatten();
		hinhchunhat.nhapchieudai();
		hinhchunhat.nhapchieurong();
		hinhchunhat.tinhchuvi();
		hinhchunhat.tinhdientich();
		hinhchunhat.indientich();
		hinhchunhat.inthetich();
		//hình vuông
		hinhvuong hinhvuong=new hinhvuong();
		hinhvuong.xuatten();
		hinhvuong.nhapcanh();
		hinhvuong.tinhchuvi();
		hinhvuong.tinhdientich();
		hinhvuong.inchuvi();
		hinhvuong.indientich();
		
	}
}