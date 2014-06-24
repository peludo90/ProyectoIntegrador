package co.udea.pi.mapametro;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MapActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		GoogleMap mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		
		mMap.setMyLocationEnabled(true);

	}

}