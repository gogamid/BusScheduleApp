package com.example.busschedule.viewmodels

import androidx.lifecycle.ViewModel
import com.example.busschedule.database.schedule.Schedule
import com.example.busschedule.database.schedule.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao) : ViewModel() {
  fun fullSchedule(): List<Schedule> = scheduleDao.getAll()
  fun scheduleForStopName(stopName: String): List<Schedule> = scheduleDao.getByStopName(stopName)
}