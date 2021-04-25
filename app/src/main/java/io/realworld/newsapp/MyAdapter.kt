package io.realworld.newsapp

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val songs:List<Song>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // to make view we need to create infalater
        // which converts xml file to java object

        val inflater:LayoutInflater = LayoutInflater.from(parent.context)
        val view:View = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       // banding dataview
        holder.txtTitle.text = songs[position ].title
        holder.txtDiscription.text = songs[position].discription
        var color = "#CCCCC"
        if (position % 2==0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color)
        )
    }

    override fun getItemCount(): Int {
        // with this method we are getting how many items are in recycleview
        return songs.size
    }
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDiscription = itemView.findViewById<TextView>(R.id.txtDiscription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
}




}
