package com.shayan.jottings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ViewNoteActivity extends AppCompatActivity {
    int noteId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_note);

        EditText noteHead = findViewById(R.id.noteHead);
        EditText noteBody = findViewById(R.id.noteBody);

        Intent intent = getIntent();
        noteId = intent.getIntExtra("noteId", -1);
        if(noteId != -1){
            noteHead.setText((MainActivity.notes.get(noteId)));
            noteBody.setText(MainActivity.descriptions.get(noteId));
        } else {
            MainActivity.notes.add("");
            MainActivity.descriptions.add("");
            noteId = MainActivity.notes.size() - 1;
        }

        noteHead.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.notes.set(noteId, String.valueOf(s));
                MainActivity.arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        noteBody.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.descriptions.set(noteId, String.valueOf(s));
                MainActivity.arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
