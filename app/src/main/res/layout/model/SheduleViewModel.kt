package ru.otche13.petrsuschedule.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.otche13.schedulepetsu.model.Schedule
import ru.otche13.schedulepetsu.repository.ScheduleRepository

class ScheduleViewModel : ViewModel() {

    private val repository : ScheduleRepository
    private val _allUsers = MutableLiveData<List<Schedule>>()
    val allUsers : LiveData<List<Schedule>> = _allUsers


    init {

        repository = ScheduleRepository().getInstance()
        repository.loadSchedule(_allUsers)

    }

}