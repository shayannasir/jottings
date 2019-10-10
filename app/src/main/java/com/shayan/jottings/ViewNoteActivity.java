package com.shayan.jottings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ViewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        EditText noteHead = findViewById(R.id.noteHead);
        EditText noteBody = findViewById(R.id.noteBody);

        Intent intent = getIntent();
        int noteId = intent.getIntExtra("noteId", -1);
        if(noteId != -1){
            noteHead.setText((MainActivity.notes.get(noteId)));
            noteBody.setText(MainActivity.descriptions.get(noteId));
        }
    }
}
