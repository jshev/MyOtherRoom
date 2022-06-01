package com.example.myotherroom

import android.content.Context

class StudentsRepository(context: Context) {
    var db:StudentsDao? = AppDatabase.getInstance(context)?.studentsDao()

    fun getAllStudents(): List<Students> {
        return db?.selectStudents() ?: listOf<Students>()
    }

    fun deleteAllStudents() {
        db?.deleteStudents()
    }

    fun insertStudent(student: Students) {
        db?.insertStudent(student)
    }

    fun updateStudent(student: Students) {
        db?.updateStudent(student)
    }

    fun deleteStudent(student: Students) {
        db?.deleteStudent(student)
    }
}