package harish.mysimpledagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Gson mGson;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MyApplication) getApplication()).getGsonComponent().inject(this);

        DataModel dataModel = new DataModel();
        dataModel.setId(5);
        dataModel.setName("Harish Gyanani");
        String str = mGson.toJson(dataModel);
        Log.d("Yo", str);
    }

}
