public class App {
    public static void main(String[] args) throws Exception {
        // 1 instance yang hanya anggota (isikan nama dan noAnggota)
        Anggota AyuTantyana = new Anggota("AyuTantyana", "42030076");
        AyuTantyana.display();
        System.out.println("----------------------");
        //1 instance ketua pengurus (isikan nama, noAnggota dan periode kepengurusan)
        Ketua Arnettha = new Ketua("Arnettha", "42030089", "2020 / 2021");
        Arnettha.display();
        
        System.out.println("-------------------");
        //1 instance ketua panitia (isikan nama, noAnggota dan periode kepengurusan)
        KetuaPanitia Mustika = new KetuaPanitia("Mustika", "42030090", "2021 / 2022");
        Mustika.display();
    }
}