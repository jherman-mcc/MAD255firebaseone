package com.example.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.firebaseone.R
import com.models.MyModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class MyAdapter(var context: Context, var arrayList: ArrayList<MyModel>):
    RecyclerView.Adapter<MyAdapter.ItemHolder>() {
    private lateinit var database: DatabaseReference


    class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var icons = itemView.findViewById<ImageView>(R.id.icon_image)
        var txt = itemView.findViewById<TextView>(R.id.txtTitle)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        database = Firebase.database.reference

        val itemholder=LayoutInflater.from(parent.context)
            .inflate(R.layout.grid_item, parent, false)
        return ItemHolder(itemholder)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        var myCard: MyModel = arrayList.get(position)

        holder.icons.setImageResource(myCard.iconsCard!!)
        holder.txt.text = myCard.textCard
        holder.txt.setOnClickListener{
            Toast.makeText(
                context,
                myCard.textCard,
                Toast.LENGTH_LONG
            ).show()
//            var currUser = holder.icons.setImageResource(myCard.iconsCard!!)
//            database.child("users").child(currUser.toString()).setValue(currUser)
            var currUser2 = holder.txt.text
            database.child("users").child(currUser2.toString()).setValue(currUser2)

            database = Firebase.database.getReference("/users")
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}