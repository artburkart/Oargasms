package us.chaxster.chachnjray.oargasms;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Recruit extends Activity implements OnClickListener {
	
	private TextView tvRecruit, tvAthletes;
	private Button bAthlete, bTeam;
	private Typeface tf;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recruit);
        init();
    }
    
    private void init() {
    	tvRecruit = (TextView) findViewById(R.id.tvRecruit);
    	tvAthletes = (TextView) findViewById(R.id.tvAthletes);
    	bAthlete = (Button) findViewById(R.id.bAthlete);
    	bTeam = (Button) findViewById(R.id.bTeam);
    	tf = Typeface.createFromAsset(getAssets(), "fonts/mal.ttf");
    	tvRecruit.setTypeface(tf);
    	tvAthletes.setTypeface(tf);
    	
    	bAthlete.setOnClickListener(this);
    	bTeam.setOnClickListener(this);
    	
    }

    public void onClick(View v) {
    	switch (v.getId()){
    	case R.id.bAthlete:
    		try {
    			Intent i = new Intent(Recruit.this, Class.forName("us.chaxster.chachnjray.oargasms.Athlete"));
    			startActivity(i);
    		} catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    		break;
    		
    	case R.id.bTeam:
    		try {
    			Intent i = new Intent(this, Class.forName("us.chaxster.chachnjray.oargasms.Boathouse"));
    			startActivity(i);
    		} catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    		break;
    	}
	}
    
}