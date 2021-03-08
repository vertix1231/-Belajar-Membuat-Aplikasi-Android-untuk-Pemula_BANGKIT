package com.dicoding.bangkit.android.fundamental.carshowcase

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import de.hdodenhof.circleimageview.CircleImageView

class CarAdapter (val listcar : ArrayList<Car>) : RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
        var ivgambar : ImageView = itemView.findViewById(R.id.iv_circle)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_car, parent, false)
        return CarViewHolder(view)
    }
    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        val car = listcar[position]
        holder.tvName.text = car.name
        holder.tvDetail.text = car.detail
        Glide.with(holder.itemView.context)
                .load(car.gambar).apply(RequestOptions().override(55,55))
                .into(holder.ivgambar)
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listcar[position].name, Toast.LENGTH_SHORT).show()
        }
        val mContextt = holder.itemView.context
        holder.itemView.setOnClickListener {
            val moveDetailCar = Intent(mContextt,DetailCar::class.java)
            moveDetailCar.putExtra(DetailCar.EXTRA_FOTO,car.gambar)
            moveDetailCar.putExtra(DetailCar.EXTRA_DETAIL,car.detail)
            mContextt.startActivity(moveDetailCar)
        }
    }
    override fun getItemCount(): Int {
        return listcar.size
    } 


}