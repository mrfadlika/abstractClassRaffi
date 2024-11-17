abstract class Manusia {
    protected double tinggiBadan;

    public Manusia(double TB) {
        this.tinggiBadan = TB;
    }

    public abstract double hitungBBI();

    public double getTinggiBadan() {
        return tinggiBadan;
    }
}

class Laki_Laki extends Manusia {
    public Laki_Laki(double TB) {
        super(TB);
    }

    @Override
    public double hitungBBI() {
        return (tinggiBadan - 100) * 0.9;
    }
}

final class Perempuan extends Manusia {
    public Perempuan(double TB) {
        super(TB);
    }

    @Override
    public double hitungBBI() {
        return (tinggiBadan - 100) * 0.8;
    }
}

public class ManusiaMain {
    public static void main(String[] args) {
        Laki_Laki laki = new Laki_Laki(170);
        Perempuan perempuan = new Perempuan(160);

        System.out.println("Berat Badan Ideal Laki-laki: " + laki.hitungBBI() + " kg");
        System.out.println("Berat Badan Ideal Perempuan: " + perempuan.hitungBBI() + " kg");
    }
}