import java.io.*; //kode untuk mengimpor yang berisi kelas kelas fungsionalitas untuk mengoperasikan masukan dan keluaran 
import java.util.Scanner; //pernyataan impor dalam bahasa pemrograman Java yang mengimpor kelas Scanner, scanner digunakan untuk membaca input dari pengguna melalui konsol atau dari sumber lain seperti berkas

public class LATIHAN5 {

    public static void main(String[] args) throws IOException // throws IOException Ini mengindikasikan bahwa metode
                                                              // main dapat melempar (throw) IOException, yaitu suatu
                                                              // jenis exception yang terkait dengan operasi
                                                              // masukan/keluaran.

    {

        Scanner input = new Scanner(System.in); // Pernyataan Scanner input = new Scanner(System.in); digunakan untuk
                                                // membuat objek Scanner yang akan digunakan untuk membaca input dari
                                                // pengguna melalui konsol.

        int i, j; // digunakan untuk mendeklarasikan dua variabel bertipe int dengan nama i dan j.

        double tpen = 0; // Mendeklarasikan variabel tpen sebagai double dan memberi nilai awal 0.
                         // Variabel ini kemungkinan digunakan untuk menyimpan total penjualan atau total
                         // harga keseluruhan.

        String np, tgl; // Variabel ini kemungkinan digunakan untuk menyimpan data seperti nama
                        // pelanggan (np) dan tanggal transaksi (tgl).

        int jml = 0; // digunakan untuk menyimpan jumlah barang atau jumlah item dalam transaksi.

        String[] kodebarang = new String[10]; // digunakan untuk menyimpan kode barang dari setiap item dalam transaksi.

        String[] namabarang = new String[10]; // digunakan untuk menyimpan nama barang dari setiap item dalam transaksi.

        int[] jumbel = new int[10]; // digunakan untuk menyimpan jumlah barang yang dibeli dari setiap item dalam
                                    // transaksi.

        double[] harga = new double[10]; // digunakan untuk menyimpan harga barang dari setiap item dalam transaksi.

        double[] total_harga = new double[10]; // digunakan untuk menyimpan total harga (harga per item dikali jumlah
                                               // barang) dari setiap item dalam transaksi.
        System.out.println("                 PT. PERMATA PRATAMA                 ");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Masukan Nama Petugas   : ");
        np = input.nextLine(); // membaca baris teks yang diberikan oleh pengguna melalui konsol atau sumber
                               // masukan lainnya

        System.out.print("Tanggal                 : ");
        tgl = input.nextLine();

        System.out.println(" ");

        System.out.print("Jumlah Data yang akan dimasukkan : ");
        j = input.nextInt();

        System.out.println("--------------------------------");
        for (i = 1; i <= j; i++) // digunakan untuk melakukan iterasi atau perulangan sejumlah kali tertentu.

        {

            System.out.println("           Data Ke- " + i);

            System.out.print("             Kode Barang   : ");
            kodebarang[i] = input.next();

            System.out.print("             Jumlah         : ");
            jumbel[i] = input.nextInt();

            System.out.println("--------------------------------");

            if (kodebarang[i].equalsIgnoreCase("P001"))

            {

                namabarang[i] = "Printer";

                harga[i] = 700000;

            }

            else if (kodebarang[i].equalsIgnoreCase("V001"))
            // digunakan untuk membandingkan dua String secara leksikografis (berdasarkan
            // urutan abjad) dengan mengabaikan perbedaan besar kecil huruf
            // (case-insensitive).
            // Perbedaan antara metode equals dan equalsIgnoreCase adalah bahwa equals
            // memeriksa persis kesamaan antara dua String, sementara equalsIgnoreCase hanya
            // memeriksa kesamaan tanpa memperhatikan huruf besar atau kecil.
            {

                namabarang[i] = "VGA Card";

                harga[i] = 75000;

            }

            else if (kodebarang[i].equalsIgnoreCase("M001"))

            {

                namabarang[i] = "Mother Board";

                harga[i] = 950000;

            }

            else

            {

                namabarang[i] = "Tidak Terdaftar";

                harga[i] = 0;

            }

        }

        System.out.println("                               PT. PERMATA PRATAMA                                   ");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.print("Nama Petugas               :" + np);
        System.out.println("                     Tanggal :" + tgl);

        System.out.println("Jumlah Data Yang Dimasukkan :" + j);

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("Data Ke-   Kode Barang     Nama Barang   Harga Barang   Jumlah Barang   Total Harga");

        System.out.println("--------------------------------------------------------------------------------------");

        for (i = 1; i <= j; i++)

        {

            total_harga[i] = harga[i] * jumbel[i];

            System.out.println(i + "           " + kodebarang[i] + "           " + namabarang[i] + "   " + harga[i]
                    + "             " + jumbel[i] + "           " + total_harga[i]);

            tpen = tpen + total_harga[i];

        }

        System.out.println("Total Pendapatan pada tanggal" + " " + tgl + " " + "adalah sebesar Rp." + tpen);

    }

}
