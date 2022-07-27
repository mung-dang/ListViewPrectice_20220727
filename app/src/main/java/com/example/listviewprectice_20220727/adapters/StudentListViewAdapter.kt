package com.example.listviewprectice_20220727.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewprectice_20220727.R
import com.example.listviewprectice_20220727.datas.StudentData
import kotlinx.android.synthetic.main.student_list.view.*

class StudentListViewAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>,

) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list, null)
        }

        val row = tempRow!!

        row.nameTxt.text = mList[position].name
        row.addressTxt.text = mList[position].address
//        row.ageTxt.text = mList[position].birthYear.toString()

        val koreanAge = 2022 - mList[position].birthYear + 1
        row.ageTxt.text = "(${koreanAge}세)"

        return row
    }
}