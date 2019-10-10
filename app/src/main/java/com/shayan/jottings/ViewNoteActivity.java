package com.shayan.jottings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ViewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        EditText noteHead = findViewById(R.id.noteHead);
        EditText noteBody = findViewById(R.id.noteBody);
    }
}
