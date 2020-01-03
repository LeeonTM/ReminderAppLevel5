package com.example.reminderapp

import android.content.Context

class ReminderRepository(context: Context) {

    private var reminderDao: ReminderDao

    init {
        var remindeRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = remindeRoomDatabase!!.reminderDao()
    }

    suspend fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    suspend fun insertReminder(reminder: Reminder) {
        reminderDao.insertReminder(reminder)
    }

    suspend fun deleteReminder(reminder: Reminder) {
        reminderDao.deleteReminder(reminder)
    }

    suspend fun updateReminder(reminder: Reminder) {
        reminderDao.updateReminder(reminder)
    }
}