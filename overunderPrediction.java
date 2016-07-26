package com.rapela.soccerpredictor;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;

public class overunderPrediction extends Activity {
	CheckBox overHome, overAway, bothHome, bothAway, underHome, underAway,
			oneteamHome, oneteamAway;
	Button Predict, Reset;
	Double ov,oa,bh,ba,uh,ua,oth,ota;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ou);
		initControl();
	}

	private void initControl() {
		// TODO Auto-generated method stub
		//overHome = (CheckBox) findViewById(R.id.overHome);
		//overAway = (CheckBox) findViewById(R.id.overAway);
		//bothHome = (CheckBox) findViewById(R.id.btHome);
		//bothAway = (CheckBox) findViewById(R.id.btAway);
		//underAway = (CheckBox) findViewById(R.id.underAway);
		//underHome = (CheckBox) findViewById(R.id.underHome);
		//oneteamHome = (CheckBox) findViewById(R.id.oneTeamHome);
		//oneteamAway = (CheckBox) findViewById(R.id.oneTeamAway);
		//Predict = (Button) findViewById(R.id.btnPredict);
		//Reset = (Button)findViewById(R.id.btnReset);
		
		Predict.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});

	}

}
