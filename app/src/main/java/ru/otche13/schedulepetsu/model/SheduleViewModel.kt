package ru.otche13.schedulepetsu.model

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase


class ScheduleViewModel : ViewModel() {

    //    private val repository : ScheduleRepository
    private val _allUsers = MutableLiveData<List<Schedule>>()
    val allUsers: LiveData<List<Schedule>> = _allUsers

    private val _all = MutableLiveData<List<Schedule>>()
    val all: LiveData<List<Schedule>> = _all

    private val db = Firebase.firestore

    init {
        zap(_allUsers)
        apz(_all)

    }


    fun zap(scheduleList: MutableLiveData<List<Schedule>>) {
        val _scheduleList= arrayListOf<Schedule>()
        db.collection("86201")
            .get()
            .addOnSuccessListener {
                if(!it.isEmpty){
                    for (data in it.documents){
                        val schedule: Schedule? =data.toObject(Schedule::class.java)
                        if (schedule!=null){
                            _scheduleList.add(schedule)
                        }
                    }
                    scheduleList.postValue(_scheduleList)
                }
            }
    }

    fun apz(scheduleList: MutableLiveData<List<Schedule>>) {
        val _scheduleList= arrayListOf<Schedule>()
        db.collection("86400/type/ui")
            .get()
            .addOnSuccessListener {
                if(!it.isEmpty){
                    for (data in it.documents){
                        val schedule: Schedule? =data.toObject(Schedule::class.java)
                        if (schedule!=null){
                            _scheduleList.add(schedule)
                        }
                    }
                    scheduleList.postValue(_scheduleList)
                }
            }
    }

}



