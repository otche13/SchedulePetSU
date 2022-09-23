package ru.otche13.schedulepetsu.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

import ru.otche13.schedulepetsu.model.Schedule
import ru.otche13.schedulepetsu.R


class MainAdapter:RecyclerView.Adapter<MainAdapter.MainViewHolder>(){

    private val scheduleList = ArrayList<Schedule>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.schedule_item,parent,false)

        return MainViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        val user: Schedule =scheduleList[position]
        holder.firstname.text=user.firstname
        holder.lastname.text=user.lastname
        holder.age.text=user.age
    }

    override fun getItemCount(): Int {

        return scheduleList.size

    }

    fun updateUserList(scheduleList: List<Schedule>){

        this.scheduleList.clear()
        this.scheduleList.addAll(scheduleList)
        notifyDataSetChanged()

    }

    class MainViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        val firstname:TextView=itemView.findViewById(R.id.tvfirstName)
        val lastname:TextView=itemView.findViewById(R.id.tvlastName)
        val age:TextView=itemView.findViewById(R.id.tvage)
    }
}
