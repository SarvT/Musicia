package com.example.musicia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.io.File


class ListViewAdapter(private val dataset: List<File>):RecyclerView.Adapter<ListViewAdapter.ListViewHolder>(){


    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var txtView=itemView.findViewById<TextView>(R.id.text_view_priority)
        val txtView:TextView

        init {
            txtView=itemView.findViewById<TextView>(R.id.text_view_priority)
        }



    //    fun setTxtView(txtView:TextView){
    //        this.txtView=txtView
    //    }
    //    fun getTxtView():TextView{
    //        return txtView
    //    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.txtView.text= dataset[position].toString()

        holder.itemView.setOnClickListener{
            TODO()

        }
    }
}
