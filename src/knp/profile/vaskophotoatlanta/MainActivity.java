package knp.profile.vaskophotoatlanta;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	static final String KN_APP = "knp.profile.vaskophotoatlanta";
	static final String KN_APP_SN = "knp.profile.vaskophotoatlanta.SecondActivity";
	static final String KN_APP_ABOUT = "knp.profile.vaskophotoatlanta.AboutKnVideo";
	
	static final String KN_BRW_UI = "http://m.facebook.com/vasko.vasilev.965";
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // web site call
        Button btnWebSite = (Button)findViewById(R.id.btnProfile); 
        btnWebSite.setOnClickListener(startListener); 
        
        // my services
        Button btnService = (Button)findViewById(R.id.btnService); 
        btnService.setOnClickListener(startService);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
        case R.id.menu_settings:
        	startAboutKnVideoStudio();
            return true;
       // case R.id.help:
           // showHelp();
         //   return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
      
    private OnClickListener startListener = new OnClickListener() 
    {        
    	public void onClick(View v) 
    	{           
    		openWebURL(KN_BRW_UI);
    	}    
    }; 
    
    private OnClickListener startService = new OnClickListener() 
    {        
    	public void onClick(View v) 
    	{           
    		startNewService();
    	}    
    };
    
    private void startNewService()
    {
		Intent i = new Intent();
		i.setClassName(KN_APP, KN_APP_SN);
    	startActivity(i);
    }
    
    private void startAboutKnVideoStudio()
    {
		Intent i = new Intent();
		i.setClassName(KN_APP, KN_APP_ABOUT);
    	startActivity(i);
    }
    
    private void openWebURL( String inURL ) 
    {     
    	Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse( inURL ) );      
    	startActivity( browse ); 
    } 
    

}
