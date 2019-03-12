package harish.mysimpledagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import harish.mysimpledagger.components.DaggerGsonComponent;
import harish.mysimpledagger.components.GsonComponent;
import harish.mysimpledagger.modules.GsonModule;

public class MyApplication extends Application {
    @Inject
    GsonComponent mGsonComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mGsonComponent = DaggerGsonComponent.builder()
                .gsonModule(new GsonModule("https://api.github.com"))
                .build();

    }
    public static MyApplication get(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    public GsonComponent getGsonComponent() {
        return mGsonComponent;
    }

}
