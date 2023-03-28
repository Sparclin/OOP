public class Direktur extends Pegawai {
    private static final int gajiDir = 100000;
    private static final int tunjangan = 50000;

    @Override
    public int gaji() {//untuk mengembalikan nilai dari gajiDir
        return gajiDir;
    }

    public int tunjangan() {//untuk mengembalikan nilai dari tunjangan
            return tunjangan;
        }
    }
