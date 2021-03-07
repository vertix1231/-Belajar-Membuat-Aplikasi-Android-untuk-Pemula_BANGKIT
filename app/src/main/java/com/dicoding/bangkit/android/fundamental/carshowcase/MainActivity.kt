package com.dicoding.bangkit.android.fundamental.carshowcase

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.bangkit.android.fundamental.carshowcase.DetailCar
import com.dicoding.bangkit.android.fundamental.carshowcase.MainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var  rvcar : RecyclerView
    private var list : ArrayList<Car> = arrayListOf()
//    private lateinit var btnPilihMobil : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvcar = findViewById(R.id.rv_car)
        rvcar.setHasFixedSize(true)

        list.addAll(CarData.listcar)

        showRecyclerView()

//        btnPilihOnclick(list[i])



//        btnPilihMobil = findViewById(R.id.btnPilih)




    }
//    private fun setData() {
//        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
//        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
//        var ivgambar : ImageView = itemView.findViewById(R.id.iv_circle)
//    }

//    private fun btnPilihOnclick(list : ArrayList<Car>){
//        val moveDetailCar = Intent(this@MainActivity,DetailCar::class.java)
//            moveDetailCar.putExtra(DetailCar.EXTRA_PAKET,list)
//            startActivity(moveDetailCar)
//    }


    private fun showRecyclerView(){
        rvcar.layoutManager = LinearLayoutManager(this)
        val caradapter = CarAdapter(list)
        rvcar.adapter = caradapter

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(select : Int) {

        when(select){

            R.id.menu_home -> {

            }
            R.id.menu_about -> {

            }
        }
    }


}