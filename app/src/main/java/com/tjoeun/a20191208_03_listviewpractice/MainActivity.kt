package com.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a20191208_03_listviewpractice.adapters.UserAdapter
import com.tjoeun.a20191208_03_listviewpractice.datas.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val studentList = ArrayList<User>()
    var userAdapter:UserAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 목록 추가
        addStudents()

        userAdapter = UserAdapter(this,R.layout.user_list_item,studentList)
        userListView.adapter = userAdapter
    }

    fun addStudents(){

        studentList.add(User("계석준", "서울시 도봉구", false))
        studentList.add(User("김미현", "경기도 군포시", true))
        studentList.add(User("김영호", "서울시 은평구", false))
        studentList.add(User("노혜진", "서울시 강동구", true))
        studentList.add(User("류찬울", "서울시 도봉구", false))
        studentList.add(User("양성심", "서울시 관악구", true))
        studentList.add(User("이규현", "서울시 도봉구", false))
        studentList.add(User("이수정", "경기도 고양시", true))
        studentList.add(User("차순혁", "서울시 구로구", false))
        studentList.add(User("황현하", "경기도 성남시", true))
        studentList.add(User("조경진", "서울시 은평구", false))
    }

}
