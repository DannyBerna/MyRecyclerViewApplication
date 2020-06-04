package com.example.myrecyclerviewapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerviewapplication.Supplier.hobbies
import kotlinx.android.synthetic.main.list_items.view.*
import java.security.AccessControlContext

class HobbiesAdapter(val context: Context, hobbies: List<Hobby>): RecyclerView.Adapter<HobbiesAdapter.MyviewHolder>() {

       override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val  view = LayoutInflater.from(context).inflate(R.layout.list_items, parent, false)
        return MyviewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val hobby = hobbies[position]
        holder.setData(hobby, position)
    }
    inner class MyviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun  setData(hobby: Hobby?, pos: Int){
            itemView.textTitle.text =hobby!!.title
        }
    }

}