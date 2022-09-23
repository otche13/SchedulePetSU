package ru.otche13.schedulepetsu.repository

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import ru.otche13.schedulepetsu.model.Schedule


class ScheduleRepository {

//    private val databaseReference:
//        .getInstance()
//        .getReference("86201")
//
//    private val db = FirebaseFirestore.getInstance()

//    @Volatile
//    private var INSTANCE: ScheduleRepository? = null
//
//    fun getInstance(): ScheduleRepository {
//        return INSTANCE ?: synchronized(this) {
//
//            val instance = ScheduleRepository()
//            INSTANCE = instance
//            instance
//        }
//    }


    fun loadSchedule() {

//        databaseReference.addValueEventListener(object :ValueEventListener{
//
//            override fun onDataChange(snapshot: DataSnapshot) {
//
//                try {
//
//                    val _scheduleList : List<Schedule> = snapshot.children.map{
//                        dataSnapshot ->  dataSnapshot.getValue(Schedule::class.java)!!
//                    }
//
//                    scheduleList.postValue(_scheduleList)
//
//                } catch (e:Exception){
//
//                }
//            }
//
//            override fun onCancelled(error: DatabaseError) {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//        val _scheduleList: List<Schedule>
//        db.collection("users").orderBy("B")
//            .addSnapshotListener(EventListener<QuerySnapshot> {
//                onEvent
//            })
//            .addOnFailureListener { exception ->
//                Log.i(TAG, "Error getting documents.", exception)
//            }

    }
}