package com.example.listviewprectice_20220727.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewprectice_20220727.R
import com.example.listviewprectice_20220727.datas.StudentData

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

        return row
    }
}