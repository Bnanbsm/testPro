package com.example.notefirebasesend

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.note_layout.view.*


class NoteAdapter(var activity: Activity, var noteList: ArrayList<theNote>):BaseAdapter() {
    override fun getCount(): Int {
        return noteList.size
    }

    override fun getItem(p0: Int): Any {
        return noteList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       var note = LayoutInflater.from(activity).inflate(R.layout.note_layout,null,false)
        note.titleTextView.text = noteList[p0].title
        note.DesTv.text = noteList[p0].Note
        note.notenumber.text = noteList[p0].number
        return note
    }


}