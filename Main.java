abstract class Kendaraan {
    abstract void berjalan();

    void deskripsi() {
        System.out.println("Ini adalah kendaraan");
    }

    abstract void berhenti();
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil berjalan dijalan raya");
    }

    void berhenti() {
        System.out.println("Mobil berhenti dijalan raya, karena lampu merah");
    }
}

class SepedaMotor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda Motor berjalan dijalan kecil");
    }

    void berhenti() {
        System.out.println("Sepeda Motor berhenti dijalan raya, karena menabrak anak kecil");
    }
}

class Truk extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Truk berjalan di jalan tol");
    }

    @Override
    void berhenti() {
        System.out.println("Truk berhenti di rest area untuk beristirahat");
    }

    void muatBarang() {
        System.out.println("Truk sedang memuat barang");
    }
}

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepedaMotor = new SepedaMotor();
        Kendaraan truk = new Truk();

        mobil.berjalan();
        sepedaMotor.berjalan();
        truk.berjalan();

        mobil.deskripsi();
        sepedaMotor.deskripsi();
        truk.deskripsi();

        mobil.berhenti();
        sepedaMotor.berhenti();
        truk.berhenti();

        ((Truk) truk).muatBarang(); // Perlu casting karena muatBarang() hanya ada di Truk
    }
}