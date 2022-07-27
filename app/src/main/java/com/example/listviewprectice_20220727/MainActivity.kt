package com.example.listviewprectice_20220727

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewprectice_20220727.datas.StudentData

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData("윤예은", "서울시 동작구", 1995))
        mStudentList.add( StudentData("이규형", "경기도 의왕시", 1999))
        mStudentList.add( StudentData("허신지", "서울시 마포구", 1998))
        mStudentList.add( StudentData("유수아", "서울시 종로구", 1997))

    }
}