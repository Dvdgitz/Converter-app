package com.devworldventures.transmitter;

import java.text.DecimalFormat;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText xValue;
	private EditText yValue;
	private EditText xMax;
	private EditText yMax;
	private EditText xMin;
	private EditText yMin;
	private TextView resultY;
	private TextView resultX;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		xValue = (EditText) findViewById(R.id.xValue);
		yValue = (EditText) findViewById(R.id.yValue);
		xMax = (EditText) findViewById(R.id.xMax);
		xMin = (EditText) findViewById(R.id.xMin);
		yMax = (EditText) findViewById(R.id.yMax);
		yMin = (EditText) findViewById(R.id.yMin);
		resultX = (TextView) findViewById(R.id.resultX);
		resultY = (TextView) findViewById(R.id.resultY);
		xValue.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		yValue.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		xMax.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		xMin.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		yMax.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		yMin.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		xValue.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
		yValue.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {
			}

			@Override
			public void afterTextChanged(Editable s) {
				doCalculation();
			}
		});
	}

	private void doCalculation() {
		if (xMax.getText().length() > 0 && yMax.getText().length() > 0 && xMin.getText().length() > 0
				&& yMin.getText().length() > 0 && xValue.getText().length() > 0 && yValue.getText().length() > 0) {
			boolean error=false;
			double xmax=0;
			double ymax=0;
			double xmin=0;
			double ymin=0;
			double xvalue=0;
			double yvalue=0;
			try {
				xmax = Double.parseDouble(xMax.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			try {
				ymax = Double.parseDouble(yMax.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			try {
				xmin = Double.parseDouble(xMin.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			try {
				ymin = Double.parseDouble(yMin.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			try {
				yvalue = Double.parseDouble(yValue.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			try {
				xvalue = Double.parseDouble(xValue.getText().toString());
			} catch (final NumberFormatException e) {
				error=true;
				resultX.setText("");
				resultY.setText("");
			}
			if(error)
				return;
			double resX=(yvalue-ymin)/(ymax-ymin)*(xmax-xmin)+xmin;
			double resY=(xvalue-xmin)/(xmax-xmin)*(ymax-ymin)+ymin;
			
			resultX.setText(new DecimalFormat("#0.0000").format(resX));
			resultY.setText(new DecimalFormat("#0.0000").format(resY));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
