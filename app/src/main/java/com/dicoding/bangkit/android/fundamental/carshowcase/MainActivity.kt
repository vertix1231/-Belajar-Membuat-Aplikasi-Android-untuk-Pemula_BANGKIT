package com.dicoding.bangkit.android.fundamental.carshowcase

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.bangkit.android.fundamental.carshowcase.DetailCar
import com.dicoding.bangkit.android.fundamental.carshowcase.MainActivity

class MainActivity : AppCompatActivity() {
    private lateinit var  rvcar : RecyclerView
    private var list : ArrayList<Car> = arrayListOf()
    private lateinit var lyListcar : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvcar = findViewById(R.id.rv_car)
        rvcar.setHasFixedSize(true)

        list.addAll(CarData.listcar)

        showRecyclerView()

//        lyListcar = findViewById(R.id.ly_item_rowcar_rv)




    }
    private fun showSelectedHero(car: Car) {
        Toast.makeText(this, "Kamu memilih " + car.name, Toast.LENGTH_SHORT).show()
    }

    private fun showRecyclerView(){
        rvcar.layoutManager = LinearLayoutManager(this)
        val caradapter = CarAdapter(list)
        rvcar.adapter = caradapter

        

//        caradapter.setOnItemClickCallback(object : CarAdapter.OnItemClickCallback{
//            override fun onItemClicked(data: Car) {
//                showSelectedHero(data)
//            }
//        })
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