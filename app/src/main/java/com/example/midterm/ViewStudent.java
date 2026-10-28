package com.example.midterm;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewStudent extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_student);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        DBHelper dbHelper = new DBHelper(this);
        List<StudentModel> list = dbHelper.getStudentList();

        if (list.size() > 0) {
            recyclerView.setAdapter(new StudentAdapter(list, ViewStudent.this));
        } else {
            Toast.makeText(this, "No Student Found", Toast.LENGTH_SHORT).show();
        }
    }
}