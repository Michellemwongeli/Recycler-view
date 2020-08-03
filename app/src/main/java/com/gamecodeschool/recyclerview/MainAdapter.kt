package com.gamecodeschool.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.row_name_item.view.*
import java.text.FieldPosition
import kotlin.contracts.Returns

class MainAdapter : RecyclerView.Adapter< CustomViewHolder>(){
    val nameTitles = listOf("title1",  "title2", "title3")
    //numberOfItems
    override fun getItemCount(): Int {
        return nameTitles.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CustomViewHolder {
        //how do we even create a view
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.names_row, parent, false)
        return CustomViewHolder(cellForRow)
    }
    override fun onBindViewHolder(p0: CustomViewHolder, position: Int) {
        val nameTitles = nameTitles.get(position)
        holder.rowView.txtName.text = namesLists[position]
    }
    }
}
class CustomViewHolder(v: View): RecyclerView.ViewHolder(v){

}