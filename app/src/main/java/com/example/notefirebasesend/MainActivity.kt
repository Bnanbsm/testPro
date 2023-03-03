package com.example.notefirebasesend

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Firebase.firestore

        val addNotebtn = findViewById<FloatingActionButton>(R.id.addbtn)
        var btn = findViewById<Button>(R.id.sendBtn)
        var title = findViewById<EditText>(R.id.editText1)
        var Des = findViewById<EditText>(R.id.editText2)
        var NOfLet = findViewById<EditText>(R.id.editText3)

        addNotebtn.setOnClickListener() {
            val intent = Intent(this, DataActivity::class.java)
            startActivity(intent)
        }

    }
}
























//    override fun onStart() {
//        super.onStart()
//        myref?.addValueEventListener(object : ValueEventListener {
//            override fun onCancelled(error: DatabaseError) {
//
//            }
//
//            override fun onDataChange(b: DataSnapshot) {
//                for (n in b.children) {
//                    var note = n.getValue(theNote::class.java)
//                    mNoteList?.add(note!!)
//                }
//                val noteAdapter = NoteAdapter(applicationContext, mNoteList!!)
//                lview.adapter= noteAdapter
//
//            }
//        }
//        )
//    }

