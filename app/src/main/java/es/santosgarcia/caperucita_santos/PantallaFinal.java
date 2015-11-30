package es.santosgarcia.caperucita_santos;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class PantallaFinal extends AppCompatActivity {

    private VideoView mVideoView;

    @Override public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_final);
        mVideoView =(VideoView)findViewById(R.id.videoView);
        //de forma alternativa si queremos un streaming usar
       String URLstring = "C:\\Users\\Miguel\\AndroidStudioProjects\\Caperucita_Santos\\app\\src\\main\\res\\raw\\video.mp4";
        mVideoView.setVideoURI(Uri.parse(URLstring));
       // mVideoView.setVideoPath("C:\\Users\\Miguel\\AndroidStudioProjects\\Caperucita_Santos\\app\\src\\main\\res\\raw\\video.mp4");
        mVideoView.start();
        mVideoView.requestFocus();
    }

}




//http://www.androidcurso.com/index.php/tutoriales-android/37-unidad-6-multimedia-y-ciclo-de-vida/165-la-vista-videoview