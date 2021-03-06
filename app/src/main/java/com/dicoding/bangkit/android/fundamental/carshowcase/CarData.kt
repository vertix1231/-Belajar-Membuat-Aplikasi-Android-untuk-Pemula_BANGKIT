package com.dicoding.bangkit.android.fundamental.carshowcase

object CarData {

    private val carname = arrayOf(
        "Bugatti Chiron",
        "Mercedes-AMG GT",
        "McLaren 720S",
        "Aston Martin DB11",
        "Ferrari 812 Superfast",
        "Lamborghini Aventador",
        "Koenigsegg Regera",
        "Aston Martin Vanquish",
        "Honda Acura NSX",
        "Nissan GT-R",




    )

    private val cardetail = arrayOf(
        "Inilah mobil sport terbaik di dunia. Pasalnya Bugatti Chiron dinobatkan sebagai mobil tercepat di dunia. Hal ini tak lepas dari mesin 8.0 Liter 16 Silinder yang menggunakan 4 buah turbocharger, sehingga mamp menghasilkan tenaga sebsar 1500 Horsepower. Top speed mobil terbaik di dunia ini diklaim mencapai 420 km/jam, dan dipadukan dengan transmisi 7 percepatan dual-clutch automatic yang dialirkan ke empat rodanya. Dengan semua kecanggihan teknologi yang dimilikinya, wajar apabila harga Buggati Chiron mencapai 3 Juta Dollar atau setara 40 Miliar Rupiah",
        "Mobil sport terbaik ini menggunakan mesin 4.0 Liter Twih-Turbo V8 yang terhbung dengan transmisi otomatis dual-clutch tujuh percepatan yang nantinya bisa menghasilkan tenaga mencapai 550 Horsepower. Walaupun tidak secepat Buggati Chiron, namun Mercedes-AMG GT memiliki desain sangat sporty dan dibekali beragam fitur unggulan, seperti suspensi yang bisa diatur ketinggiannya, rear-axle steering, dan bodi aerodinamis yang membuatnya bisa berakselerasi sangat cepat dalam hitungan detik.",
        "McLaren 720S merupakan mobil sport atau supercar dengan bodi sangat ringan dan memiliki desain aerodinamis. Mobil ini mampu mengeluarkan tenaga sebesar 720 Horsepoer, berkat mesin twin-tubo 4.0 Liter V8 yang dipadukan dengan sistem penggerak roda belakang dan transmisi otomatis tujuh percepatan. Agar performanya semakin maksimal, McLaren melengkapinya dengan mode drift yang terdiri dari Comfort, Sport, dan Track yang siap memicu adrenalin pengendaranya.",
        "DB11 merupakan mobil sport terbaik yang dimiliki Aston Martin saat ini. Mobil ini pernah dipakai dalam film James Bond 007, dan tersedai dua varian mesin yang terdiri dari mesin twin-turbo 4.0 Liter V8 bertenaga 503 Horsepower, dan mesin V12 5.2 Liter yang bisa menghasilkan tenaga maksimal sebesar 600 Horspower. Mesin V12 yang dipakainya membuat Aston Martin bisa berlari dari nol sampai 60 mph dalam waktu 3.6 detik. Desainnya juga sangat keren dan dirancang dengan mengedepankan aspek aerodinamika.",
        "Mobil ini diklaim memiliki top speed 211 mph, jadi tidak salah apabila diberi nama Superfast. Untuk mesinnya, Ferrari 812 Superfast menggunakan mesin 6.5 Liter V12 yang bisa menghasilkan tenaga mencapai 789 Horsepower. Ciri khas mobil Ferrari yang tampil futuristik dan modern terlihat pada mobil ini. Selain itu, Ferrari 812 Superfast menggunakan sistem transmisi otomatis 7 percepatan dengan dual clutch. Untuk harga sendiri, mobil sport terbaik ini dibanderol USD\$315.000. Tertarik membelinya ?",
        "Di Indonesia, Lamborghini Aventador dipasarkan melebihi 12 Miliar Rupiah dan salah satu pemiliknya adalah Raffi Ahmad. Harganya sangat mahal, karena menjadi salah satu mobil sport terbaik di dunia yang memiliki performa tercepat di kelasnya. Hal ini tak lepas dari pemakaian mesin 6.5 Liter V12 yang bisa mengeluarkan tenaga sebesar 730 Horsepower. Performanya sangat brutal, sehingga mampu menghasilkan top speed mencapai 350 km/jam dan bisa berakselerasi dari 0 sampai 60 mph dalam waktu 2.9 detik.",
        "Berbicara soal mobil termahal, pastinya mobil sport terbaik dari Koenigsegg menjadi salah satunya. Nah salah satu yang termahal adalah Koenigsegg Regera. Mobil ini diklaim mampu mengeluarkan tenaga melebihi 1500 horsepower, berkat mesin hybrid yang menggabungkan mesint twin-turbo 5.0 Liter V8 yang dipadukan dengan 3 motor listrik. Kemampuan akselerasinya sangat mengagumkan, karena bisa berlaris dari 0 sampai 62 mph dalam waktu 2.8 detik dan mencapai 249 mph dalam watu 30 detik.",
        "Mobil sport terbaik selanjutnya adalah Aston Martin Vanquish. Mobil ini memiliki desain sangat keren, dan menurut kami lebih keren dibandingkan Aston Martin DB11. Tidak hanya mengandalkan desain modern yang terlihat futuristik, Aston Martin Vanquish juga memiliki mesin V12 yang membuatnya sangat cepat. Dimana untuk model standar mampu mengeluarkan tenaga sebesar 568 Horsepower. Sedangkan untuk Aston Martin Vanquish S mencapai 580 Horsepower. Selain itu, Aston Martin menyediakan varian Vanquish Volante yang memiliki atap terbuka dan bisa dibuka tutup.",
        "Honda juga memiliki mobil sport terbaik bernama Honda Acura NSX. Mobil ini merupakan mobil Hybrid yang memadukan 3 motor listrik dan mesin V6 twin-turbo yang mampu menghasilkan tenaga sebesar 573 horsepower. Mesin yang dipakainya sangat bertenaga, dan memiliki desian sangat sporty yang bisa bersaing melawan supercar buatan Eropa. Tercatat Honda Acura NSX memiliki top speed 191 mph dan bisa berlaris dari 0 sampai 60 mph dalam waktu 3.1 detik. Performa yang dimilikinya tidak lepas dari sistem transmisi otomatis dual clutch 9 percepatan dan sistem penggerak all-wheel drive.",
        "Nissan melengkapi mobil sport terbaik miliknya dengan mesin V6 3.8 Liter twin-turbo yang bisa menghasilkan tenaga sebesar 565 Horsepower. Desain Nissan GT-R juga sangat sporty, sehingga bisa bersaing melawan Chevrolet Camaro ataupun Ford Mustang. Semuanya menawarkan teknologi terbaik di kelasnya, sehingga memanjakan penggendaranya dengan kecepatan tinggi dan torsi sangat besar. Terlebih Nissan GT-R sudah menggukan sistem penggerak all-wheel drivre dan transmisi otomatis 6 percepatan dengan dual-clutch.",
    )

    private val fotocar  = arrayOf(

        R.drawable.bugatti_chiron,
        R.drawable.mercedesamggt,
        R.drawable.mclaren720s,
        R.drawable.astonmartinidb,
        R.drawable.ferrari812superfast,
        R.drawable.lamborghiniaventador,
        R.drawable.koenigseggegera,
        R.drawable.astonmartinivanquish,
        R.drawable.hondaacurnsx,
        R.drawable.nissangtr,
    )

    val  listcar : ArrayList<Car>
        get() {
            val list = arrayListOf<Car>()
            for (i in carname.indices){
                val car = Car()

                car.name = carname[i]
                car.detail = cardetail[i]
                car.gambar = fotocar[i]

                list.add(car)
            }

            return list
            TODO()
        }

}