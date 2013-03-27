package us.chaxster.chachnjray.oargasms;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class Athlete extends Activity implements /*OnClickListener,
		OnCheckedChangeListener,*/ OnItemSelectedListener {

	protected int mPos;
	protected String mSelection;
	protected ArrayAdapter<CharSequence> mAdapter;

	public static final int DEFAULT_POSITION = 2;
	public static final String PREFERENCES_FILE = "SpinnerPrefs";
	public static final String PROPERTY_DELIMITER = "=";
	public static final String POSITION_KEY = "Position";
	public static final String SELECTION_KEY = "Selection";
	public static final String POSITION_MARKER = POSITION_KEY
			+ PROPERTY_DELIMITER;
	public static final String SELECTION_MARKER = SELECTION_KEY
			+ PROPERTY_DELIMITER;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.athlete);
		init();
	}

	private void init() {
		
		TextView tvOne = (TextView) findViewById(R.id.tvOne);
		TextView tvAthlete = (TextView) findViewById(R.id.tvAthlete);
		TextView tvName = (TextView) findViewById(R.id.tvName);
		TextView tvGrad = (TextView) findViewById(R.id.tvGraduation);
		TextView tvHeight = (TextView) findViewById(R.id.tvHeight);
		TextView tvWeight = (TextView) findViewById(R.id.tvWeight);
		TextView tv6k = (TextView) findViewById(R.id.tv6k);
		TextView tv2k = (TextView) findViewById(R.id.tv2k);
		TextView tvType = (TextView) findViewById(R.id.tvType);

		EditText etFirst = (EditText) findViewById(R.id.etFirst);
		EditText etLast = (EditText) findViewById(R.id.etLast);
		EditText etAbb = (EditText) findViewById(R.id.etAbbrev);
		EditText etHeight = (EditText) findViewById(R.id.etHeight);
		EditText etWeight = (EditText) findViewById(R.id.etWeight);
		EditText et6k = (EditText) findViewById(R.id.et6k);
		EditText et2k = (EditText) findViewById(R.id.et2k);
		
		Button bAccept = (Button) findViewById(R.id.bAcceptAthlete);
		Button bReset = (Button) findViewById(R.id.bReset);
		
		Spinner sGrad = (Spinner) findViewById(R.id.sGraduation);
		
		RadioGroup rgType = (RadioGroup) findViewById(R.id.rgType);
		
		Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/mal.ttf");
		tvOne.setTypeface(tf);
		tvAthlete.setTypeface(tf);

		//bAccept.setOnClickListener(this);
		//bReset.setOnClickListener(this);
		
		this.mAdapter = ArrayAdapter.createFromResource(this, R.array.years,
				android.R.layout.simple_spinner_dropdown_item);
		//sGrad.setAdapter(Athlete.this.mAdapter);
		
		sGrad.setOnItemSelectedListener(this);
		//rgType.setOnCheckedChangeListener(this);


	}
	/**
	public void onClick(View v) {
		// I need to implement this
	}

	@Override
	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// I need to implement this
	}
	*/
	@Override
	public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
			long arg3) {
		Athlete.this.mPos = pos;
		Athlete.this.mSelection = parent.getItemAtPosition(pos).toString();
		
		// I still need to do something with my mSelection
		
	}
	
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// do nothing

	}

}