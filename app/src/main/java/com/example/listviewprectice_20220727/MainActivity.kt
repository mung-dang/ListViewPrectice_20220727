package com.example.listviewprectice_20220727

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewprectice_20220727.adapters.StudentListViewAdapter
import com.example.listviewprectice_20220727.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentListViewAdapter: StudentListViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( StudentData("윤예은", "서울시 동작구", 1995))
        mStudentList.add( StudentData("이규형", "경기도 의왕시", 1999))
        mStudentList.add( StudentData("허신지", "서울시 마포구", 1998))
        mStudentList.add( StudentData("유수아", "서울시 종로구", 1997))
        mStudentList.add( StudentData("띠띠띠", "경기도 이천시", 1993))

        mStudentListViewAdapter = StudentListViewAdapter(this, R.layout.student_list, mStudentList)

        mainListView.adapter = mStudentListViewAdapter


    }
}