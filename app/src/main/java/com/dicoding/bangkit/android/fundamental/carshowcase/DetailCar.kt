package com.dicoding.bangkit.android.fundamental.carshowcase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
//        val foto = intent.getStringExtra(EXTRA_FOTO)
        val foto = intent.getIntExtra(EXTRA_FOTO,0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvDetailCarReceived.text = detail
        Glide.with(this)
                .load(foto)
                .apply(RequestOptions())
                .into(ivFotoReceived)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.menu_home -> {
                val moveahomeback = Intent(this@DetailCar,MainActivity::class.java)
                startActivity(moveahomeback)
                true
            }
            R.id.menu_about -> {
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}