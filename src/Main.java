public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Otomobil olusturdum
        Automobile automobile0 = new Automobile(7854, "ali", "demir", 782);
        Automobile automobile1 = new Automobile(8753, "ismail", "doğan", 657);

        //Otobus olusturdum
        Bus bus0 = new Bus(5454, "mehmet", "yılmaz", 786);
        Bus bus1 = new Bus(4536, "mehmet", "yılmaz", 357);

        //Minibus olusturdum
        Minibus minibus0 = new Minibus(4534, "ayşe", "demir", 370);
        Minibus minibus1 = new Minibus(7578, "ezgi", "deniz", 892);

        //Birkac aracin gecis yaptigini varsayalim
        automobile0.passOperation();
        bus1.passOperation();
        minibus1.passOperation();
        automobile1.passOperation();
        automobile1.passOperation();

        //gecis yapan araclari listeleyelim
        Vehicle.listPassedVehicles();
        /***
         *Tarih: 2022-09-03
         * Saat: 21:09:55.215522100
         * No:7854 Ad: ali Soyad: demir
         * Şuanki bakiye: 732.0
         *
         * Tarih: 2022-09-03
         * Saat: 21:09:55.216520700
         * No:4536 Ad: mehmet Soyad: yılmaz
         * Şuanki bakiye: 207.0
         *
         * Tarih: 2022-09-03
         * Saat: 21:09:55.216520700
         * No:7578 Ad: ezgi Soyad: deniz
         * Şuanki bakiye: 792.0
         *
         * Tarih: 2022-09-03
         * Saat: 21:09:55.216520700
         * No:8753 Ad: ismail Soyad: doğan
         * Şuanki bakiye: 607.0
         *
         * Tarih: 2022-09-03
         * Saat: 21:09:55.216520700
         * No:8753 Ad: ismail Soyad: doğan
         * Şuanki bakiye: 557.0
         */

        //Toplam geliri görelim
        Manager.getIncome();

    }

}