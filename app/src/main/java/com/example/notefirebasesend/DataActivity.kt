package com.example.notefirebasesend

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.firebase.database.*
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class DataActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val db = Firebase.firestore

        var btn = findViewById<Button>(R.id.sendBtn)
        var title = findViewById<EditText>(R.id.editText1)
        var Des = findViewById<EditText>(R.id.editText2)
        var NOfLet = findViewById<EditText>(R.id.editText3)
        var list = findViewById<ListView>(R.id.lView)

        btn.setOnClickListener() {
            var eText1 = title.text.toString()
            var eText2 = Des.text.toString()
            var eText3 = NOfLet.text.toString()

            val NoteDetails = hashMapOf(
                "Note" to eText1,
                "Description" to eText2,
                "Limit" to eText3
            )


            db.collection("Notes")
                .add(NoteDetails)
                .addOnSuccessListener { documentReference ->
                    Log.d("done", "DocumentSnapshot added with ID: ${documentReference.id}")
                }
                .addOnFailureListener { e ->
                    Log.w("Faild", "Error adding document", e)
                }
        }
        }

//        val data = ArrayList<theNote>()
//        val adapter = NoteAdapter(applicationContext,data)
//        list.adapter = adapter
//        db.collection("Notes")
//            .get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    data.add(
//                        theNote(
//                            document.getString("name").toString(),
//                            document.getString("description").toString(),
//                            document.getString("limitsOfNumbers").toString(),
//
//                        )
//                    )
//
//                    Log.d("done", "${document.id} => ${document.data}")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.w("Failed", "Error getting documents.", exception)
//            }








}