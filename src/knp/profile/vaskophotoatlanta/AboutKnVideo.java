package knp.profile.vaskophotoatlanta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AboutKnVideo extends Activity{
	
	static final String KN_APP = "knp.profile.vaskophotoatlanta";
	static final String KN_APP_MN = "knp.profile.vaskophotoatlanta.MainActivity";
	
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.kn_about);

        Button myMainButton = (Button)findViewById(R.id.btnBack2); 
        myMainButton.setOnClickListener(mainListener); 
        
    }
	
	 private OnClickListener mainListener = new OnClickListener() 
	    {        
	    	public void onClick(View v) 
	    	{           
	    		Intent i = new Intent();
	     		i.setClassName(KN_APP, KN_APP_MN);
	    		startActivity(i);
	    	}    
	    };
    
}
