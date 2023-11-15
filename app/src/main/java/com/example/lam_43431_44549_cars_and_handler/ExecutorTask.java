package com.example.lam_43431_44549_cars_and_handler;

import static java.lang.Thread.sleep;

import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;

public class ExecutorTask {
    ExecutorService executor;
    Handler resultHandler;
    TextView textView;
    ProgressBar progressBar;
    String jsonStr;


    public ExecutorTask(ExecutorService executor, Handler resultHandler, TextView textView, String url) {
        this.executor = executor;
        this.resultHandler = resultHandler;
        this.textView = textView;

        this.executor.execute(new Runnable() {
            @Override
            public void run() {
                doWork(url);
                atualizaInterface(jsonStr);
            }
        });
    }

    private void doWork(String url) {
        String jsonStr;
        HttpHandler handler;

        handler = new HttpHandler();
        jsonStr = handler.lerInformacao(url);
    }

    private void atualizaInterface(String mensagem) {

        resultHandler.post(new Runnable() {
            @Override
            public void run() {
                textView.setText(mensagem);
            }
        });
    }
}
