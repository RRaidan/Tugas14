package Tugas14;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class Transaksi extends Barang{
	Scanner sc = new Scanner(System.in);
	
	public void tanggal()
    {
        Date Date = new Date();
        SimpleDateFormat tgl = new SimpleDateFormat("EEEE, dd MMM yyyy");
        System.out.println("Tanggal Transaksi   = " + tgl.format(Date));
    }


    public void waktu()
    {
        Date Time = new Date();    
        SimpleDateFormat tm = new SimpleDateFormat("HH:mm:ss");  
        System.out.println("Waktu Transaksi     = " + tm.format(Time));
    }



	
	public void inputNoFaktur() {
		boolean condition = true;
		while(condition) {
		
			System.out.print("Silahkan masukan nomor faktur \n-> ");
			String input1 = sc.nextLine().toLowerCase().trim().replaceAll("\\s+"," ");
			super.setNo_faktur(input1);
			System.out.println("Nomor Faktur Barang: "+super.getNo_faktur());
			System.out.println();
			condition = false;
		
	  }
	}
	
	public void inputNamaBarang() {
		boolean condition = true;
		while(condition) {
			
				System.out.print("Silahkan masukan nama barang \n-> ");
				String input2 = sc.nextLine().toUpperCase().trim(); //toUpperCase method
				super.setNama_barang(input2);
				System.out.println("Nama Barang: "+super.getNama_barang());
				System.out.println();
				condition = false;
			
		}
	}
	
	public void inputHargaBarang() {
		
		boolean condition = true;
		while(condition) {
			try {
				System.out.print("Silahkan masukan harga barang \n-> ");
				long input3 = sc.nextLong();
				super.setHarga_barang(input3);
				System.out.println("Harga Barang: Rp"+super.getHarga_barang()+",-");
				System.out.println();
				condition = false;
			}catch(InputMismatchException e) {
				String s = sc.nextLine();
				System.out.println("\nMohon inputkan ulang ");
			}
		}
		
	}

	public void inputJumlahBarang() {
		boolean condition = true;
		while(condition) {
			try {
				System.out.print("Silahkan masukan Jumlahnya \n-> ");
				long input4 = sc.nextLong();
				super.setJumlah(input4);
				System.out.println("Jumlahnya: "+super.getJumlah()+" unit");
				System.out.println();
				System.out.println();
				condition = false;
			}catch(InputMismatchException e) {
				String s = sc.nextLine();
				System.out.println("\nMohon inputkan ulang ");
			}
		}
	}
	
	public void setSubTotal(long harga, long jumlah) {
		super.subtotal = harga*jumlah;
		System.out.println("Subtotal: "+getHarga_barang()+" x "+getJumlah()+" =  Rp"+getSubTotal()+",-");
		System.out.println();
	}
	
	public void setDiskon(long subtotal) {
		if(subtotal > 0L && subtotal<50000L) {
			this.diskon = (subtotal/100L);
		}else if(subtotal >= 50000L && subtotal < 100000L) {
			this.diskon = (subtotal * 3L/100L);
		}else if(subtotal >= 100000L && subtotal < 250000L) {
			this.diskon = (subtotal * 5L/100L);
		}else if(subtotal >= 250000L && subtotal < 500000L) {
			this.diskon = (subtotal * 7L/100L);
		}else if(subtotal>= 500000L) {
			this.diskon = (subtotal * 10L/100L);
		}
		
		System.out.println("Anda dapat diskon sebesar Rp"+getDiskon()+",-");
		System.out.println();
	}
	
	
	public void setTotalHarga(long diskon, long subtotal) {
		this.total_harga = subtotal - diskon;
		System.out.println("Total harga yang anda harus bayar sebesar Rp"+getTotalHarga()+",-");
		System.out.println();
		System.out.println();
		
	}
	
	public void display() {
		System.out.println("======Bukti Transaksi======");
		System.out.println("Nomor Faktur: "+super.getNo_faktur());
		System.out.println("Nama Barang: "+super.getNama_barang());
		System.out.println("Harga Barang: Rp"+super.getHarga_barang()+",-");
		System.out.println("Jumlah Barang: " + super.getJumlah()+" unit");
		System.out.println("Subtotal: Rp"+super.getSubTotal()+",-");
		System.out.println("Diskon: Rp"+super.getDiskon()+",-");
		System.out.println("Total Harga: Rp"+super.getTotalHarga()+",-");
		tanggal();
		waktu();
		System.out.println("===========================");
		System.out.println();
	}
}
