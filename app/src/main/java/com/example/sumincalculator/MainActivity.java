package com.example.sumincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		EditText editTextAnswer = findViewById(R.id.editTextAnswer);
		Button buttonAnswer = findViewById(R.id.buttonAnswer);
		TextView textViewWrongAnswer = findViewById(R.id.textViewWrongAnswer);
		TextView textViewRightAnswer = findViewById(R.id.textViewRightAnswer);

		buttonAnswer.setOnClickListener(v -> {

			String textAnswer = editTextAnswer.getText().toString();
			if (textAnswer.equals("15")) {
				textViewRightAnswer.setVisibility(View.VISIBLE);
				textViewWrongAnswer.setVisibility(View.GONE);
			} else {
				textViewRightAnswer.setVisibility(View.GONE);
				textViewWrongAnswer.setVisibility(View.VISIBLE);
			}

		});
	}
}