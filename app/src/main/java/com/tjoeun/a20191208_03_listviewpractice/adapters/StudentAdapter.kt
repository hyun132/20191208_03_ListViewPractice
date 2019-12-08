package com.tjoeun.a20191208_03_listviewpractice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.tjoeun.a20191208_03_listviewpractice.R
import com.tjoeun.a20191208_03_listviewpractice.datas.User

class StudentAdapter(context: Context, resid:Int, list:ArrayList<User>):ArrayAdapter<User> (context, resid, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow=convertView
        if(tempRow == null){
            tempRow=inf.inflate(R.layout.student_list_item,null)
        }
        val row = tempRow!!

        val data= mList.get(position)

        val studentNameTxt = row.findViewById<TextView>(R.id.studentNameTxt)
        val studentAddrTxt = row.findViewById<TextView>(R.id.studentAddrTxt)

        studentNameTxt.text=data.name
        studentAddrTxt.text=data.address

        return row

    }
}