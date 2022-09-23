package ru.otche13.petrsuschedule.repository

import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.*
import ru.otche13.schedulepetsu.model.Schedule
import ru.otche13.schedulepetsu.repository.ScheduleRepository


class ScheduleRepository {

    private val databaseReference: DatabaseReference = FirebaseDatabase
        .getInstance()
        .getReference("86201")

    @Volatile
    private var INSTANCE: ScheduleRepository? = null

    fun getInstance(): ScheduleRepository {
        return INSTANCE ?: synchronized(this) {

            val instance = ScheduleRepository()
            INSTANCE = instance
            instance
        }
    }


    fun loadSchedule(scheduleList: MutableLiveData<List<Schedule>>) {

        databaseReference.addValueEventListener(object :ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {

                try {

                    val _scheduleList : List<Schedule> = snapshot.children.map{
                        dataSnapshot ->  dataSnapshot.getValue(Schedule::class.java)!!
                    }

                    scheduleList.postValue(_scheduleList)

                } catch (e:Exception){

                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}