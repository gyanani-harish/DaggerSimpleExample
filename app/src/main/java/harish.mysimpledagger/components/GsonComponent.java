package harish.mysimpledagger.components;


import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;
import harish.mysimpledagger.MainActivity;
import harish.mysimpledagger.modules.GsonModule;

@Singleton
@Component(modules={GsonModule.class})
public interface GsonComponent {
    // downstream components need these exposed
    Gson gson();
    void inject(MainActivity activity);
}
