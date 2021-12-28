package Tugas14;

public class Barang implements Penjualan{
	
	public String no_faktur;
	public String nama_barang;
	public long harga_barang;
	public long jumlah;
	public long subtotal;
	public long diskon;
	public long total_harga;
	
	@Override
	public void NoFaktur() {

	}

	@Override
	public void NamaBarang() {

	}

	@Override
	public void HargaBarang() {
	
	}

	@Override
	public void Jumlah() {

	}

	@Override
	public void SubTotal() {

	}

	@Override
	public void Diskon() {

	}

	@Override
	public void TotalHarga() {

	}
	
	@Override
	public void NamaKasir() {
		
		
	}

	@Override
	public void IDKasir() {
		
		
	}

	public String getNo_faktur() {
		return this.no_faktur;
	}

	public void setNo_faktur(String no_faktur) {
		this.no_faktur = no_faktur;
	}

	public String getNama_barang() {
		return this.nama_barang;
	}

	public void setNama_barang(String nama_barang) {
		this.nama_barang = nama_barang;
	}

	public long getHarga_barang() {
		return this.harga_barang;
	}

	public void setHarga_barang(long harga_barang) {
		this.harga_barang = harga_barang;
	}

	public long getJumlah() {
		return this.jumlah;
	}

	public void setJumlah(long jumlah) {
		this.jumlah = jumlah;
	}
	
	public long getSubTotal() {
		return this.subtotal;
	}
	
	public void setSubTotal(long harga, long jumlah) {
		this.subtotal = harga*jumlah;
	}
	
	public long getDiskon() {
		return this.diskon;
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
	}
	
	public long getTotalHarga() {
		return total_harga;
	}
	
	public void setTotalHarga(long diskon, long subtotal) {
		this.total_harga = subtotal - diskon;
	}
	

}
