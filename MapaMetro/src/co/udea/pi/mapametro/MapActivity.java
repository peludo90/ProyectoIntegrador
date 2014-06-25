package co.udea.pi.mapametro;

import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements LocationListener{

	Location lastKnownLoc = new Location("Null");
	GoogleMap mapa;
	LocationManager locManager;
	private static final long MIN_TIME = 400;
	private static final float MIN_DISTANCE = 1000;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);
		
		mapa = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
		mapa.setMyLocationEnabled(true);
		
		
		LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
		 
        // Creating a criteria object to retrieve provider
        Criteria criteria = new Criteria();
        // Getting the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);
        // Getting Current Location
        Location location = locationManager.getLastKnownLocation(provider);
        //getting the object of last known location 
        if(location!=null){
            onLocationChanged(location);
        }
        locationManager.requestLocationUpdates(provider, 20000, 0, this);
		
        createMarkers();
        agregarListerners();
        	}

	
	public void createMarkers(){
		MarkerOptions marker = new MarkerOptions();
		marker.position(new LatLng(6.269405612357567, -75.56594077167512));
		marker.title("Estación universidad");
		mapa.addMarker(marker);
		
	}

	
	
	
	

	@Override
	public void onLocationChanged(Location location) {
		// TODO Auto-generated method stub
		// Getting latitude of the current location
        double latitude = location.getLatitude();
        // Getting longitude of the current location
        double longitude = location.getLongitude();
        // Creating a LatLng object for the current location
        LatLng latLng = new LatLng(latitude, longitude);
        // Showing the current location in Google Map
        mapa.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        // Zoom in the Google Map
        mapa.animateCamera(CameraUpdateFactory.zoomTo(15));
	}

	public void agregarListerners(){
		mapa.setOnMarkerClickListener(new OnMarkerClickListener() {
		    public boolean onMarkerClick(Marker marker) {
		        Toast.makeText(
		            MapActivity.this,
		            "Marcador pulsado:\n" +
		            marker.getTitle(),
		            Toast.LENGTH_SHORT).show();
		 
		        return false;
		    }
		});
		
	}
	
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String provider) {
		// TODO Auto-generated method stub
		
	}

	
}