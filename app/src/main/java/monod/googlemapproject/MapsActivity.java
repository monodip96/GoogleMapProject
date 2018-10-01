package monod.googlemapproject;

import android.location.Location;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Hashtable;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Marker marker;
    private Hashtable<String, String> markers;
    Double yourLat=22.9484398;
    Double yourLng=88.45904010000004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        markers = new Hashtable<String, String>();
        float results[]=new float[10];

        mMap.setInfoWindowAdapter(new CustomInfoWindowAdapter());

        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.591509, 88.411751)).title("You Are Here").snippet("Consider YourSelf Here").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        Marker customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(yourLat, yourLng))
                        .title("You Are Here")
                        .snippet("Consider YourSelf Here")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));


        markers.put(customMarker.getId(), "");


        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.592217, 88.410453)).title("Location 1").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        Location.distanceBetween(yourLat,yourLng,22.945165,88.460664,results);
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.945165, 88.460664))
                        .title("Location 1")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));


        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.947818,88.461124,results);

        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.591452, 88.409635)).title("Location 2").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.947818, 88.461124))
                        .title("Location 2")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.948318,88.459827,results);


        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.593911, 88.412670)).title("Location 3").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.948318, 88.459827))
                        .title("Location 3")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");



        Location.distanceBetween(yourLat,yourLng,22.946444,88.460096,results);

        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.593060, 88.415524)).title("Location 4").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.946444, 88.460096))
                        .title("Location 4")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");



        Location.distanceBetween(yourLat,yourLng,22.945849,88.461251,results);
        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.590940, 88.415213)).title("Location 5").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.945849, 88.461251))
                        .title("Location 5")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.944201,88.459017,results);
        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.589692, 88.411908)).title("Location 6").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.944201, 88.459017))
                        .title("Location 6")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.943292,88.455981,results);

        //mMap.addMarker(new MarkerOptions().position(new LatLng(22.592436, 88.410964)).title("Location 7").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_name)));
        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.943292, 88.455981))
                        .title("Location 7")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.94734, 88.458885,results);

        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.94734, 88.458885))
                        .title("Location 8")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.94538, 88.461584,results);

        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.94538, 88.461584))
                        .title("Location 9")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");


        Location.distanceBetween(yourLat,yourLng,22.95584, 88.454426,results);

        customMarker = googleMap
                .addMarker(new MarkerOptions()
                        .position(new LatLng(22.95584, 88.454426))
                        .title("Location 10")
                        .snippet("Distance =" + Math.abs(results[1])+ "meter")
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_action_here)));
        markers.put(customMarker.getId(), "");

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(yourLat, yourLng),15));
    }

    private class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter {

        private View view;

        public CustomInfoWindowAdapter() {
            view = getLayoutInflater().inflate(R.layout.custom_info_window,null);
        }

        @Override
        public View getInfoContents(Marker marker) {

            if (MapsActivity.this.marker != null
                    && MapsActivity.this.marker.isInfoWindowShown()) {
                MapsActivity.this.marker.hideInfoWindow();
                MapsActivity.this.marker.showInfoWindow();
            }
            return null;
        }

        @Override
        public View getInfoWindow(final Marker marker) {
            MapsActivity.this.marker = marker;

            String url = null;

            if (marker.getId() != null && markers != null && markers.size() > 0) {
                if (markers.get(marker.getId()) != null
                        && markers.get(marker.getId()) != null) {
                    url = markers.get(marker.getId());
                }
            }
            final ImageView image = ((ImageView) view.findViewById(R.id.badge));


            image.setImageResource(R.drawable.ic_action_here);
            //}

            final String title = marker.getTitle();
            final TextView titleUi = ((TextView) view.findViewById(R.id.title));
            if (title != null) {
                titleUi.setText(title);
            } else {
                titleUi.setText(title);
            }

            final String snippet = marker.getSnippet();
            final TextView snippetUi = ((TextView) view
                    .findViewById(R.id.snippet));
            if (snippet != null) {
                snippetUi.setText(snippet);
            } else {
                snippetUi.setText(snippet);
            }
            final TextView name = ((TextView) view.findViewById(R.id.name));
            name.setText("");
            name.setVisibility(View.VISIBLE);

            return view;
        }
    }

}
