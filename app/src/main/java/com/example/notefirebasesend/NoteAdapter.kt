package com.example.notefirebasesend

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter

class NoteAdapter(context: Context, noteList: ArrayList<theNote>):ArrayAdapter<theNote>(context,0,noteList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val b = LayoutInflater.from(context).inflate(R.layout.note_layout,parent,false)
        return b
    }
}