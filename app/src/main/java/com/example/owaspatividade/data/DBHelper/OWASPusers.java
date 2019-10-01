package com.example.owaspatividade.data.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class OWASPusers extends SQLiteOpenHelper {

    //nome e versão do banco de dados
    private static final String DATABASE = "OWASPusers.db";
    private static final int DATABASE_VERSION = 1;

    public OWASPusers(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //Cria tabela de usuarios
        String criarTabela = "CREATE TABLE users (" +
                "    id_user  INTEGER       PRIMARY KEY AUTOINCREMENT" +
                "                           NOT NULL" +
                "                           UNIQUE," +
                "    users    VARCHAR (100) UNIQUE" +
                "                           NOT NULL," +
                "    password VARCHAR (15)  NOT NULL" +
                ");";
        db.execSQL(criarTabela);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Recria tabela se ela ja existe
        db.execSQL("DROP TABLE IF EXISTS OWASPusers.db");
        onCreate(db);
    }

    public void buscarUsers(){
        List<String> dados = new ArrayList<>();
        String sql = "SELECT * FROM users";
        int coluna = 1;
    }
}
