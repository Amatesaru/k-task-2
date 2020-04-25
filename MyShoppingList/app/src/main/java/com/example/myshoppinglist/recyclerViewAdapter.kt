package com.example.myshoppinglist

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class recyclerViewAdapter(shoppingList: Parcel) :
    RecyclerView.Adapter<recyclerViewAdapter.ViewHolder>() {


    class ViewHolder(item: View) : RecyclerView.ViewHolder(item)[]
    fun writeToParcel(parcel: Parcel, flags: Int) {
        var oranges:TextView = item.findViewById(R.id.Oranges)
        var description:TextView = item.findViewById(R.id.Description)
        var icecream:TextView = item.findViewById(R.id.Ice_cream)
        var descrip:TextView = item.findViewById(R.id.Descrip)
        var peanut:TextView = item.findViewById(R.id.Peanut_butter)
        var des:TextView = item.findViewById(R.id.Des)
        var cloth:TextView = item.findViewById(R.id.Cloth_pegs)
        var dees:TextView = item.findViewById(R.id.Dees)

    }

    fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<recyclerViewAdapter> {
        override fun createFromParcel(parcel: Parcel): recyclerViewAdapter {
            return recyclerViewAdapter(parcel)
        }

        override fun newArray(size: Int): Array<recyclerViewAdapter?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_items,parent, onAttachedTo:(false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoppingList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
var user:ShoppingDataModel = shoppingList.get()
        holder.Oranges.text = user.Oranges
        holder.description.text = user.Description
        holder.icecream.text = user.descrip

    }

}

private fun Parcel.get(): ShoppingDataModel {

}
