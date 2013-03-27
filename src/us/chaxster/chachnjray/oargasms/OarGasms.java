package us.chaxster.chachnjray.oargasms;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class OarGasms extends Activity implements OnClickListener {
	
	private TextView tvOar, tvGasms;
	private Button bRecruit, bBoathouse;
	private Typeface tf;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        init();
    }
    
    private void init() {
    	tvOar = (TextView) findViewById(R.id.tvOar);
    	tvGasms = (TextView) findViewById(R.id.tvGasms);
    	bRecruit = (Button) findViewById(R.id.bRecruit);
    	bBoathouse = (Button) findViewById(R.id.bBoathouse);
    	tf = Typeface.createFromAsset(getAssets(), "fonts/mal.ttf");
    	tvOar.setTypeface(tf);
    	tvGasms.setTypeface(tf);
    	
    	bRecruit.setOnClickListener(this);
    	bBoathouse.setOnClickListener(this);
    	
    }

    public void onClick(View v) {
    	switch (v.getId()){
    	case R.id.bRecruit:
    		try {
    			Intent i = new Intent(OarGasms.this, Class.forName("us.chaxster.chachnjray.oargasms.Recruit"));
    			startActivity(i);
    		} catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    		break;
    	case R.id.bBoathouse:
    		try {
    			Intent i = new Intent(OarGasms.this, Class.forName("us.chaxster.chachnjray.oargasms.Boathouse"));
    			startActivity(i);
    		} catch(ClassNotFoundException e) {
    			e.printStackTrace();
    		}
    		break;
    	}
	}
    
}