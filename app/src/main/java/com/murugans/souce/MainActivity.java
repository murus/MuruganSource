package com.murugans.souce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        doSomeWork();


    }

    /*private Observable<String> getObservable(){
        return new Observable.just("Criket,Footbal,bike") ;
    }*/

    private Observer<String>getObserver(){
        return new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {}

            @Override
            public void onNext(String s) {}

            @Override
            public void onError(Throwable e) {}

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };
    }

    private void doSomeWork(){

        /*getObservable()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(getObserver());*/
    }
}
