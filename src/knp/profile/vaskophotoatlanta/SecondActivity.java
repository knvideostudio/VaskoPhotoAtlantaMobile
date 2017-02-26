package knp.profile.vaskophotoatlanta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.net.Uri;

public class SecondActivity extends Activity {
	
	static final String KN_APP = "knp.profile.vaskophotoatlanta";
	static final String KN_APP_MN = "knp.profile.vaskophotoatlanta.MainActivity";
	static final String KN_BRW_UI = "http://www.knvideostudio.com/Photos/GalleryVasko";
	
	
	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.gallery);

        Button myMainButton = (Button)findViewById(R.id.btnBack); 
        myMainButton.setOnClickListener(mainListener); 
        
        // web site call
        Button btnDetails = (Button)findViewById(R.id.btnDetail); 
        btnDetails.setOnClickListener(startWebPage); 
        
    }
    
	private OnClickListener startWebPage = new OnClickListener() 
    {        
    	public void onClick(View v) 
    	{           
    		openWebURL(KN_BRW_UI);
    	}    
    }; 
    
    private OnClickListener mainListener = new OnClickListener() 
    {        
    	public void onClick(View v) 
    	{           
    		Intent i = new Intent();
     		i.setClassName(KN_APP, KN_APP_MN);
    		startActivity(i);
    	}    
    };
    
    private void openWebURL( String inURL ) 
    {     
    	Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse( inURL ) );      
    	startActivity( browse ); 
    } 

}
