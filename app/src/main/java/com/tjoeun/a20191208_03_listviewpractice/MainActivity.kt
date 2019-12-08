package com.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempUser = User("이름","서울시",false)
        Log.d("사용자주소",tempUser.address)

        val tempUser2 = User()
        Log.d("사용자 주소", tempUser2.address)


        val tempUser3 = User("아이유")
        Log.d("거주지",tempUser3.address)

    }


}
