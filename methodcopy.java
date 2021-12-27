public class methodcopy
{
 public static void main( String[] args )
 {
 String kalimat1 ="Saya Adalah Mahasiswa Universitas Terbuka";
 String kalimat2 ="Saya Adalah Mahasiswa";
 String ubah;
 System.out.println(kalimat1);
 ubah = kalimat1.replace('a','A');
 System.out.println(ubah);

//hitung jumlah karakter kalimat1 dan kalimat 2

 System.out.println("Panjang kalimat 1 = " + kalimat1.length());
 System.out.println("Panjang kalimat 2 = " + kalimat2.length());
 
 //hitung jumlah perbedaan karakter kalimat1 , kalimat2 dan ubah
 int hasil1 = kalimat1.compareTo(ubah);
 int hasil2 = kalimat1.compareTo(kalimat2);
 System.out.println("Jumlah Perbedaan karakter kalimat 1 dan Kalimat yang diubah = " + hasil1);
 System.out.println("Jumlah Perbedaan karakter kalimat 1 dan kalimat 2 = " + hasil2);

 //mencari keterangan genap atau ganjil kalimat1 dengan kalimat2
 int hasilcount= hasil2 % 2;
 String kalimat = "";
 if(hasilcount==1){
    kalimat = "Ganjil";
 }
 else{
     kalimat = "Genap";
 }
System.out.println("Keterangan Jumlah Perbandingan kalimat 1 dan kalimat 2 adalah bilangan = "+kalimat);
}
}