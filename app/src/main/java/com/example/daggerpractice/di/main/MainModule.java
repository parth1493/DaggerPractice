package com.example.daggerpractice.di.main;

import com.example.daggerpractice.network.main.MainApi;
import com.example.daggerpractice.ui.main.post.PostRecyclerAdapter;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @MainScope
    @Provides
    static PostRecyclerAdapter provideAdapter(){
        return new PostRecyclerAdapter();
    }

    @MainScope
    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }

}