package com.example.myotherroom

import androidx.room.*

@Dao
interface StudentsDao {
    //CRUD Operations...

    // Create
    @Insert
    fun insertStudent(student: Students)

    // Read
    @Query("select * from students")
    fun selectStudents() : List<Students>

    // Update
    @Update
    fun updateStudent(student: Students)

    // Delete
    @Delete
    fun deleteStudent(student: Students)

    @Query("delete from students")
    fun deleteStudents()

}