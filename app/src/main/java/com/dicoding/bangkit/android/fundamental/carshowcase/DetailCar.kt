package com.dicoding.bangkit.android.fundamental.carshowcase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailCar : AppCompatActivity() {

    companion object{
        const val EXTRA_FOTO = "extra_foto"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PAKET = "extra_paket"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_car)

        val ivFotoReceived : ImageView = findViewById(R.id.iv_detail_received)
        val tvDetailCarReceived : TextView  = findViewById(R.id.tv_detail_Received)

//        setDataView()
        val foto = intent.getStringExtra(EXTRA_FOTO)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvDetailCarReceived.text = detail
        Glide.with(this)
                .load(foto)
                .apply(RequestOptions())
                .into(ivFotoReceived)
    }

//    private fun setDataView() {
//        val ivFotoReceived : ImageView = findViewById(R.id.iv_detail_received)
//        val tvDetailCarReceived : TextView  = findViewById(R.id.tv_detail_Received)
//
//        val itemcarlist = intent.getParcelableExtra<Car>(EXTRA_PAKET)
//        Glide.with(this)
//                .load(itemcarlist.gambar)
//                .into(ivFotoReceived)
//        tvDetailCarReceived.text = itemcarlist.detail
//
//    }
}