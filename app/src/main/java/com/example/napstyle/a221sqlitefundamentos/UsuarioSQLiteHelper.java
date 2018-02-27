package com.example.napstyle.a221sqlitefundamentos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Napstyle on 27/02/2018.
 */

public class UsuarioSQLiteHelper extends SQLiteOpenHelper {

    String sql="CREATE TABLE Alumno(Num_Control INTEGER,Nombre TEXT,Apellido TEXT)";
    public UsuarioSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){

        super(context,name,factory,version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS Alumno");
        db.execSQL(sql);
    }
}
