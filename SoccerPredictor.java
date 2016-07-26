package com.rapela.soccerpredictor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SoccerPredictor extends Activity {

	TextView display;
	EditText HomeOdds, AwayOdds, AwayDraw, HomeSOT, AwaySOT, OHSOT, OASOT,
			HomeWins, AwayWins, HomeDraw;
	Button Predict, Reset,overUnder;
	double u, v, w, x, y, z, a, b, c, d, e, f, PIH, PIA, WIH, WIA, WII, FIH,
			FIW;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soccer_predictor);
		initControl();

	}

	private void initControl() {

		HomeWins = (EditText) findViewById(R.id.EtHomeWin);
		AwayWins = (EditText) findViewById(R.id.EtAwayWin);
		HomeDraw = (EditText) findViewById(R.id.EtHomeDraw);
		AwayDraw = (EditText) findViewById(R.id.EtAwayDraw);
		HomeOdds = (EditText) findViewById(R.id.etHOdds);
		AwayOdds = (EditText) findViewById(R.id.etAwayOdds);
		HomeSOT = (EditText) findViewById(R.id.EtHSOT);
		AwaySOT = (EditText) findViewById(R.id.EtASOT);
		OHSOT = (EditText) findViewById(R.id.EtOHSOT);
		OASOT = (EditText) findViewById(R.id.EtOASOT);
		Predict = (Button) findViewById(R.id.btnPredict);
		Reset = (Button) findViewById(R.id.btnReset);
		//overUnder = (Button)findViewById(R.id.btnOU);

		Reset.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				HomeOdds.getText().clear();
				AwayOdds.getText().clear();
				HomeSOT.getText().clear();
				AwaySOT.getText().clear();
				OHSOT.getText().clear();
				OASOT.getText().clear();
				HomeWins.getText().clear();
				AwayWins.getText().clear();
				HomeDraw.getText().clear();
				AwayDraw.getText().clear();
			}
		});
		Predict.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Predict();
			}

			public void Predict() {
				// TODO Auto-generated method stub
				try {
					u = Double.parseDouble(HomeOdds.getText().toString());
					v = Double.parseDouble(AwayOdds.getText().toString());
					w = Double.parseDouble(HomeSOT.getText().toString());
					x = Double.parseDouble(AwaySOT.getText().toString());
					y = Double.parseDouble(OHSOT.getText().toString());
					z = Double.parseDouble(OASOT.getText().toString());
					a = Double.parseDouble(HomeWins.getText().toString());
					b = Double.parseDouble(AwayWins.getText().toString());
					c = Double.parseDouble(HomeDraw.getText().toString());
					d = Double.parseDouble(AwayDraw.getText().toString());

					PIH = (w - y) / 4.6;
					PIA = (x - z) / 4.6;
					WIH = PIH - PIA;
					WIA = PIA - PIH;
					e = a * 3;
					f = b * 3;

					FIH = e + c;
					FIW = f + d;

					if (FIH > FIW && WIH > 0.5 && PIH > 0 && u < 1.90) {
						// display.setText("HOME WIN!!");
						Toast.makeText(getBaseContext(), "HOME WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIH >= FIW && WIH > 0.5 && PIH > 0 && u > 1.90) {
						// display.setText("HOME WIN OR DRAW!!");
						Toast.makeText(getBaseContext(), "HOME WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && WIA > 0.5 && PIA > 0 && v < 1.90) {
						// display.setText("AWAY WIN!!");
						Toast.makeText(getBaseContext(), "AWAY WIN!!",
								Toast.LENGTH_LONG).show();

					} else if (FIW >= FIH && WIA > 0.5 && PIA > 0 && v > 1.90) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), "AWAY WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW == FIH && WIA == WIH && PIA == PIH) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), " DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIH > FIW && WIH > WIA && PIH > PIA && u < 1.90) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), "HOME WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && WIA > WIH && PIA > PIH && v < 1.90) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), "AWAY WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && WIA > WIH && PIA > PIH && v > 1.90) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), "AWAY WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIH > FIW && WIH > WIA && PIH > PIA && u > 1.90) {
						// display.setText("AWAY OR DRAW!!");
						Toast.makeText(getBaseContext(), "HOME WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && WIA > WIH) {
						Toast.makeText(getBaseContext(), "AWAY WIN!!",
								Toast.LENGTH_LONG).show();

					} else if (FIH > FIW && WIH > WIA) {
						Toast.makeText(getBaseContext(), "HOME WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIH > FIW && u > 1.90) {
						Toast.makeText(getBaseContext(), "HOME WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (FIH > FIW && u < 1.90) {
						Toast.makeText(getBaseContext(), "HOME WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && u < 1.90) {
						Toast.makeText(getBaseContext(), "AWAY WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (FIW > FIH && u > 1.90) {
						Toast.makeText(getBaseContext(), "AWAY WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (WIH == WIA && u == v) {
						Toast.makeText(getBaseContext(), "DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (u > 1.90 && WIH > WIA) {
						Toast.makeText(getBaseContext(), "HOME WIN OR DRAW!!",
								Toast.LENGTH_LONG).show();
					} else if (u < 1.90 && WIA > WIH) {
						Toast.makeText(getBaseContext(), "HOME WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (v < 1.90 && WIA > WIH) {
						Toast.makeText(getBaseContext(), "AWAY WIN!!",
								Toast.LENGTH_LONG).show();
					} else if (v > 1.90 && WIA > WIH) {
						Toast.makeText(getBaseContext(), "AWAY WIN OR DRAW!! ",
								Toast.LENGTH_LONG).show();
					} else {
						// display.setText(" DRAW!!");
						Toast.makeText(getBaseContext(), "TRICKY!!",
								Toast.LENGTH_LONG).show();
					}

				} catch (Exception e) {
					// display.setText("please Enter data on all fields first!!!");
					Toast.makeText(getBaseContext(),
							"Enter Data in All Fields", Toast.LENGTH_LONG)
							.show();
				}

			}

		});
		

	}

}
